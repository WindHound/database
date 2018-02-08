import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import static com.sun.org.apache.xerces.internal.utils.SecuritySupport.getResourceAsStream;

public class Database {

    String hostname, sid, user, password, port;

    Database(String hostname, String port, String sid, String user, String password){
        this.hostname = hostname;
        this.port = port;
        this.sid = sid;
        this.user = user;
        this.password = password;
    }

    Database(String propertiesPath) {
        Properties prop = new Properties();
        InputStream input = getResourceAsStream(propertiesPath);

        try {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.hostname = prop.getProperty("hostname");
        this.port = prop.getProperty("port");
        this.sid = prop.getProperty("sid");
        this.user = prop.getProperty("user");
        this.password = prop.getProperty("password");
    }


    public ResultSet query(String query) {

        ResultSet rs = null;
        Object[][] array = null;
        Connection con;

        try{
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@"+ hostname + ":" + port +":"+ sid ,user ,password);

            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            ResultSetMetaData meta = rs.getMetaData();
            int cols = meta.getColumnCount();

            while(rs.next()) {

                for(int i=0; i<cols; i++) {
                    Object temp = rs.getObject(i+1);
                    System.out.print(temp + " ");
                }
                System.out.println(" ");
            }

            con.close();

        }catch(Exception e){ System.out.println(e);}

        return rs;
    }


}

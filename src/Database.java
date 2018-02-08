import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

import static com.sun.org.apache.xerces.internal.utils.SecuritySupport.getResourceAsStream;

public class Database {

    String hostname, sid, user, password, port;

    /**
     * Initialise from variables
     * @param hostname
     * @param port
     * @param sid
     * @param user
     * @param password
     */
    Database(String hostname, String port, String sid, String user, String password){
        this.hostname = hostname;
        this.port = port;
        this.sid = sid;
        this.user = user;
        this.password = password;
    }

    /**
     * Initialise from properties file
     * @param propertiesPath
     */
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
        Connection con;

        try{
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@"+ hostname + ":" + port +":"+ sid ,user ,password);

            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);

//            ResultSetMetaData meta = rs.getMetaData();
//            int cols = meta.getColumnCount();
//
//            while(rs.next()) {
//
//                for(int i=0; i<cols; i++) {
//                    Object temp = rs.getObject(i+1);
//                    System.out.print(temp + " ");
//                }
//                System.out.println(" ");
//            }
//
//            con.close();

        }catch(Exception e){ System.out.println(e);}

        return rs;
    }

    public ArrayList<Location> getLocationSet(String boatID, String raceID) throws SQLException {
        ArrayList<Location> locationSet = new ArrayList<>();
        Location temp = null;
        ResultSet rs = query("select * from LOCATION where BOAT_ID=" + boatID + " AND STAGE_ID=" + raceID);

        while(rs.next()) {
            try {
                temp = new Location(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        rs.getFloat(4), rs.getFloat(5), rs.getFloat(6),
                        rs.getFloat(7), rs.getFloat(8));
            } catch (SQLException e) {
                e.printStackTrace();
            }

            locationSet.add(temp);
        }

        return locationSet;
    }
}

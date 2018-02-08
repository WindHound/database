import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * Currently connects to our DB
 * Returns the contents of the HELP table (provided by default)
 *
 */
class Main {

    public static void main(String args[]) throws SQLException {

        Database db = new Database("config.properties");

        //ResultSet rs = db.query("select * from HELP");

        ArrayList<Location> loc = db.getLocationSet("1", "1");
        System.out.println(loc.get(0).getAccelerometer());
    }

}
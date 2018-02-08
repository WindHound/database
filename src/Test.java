import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 *
 * Currently connects to our DB
 * Returns the contents of the HELP table (provided by default)
 *
 */
class Test {
    public static void main(String args[]) throws FileNotFoundException {

        Database db = new Database("config.properties");

        ResultSet rs = db.query("select * from HELP");

    }

}
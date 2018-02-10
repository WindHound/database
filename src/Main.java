import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

class Main {

    public static void main(String args[]) throws SQLException {

        Database db = new Database("config.properties");

        //ResultSet rs = db.query("select * from HELP");

//        ArrayList<Location> loc = db.getLocationSet("1", "1");
//
//        for (Location l : loc) {
//            System.out.println(l.getLocationID() + " " + l.getLongitude());
//        }


        //Boat boat = new Boat(1, "Adam");
        //db.addBoat(boat);
        //Boat b = db.getBoat(1);

        db.deleteBoat(7);

    }

}
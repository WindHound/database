public class RaceRelation {

    private int RaceRelationID, RaceID, BoatID, UserID;

    public RaceRelation(int raceRelationID, int raceID, int boatID, int userID) {

        RaceRelationID = raceRelationID;
        RaceID = raceID;
        BoatID = boatID;
        UserID = userID;
    }


    //Getters
    public int getRaceRelationID() {
        return RaceRelationID;
    }

    public int getRaceID() {
        return RaceID;
    }

    public int getBoatID() {
        return BoatID;
    }

    public int getUserID() {
        return UserID;
    }


    //Setters
    public void setRaceRelationID(int raceRelationID) {
        RaceRelationID = raceRelationID;
    }

    public void setRaceID(int raceID) {
        RaceID = raceID;
    }

    public void setBoatID(int boatID) {
        BoatID = boatID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }
}

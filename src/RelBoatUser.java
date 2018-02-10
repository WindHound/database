public class RelBoatUser {

    private int rbuID, boatID, userID;

    public RelBoatUser(int rbuID, int boatID, int userID) {
        this.rbuID = rbuID;
        this.boatID = boatID;
        this.userID = userID;
    }

    public int getRbuID() {
        return rbuID;
    }

    public void setRbuID(int rbuID) {
        this.rbuID = rbuID;
    }

    public int getBoatID() {
        return boatID;
    }

    public void setBoatID(int boatID) {
        this.boatID = boatID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}

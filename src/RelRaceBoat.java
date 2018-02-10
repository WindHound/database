public class RelRaceBoat {

    private int rpbID, raceID, boatID;

    public RelRaceBoat(int rpbID, int raceID, int boatID) {
        this.rpbID = rpbID;
        this.raceID = raceID;
        this.boatID = boatID;
    }

    public int getRpbID() {
        return rpbID;
    }

    public void setRpbID(int rpbID) {
        this.rpbID = rpbID;
    }

    public int getRaceID() {
        return raceID;
    }

    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }

    public int getBoatID() {
        return boatID;
    }

    public void setBoatID(int boatID) {
        this.boatID = boatID;
    }
}

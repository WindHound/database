public class RelEventRace {

    private int rerID, eventID, raceID;

    public RelEventRace(int rerID, int eventID, int raceID) {
        this.rerID = rerID;
        this.eventID = eventID;
        this.raceID = raceID;
    }

    public int getRerID() {
        return rerID;
    }

    public void setRerID(int rerID) {
        this.rerID = rerID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getRaceID() {
        return raceID;
    }

    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }
}

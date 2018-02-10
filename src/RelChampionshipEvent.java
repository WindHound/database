public class RelChampionshipEvent {

    private int rceID, championshipID, eventID;

    public RelChampionshipEvent(int rceID, int championshipID, int eventID) {
        this.rceID = rceID;
        this.championshipID = championshipID;
        this.eventID = eventID;
    }

    public int getRceID() {
        return rceID;
    }

    public void setRceID(int rceID) {
        this.rceID = rceID;
    }

    public int getChampionshipID() {
        return championshipID;
    }

    public void setChampionshipID(int championshipID) {
        this.championshipID = championshipID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }
}

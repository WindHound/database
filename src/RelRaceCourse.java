public class RelRaceCourse {

    private int rrcID, courseID, raceID, raceClass;

    public RelRaceCourse(int rrcID, int courseID, int raceID, int raceClass) {
        this.rrcID = rrcID;
        this.courseID = courseID;
        this.raceID = raceID;
        this.raceClass = raceClass;
    }

    public int getRrcID() {
        return rrcID;
    }

    public void setRrcID(int rrcID) {
        this.rrcID = rrcID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getRaceID() {
        return raceID;
    }

    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }

    public int getRaceClass() {
        return raceClass;
    }

    public void setRaceClass(int raceClass) {
        this.raceClass = raceClass;
    }
}

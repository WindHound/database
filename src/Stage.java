public class Stage {

    private int stageID;
    private String name, startTime, endTime, admin, type;

    public Stage(int stageID, String name, String startTime, String endTime, String admin, String type) {

        this.stageID = stageID;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.admin = admin;
        this.type = type;
    }

    //Getters
    public int getStageID() {
        return stageID;
    }

    public String getName() {
        return name;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getAdmin() {
        return admin;
    }

    public String getType() {
        return type;
    }


    //Setters
    public void setStageID(int stageID) {
        this.stageID = stageID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setType(String type) {
        this.type = type;
    }


}

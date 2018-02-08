public class StageRelation {

    private int StageRelationID, StageID, relative;
    private String relation;

    public StageRelation(int stageRelationID, int stageID, int relative, String relation) {
        StageRelationID = stageRelationID;
        StageID = stageID;
        this.relative = relative;
        this.relation = relation;
    }

    //Getters
    public int getStageRelationID() {
        return StageRelationID;
    }

    public int getStageID() {
        return StageID;
    }

    public int getRelative() {
        return relative;
    }

    public String getRelation() {
        return relation;
    }


    //Setters
    public void setStageRelationID(int stageRelationID) {
        StageRelationID = stageRelationID;
    }

    public void setStageID(int stageID) {
        StageID = stageID;
    }

    public void setRelative(int relative) {
        this.relative = relative;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

}

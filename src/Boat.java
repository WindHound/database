public class Boat {

    private int boatID, sailNo, displacement;
    private float length, beam, draft, gph, offshoreToD, offshoreToT, offshoreTnoL, offshoreTnoM, offshoreTnoH, inshoreToD,
            inshoreToT, inshoreTnoL, inshoreTnoM, inshoreTnoH;
    private String name, skipper, boatClass, type;

    //Mandatory fields only
    public Boat(int boatID, float gph, float offshoreToD, float offshoreToT, float offshoreTnoL, float offshoreTnoM,
                float offshoreTnoH, float inshoreToD, float inshoreToT, float inshoreTnoL, float inshoreTnoM,
                float inshoreTnoH, String skipper, String boatClass, String type) {
        this.boatID = boatID;
        this.gph = gph;
        this.offshoreToD = offshoreToD;
        this.offshoreToT = offshoreToT;
        this.offshoreTnoL = offshoreTnoL;
        this.offshoreTnoM = offshoreTnoM;
        this.offshoreTnoH = offshoreTnoH;
        this.inshoreToD = inshoreToD;
        this.inshoreToT = inshoreToT;
        this.inshoreTnoL = inshoreTnoL;
        this.inshoreTnoM = inshoreTnoM;
        this.inshoreTnoH = inshoreTnoH;
        this.skipper = skipper;
        this.boatClass = boatClass;
        this.type = type;
    }

    //All parameters
    public Boat(int boatID, int sailNo, int displacement, float length, float beam, float draft, float gph,
                float offshoreToD, float offshoreToT, float offshoreTnoL, float offshoreTnoM, float offshoreTnoH,
                float inshoreToD, float inshoreToT, float inshoreTnoL, float inshoreTnoM, float inshoreTnoH,
                String name, String skipper, String boatClass, String type) {
        this.boatID = boatID;
        this.sailNo = sailNo;
        this.displacement = displacement;
        this.length = length;
        this.beam = beam;
        this.draft = draft;
        this.gph = gph;
        this.offshoreToD = offshoreToD;
        this.offshoreToT = offshoreToT;
        this.offshoreTnoL = offshoreTnoL;
        this.offshoreTnoM = offshoreTnoM;
        this.offshoreTnoH = offshoreTnoH;
        this.inshoreToD = inshoreToD;
        this.inshoreToT = inshoreToT;
        this.inshoreTnoL = inshoreTnoL;
        this.inshoreTnoM = inshoreTnoM;
        this.inshoreTnoH = inshoreTnoH;
        this.name = name;
        this.skipper = skipper;
        this.boatClass = boatClass;
        this.type = type;
    }


    //Getters
    public int getBoatID() {
        return boatID;
    }

    public int getSailNo() {
        return sailNo;
    }

    public int getDisplacement() {
        return displacement;
    }

    public float getLength() {
        return length;
    }

    public float getBeam() {
        return beam;
    }

    public float getDraft() {
        return draft;
    }

    public float getGph() {
        return gph;
    }

    public float getOffshoreToD() {
        return offshoreToD;
    }

    public float getOffshoreToT() {
        return offshoreToT;
    }

    public float getOffshoreTnoL() {
        return offshoreTnoL;
    }

    public float getOffshoreTnoM() {
        return offshoreTnoM;
    }

    public float getOffshoreTnoH() {
        return offshoreTnoH;
    }

    public float getInshoreToD() {
        return inshoreToD;
    }

    public float getInshoreToT() {
        return inshoreToT;
    }

    public float getInshoreTnoL() {
        return inshoreTnoL;
    }

    public float getInshoreTnoM() {
        return inshoreTnoM;
    }

    public float getInshoreTnoH() {
        return inshoreTnoH;
    }

    public String getName() {
        return name;
    }

    public String getSkipper() {
        return skipper;
    }

    public String getBoatClass() {
        return boatClass;
    }

    public String getType() {
        return type;
    }


    //Setters
    public void setBoatID(int boatID) {
        this.boatID = boatID;
    }

    public void setSailNo(int sailNo) {
        this.sailNo = sailNo;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setBeam(float beam) {
        this.beam = beam;
    }

    public void setDraft(float draft) {
        this.draft = draft;
    }

    public void setGph(float gph) {
        this.gph = gph;
    }

    public void setOffshoreToD(float offshoreToD) {
        this.offshoreToD = offshoreToD;
    }

    public void setOffshoreToT(float offshoreToT) {
        this.offshoreToT = offshoreToT;
    }

    public void setOffshoreTnoL(float offshoreTnoL) {
        this.offshoreTnoL = offshoreTnoL;
    }

    public void setOffshoreTnoM(float offshoreTnoM) {
        this.offshoreTnoM = offshoreTnoM;
    }

    public void setOffshoreTnoH(float offshoreTnoH) {
        this.offshoreTnoH = offshoreTnoH;
    }

    public void setInshoreToD(float inshoreToD) {
        this.inshoreToD = inshoreToD;
    }

    public void setInshoreToT(float inshoreToT) {
        this.inshoreToT = inshoreToT;
    }

    public void setInshoreTnoL(float inshoreTnoL) {
        this.inshoreTnoL = inshoreTnoL;
    }

    public void setInshoreTnoM(float inshoreTnoM) {
        this.inshoreTnoM = inshoreTnoM;
    }

    public void setInshoreTnoH(float inshoreTnoH) {
        this.inshoreTnoH = inshoreTnoH;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkipper(String skipper) {
        this.skipper = skipper;
    }

    public void setBoatClass(String boatClass) {
        this.boatClass = boatClass;
    }

    public void setType(String type) {
        this.type = type;
    }
}


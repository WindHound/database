public class Boat {

    private int boatID, sailNo, displacement;
    private double length, beam, draft, gph, offshoreToD, offshoreToT, offshoreTnoL, offshoreTnoM, offshoreTnoH, inshoreToD,
            inshoreToT, inshoreTnoL, inshoreTnoM, inshoreTnoH;
    private String name, skipper, boatClass, type;

    //Minimal - for testing
    public Boat(int sailNo, String name) {
        this.sailNo = sailNo;
        this.name = name;
    }

    //Mandatory fields only
    public Boat(double gph, double offshoreToD, double offshoreToT, double offshoreTnoL, double offshoreTnoM,
                double offshoreTnoH, double inshoreToD, double inshoreToT, double inshoreTnoL, double inshoreTnoM,
                double inshoreTnoH, String skipper, String boatClass, String type) {

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
    public Boat(String name, String skipper, int sailNo, int displacement, double length, double beam, double draft, String boatClass, String type,
                double gph, double offshoreToD, double offshoreToT, double offshoreTnoL, double offshoreTnoM, double offshoreTnoH,
                double inshoreToD, double inshoreToT, double inshoreTnoL, double inshoreTnoM, double inshoreTnoH) {

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

    public double getLength() {
        return length;
    }

    public double getBeam() {
        return beam;
    }

    public double getDraft() {
        return draft;
    }

    public double getGph() {
        return gph;
    }

    public double getOffshoreToD() {
        return offshoreToD;
    }

    public double getOffshoreToT() {
        return offshoreToT;
    }

    public double getOffshoreTnoL() {
        return offshoreTnoL;
    }

    public double getOffshoreTnoM() {
        return offshoreTnoM;
    }

    public double getOffshoreTnoH() {
        return offshoreTnoH;
    }

    public double getInshoreToD() {
        return inshoreToD;
    }

    public double getInshoreToT() {
        return inshoreToT;
    }

    public double getInshoreTnoL() {
        return inshoreTnoL;
    }

    public double getInshoreTnoM() {
        return inshoreTnoM;
    }

    public double getInshoreTnoH() {
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

    public void setLength(double length) {
        this.length = length;
    }

    public void setBeam(double beam) {
        this.beam = beam;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public void setGph(double gph) {
        this.gph = gph;
    }

    public void setOffshoreToD(double offshoreToD) {
        this.offshoreToD = offshoreToD;
    }

    public void setOffshoreToT(double offshoreToT) {
        this.offshoreToT = offshoreToT;
    }

    public void setOffshoreTnoL(double offshoreTnoL) {
        this.offshoreTnoL = offshoreTnoL;
    }

    public void setOffshoreTnoM(double offshoreTnoM) {
        this.offshoreTnoM = offshoreTnoM;
    }

    public void setOffshoreTnoH(double offshoreTnoH) {
        this.offshoreTnoH = offshoreTnoH;
    }

    public void setInshoreToD(double inshoreToD) {
        this.inshoreToD = inshoreToD;
    }

    public void setInshoreToT(double inshoreToT) {
        this.inshoreToT = inshoreToT;
    }

    public void setInshoreTnoL(double inshoreTnoL) {
        this.inshoreTnoL = inshoreTnoL;
    }

    public void setInshoreTnoM(double inshoreTnoM) {
        this.inshoreTnoM = inshoreTnoM;
    }

    public void setInshoreTnoH(double inshoreTnoH) {
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


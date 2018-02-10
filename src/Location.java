public class Location {

    private int locationID, raceID, userID;
    private float longitude, latitude, accelerometer, gyro, compass;

    public Location(int raceID, int userID, float longitude, float latitude, float accelerometer,
                    float gyro, float compass, int locationID) {

        this.locationID = locationID;
        this.raceID = raceID;
        this.userID = userID;
        this.longitude = longitude;
        this.latitude = latitude;
        this.accelerometer = accelerometer;
        this.gyro = gyro;
        this.compass = compass;
    }

    //Getters
    public int getLocationID() {
        return locationID;
    }

    public int getRaceID() {
        return raceID;
    }

    public int getUserID() {
        return userID;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getAccelerometer() {
        return accelerometer;
    }

    public float getGyro() {
        return gyro;
    }

    public float getCompass() {
        return compass;
    }


    //Setters
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setAccelerometer(float accelerometer) {
        this.accelerometer = accelerometer;
    }

    public void setGyro(float gyro) {
        this.gyro = gyro;
    }

    public void setCompass(float compass) {
        this.compass = compass;
    }
}

public class Ride {
    private double distance;
    private Vehicle vehicle;
    private int hour;

    public Ride(double distance, Vehicle vehicle, int hour) {
        this.distance = distance;
        this.vehicle = vehicle;
        this.hour = hour;
    }

    public double getDistance() {
        return distance;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getHour() {
        return hour;
    }
}
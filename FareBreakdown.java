public class FareBreakdown {
    double baseFare;
    double distanceCharge;
    double vehicleMultiplier;
    double surgeMultiplier;
    double finalFare;
    String vehicleType;
    int capacity;
    


    public FareBreakdown(double baseFare, double distanceCharge,
                         double vehicleMultiplier, double surgeMultiplier,
                         double finalFare, String vehicleType, int capacity) {
        this.baseFare = baseFare;
        this.distanceCharge = distanceCharge;
        this.vehicleMultiplier = vehicleMultiplier;
        this.surgeMultiplier = surgeMultiplier;
        this.finalFare = finalFare;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Base Fare: Rs." + baseFare);
        System.out.println("Distance Charge: Rs." + distanceCharge);
        System.out.println("Vehicle Multiplier: " + vehicleMultiplier);
        System.out.println("Surge Multiplier: " + surgeMultiplier);
        System.out.println("Final Fare: Rs." + finalFare);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Max Capacity: " + capacity + " people");
    }
}
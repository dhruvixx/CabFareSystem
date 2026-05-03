import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter vehicle (auto/bike/car): ");
        String type = sc.next();

        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();

        // Factory creates object
        Vehicle vehicle = VehicleFactory.getVehicle(type);

        Ride ride = new Ride(distance, vehicle, hour);

        FareCalculator calculator = new FareCalculator();
        FareBreakdown result = calculator.calculateFare(ride);

        System.out.println("\n--- Fare Breakdown ---");
        result.display();
        
        sc.close();
    }
}
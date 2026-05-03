public class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("bike")) return new Bike();
        if (type.equalsIgnoreCase("auto")) return new Auto();
        if (type.equalsIgnoreCase("car")) return new Car();

        throw new IllegalArgumentException("Invalid vehicle type");
    }
}
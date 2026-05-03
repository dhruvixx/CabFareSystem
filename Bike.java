public class Bike implements Vehicle {

    @Override
    public double getMultiplier() {
        return 0.8;  // cheapest
    }

    @Override
    public String getType() {
        return "Bike";
    }

    @Override
    public int getCapacity() {
        return 1;
    }
}
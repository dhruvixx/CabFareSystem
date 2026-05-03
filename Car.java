public class Car implements Vehicle {

    @Override
    public double getMultiplier() {
        return 1.3;  // higher comfort
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public int getCapacity() {
        return 4;
    }
}
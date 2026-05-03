public class Auto implements Vehicle {

    @Override
    public double getMultiplier() {
        return 1.0;
    }

    @Override
    public String getType() {
        return "Auto";
    }

    @Override
    public int getCapacity() {
        return 3;
    }
}
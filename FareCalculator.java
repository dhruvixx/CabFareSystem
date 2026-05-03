public class FareCalculator {

    public FareBreakdown calculateFare(Ride ride) {

        double baseFare = 50;
        double perKmRate = 10;

        double distanceCharge = ride.getDistance() * perKmRate;
        double fare = baseFare + distanceCharge;

        // Vehicle polymorphism
        double vehicleMultiplier = ride.getVehicle().getMultiplier();
        fare *= vehicleMultiplier;

        // Strategy pattern here 👇
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(ride.getHour());
        double surgeMultiplier = strategy.getSurgeMultiplier(ride.getHour());

        fare *= surgeMultiplier;

        if (fare < 80) fare = 80;

        return new FareBreakdown(
                baseFare,
                distanceCharge,
                vehicleMultiplier,
                surgeMultiplier,
                Math.round(fare),
                ride.getVehicle().getType(),
                ride.getVehicle().getCapacity()
        );
    }
}
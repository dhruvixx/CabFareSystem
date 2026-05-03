public class PeakHourPricing implements PricingStrategy {

    @Override
    public double getSurgeMultiplier(int hour) {
        if ((hour >= 8 && hour <= 11) || (hour >= 17 && hour <= 21)) {
            return 1.5;
        }
        return 1.0;
    }
}
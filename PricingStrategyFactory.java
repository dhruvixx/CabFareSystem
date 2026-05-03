public class PricingStrategyFactory {

    public static PricingStrategy getStrategy(int hour) {

        if ((hour >= 8 && hour <= 11) || (hour >= 17 && hour <= 21)) {
            return new PeakHourPricing();
        }

        return new NormalPricing();
    }
}
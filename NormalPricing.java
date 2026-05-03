public class NormalPricing implements PricingStrategy {

    @Override
    public double getSurgeMultiplier(int hour) {
        return 1.0;
    }
}
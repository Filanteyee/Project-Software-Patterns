package Task3;

public class FixedPricing implements PricingStrategy {
    @Override
    public double calculateCost(double distance, double time) {
        return 20; // Flat rate
    }
}

package Task3;

public class TimeBasedPricing implements PricingStrategy {
    @Override
    public double calculateCost(double distance, double time) {
        return time * 0.5; // $0.50 per minute
    }
}


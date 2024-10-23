package Task3;

public class DistanceBasedPricing implements PricingStrategy {
    @Override
    public double calculateCost(double distance, double time) {
        return distance * 2; // $2 per km
    }
}

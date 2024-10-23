package Task3;

public class TaxiOrder {
    private PricingStrategy pricingStrategy;

    public TaxiOrder(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTripCost(double distance, double time) {
        return pricingStrategy.calculateCost(distance, time);
    }
}

package Task3;

public class Main {
    public static void main(String[] args) {
        double distance = 10; // Distance in kilometers
        double time = 30;     // Time in minutes

        // Use distance-based pricing strategy
        TaxiOrder order1 = new TaxiOrder(new DistanceBasedPricing());
        System.out.println("Cost (distance-based): $" + order1.calculateTripCost(distance, time));

        // Use time-based pricing strategy
        TaxiOrder order2 = new TaxiOrder(new TimeBasedPricing());
        System.out.println("Cost (time-based): $" + order2.calculateTripCost(distance, time));

        // Use fixed-price strategy
        TaxiOrder order3 = new TaxiOrder(new FixedPricing());
        System.out.println("Cost (fixed-price): $" + order3.calculateTripCost(distance, time));
    }
}

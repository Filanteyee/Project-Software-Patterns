package Task4;

public class TaxiOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Checking taxi availability...");
    }

    @Override
    protected double calculateCost() {
        System.out.println("Calculating cost for the trip...");
        return 50; // Example cost
    }

    @Override
    protected void confirmOrder(double cost) {
        System.out.println("Order confirmed! The cost is $" + cost);
    }
}


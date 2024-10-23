package Task4;

public abstract class OrderProcess {
    // Template method defining the steps to process an order
    public final void processOrder() {
        checkAvailability();
        double cost = calculateCost();
        confirmOrder(cost);
    }

    // Abstract steps to be implemented by subclasses
    protected abstract void checkAvailability();
    protected abstract double calculateCost();
    protected abstract void confirmOrder(double cost);
}


package Task2;

public class FinishedState implements OrderState {
    @Override
    public void handle(OrderContext order) {
        System.out.println("Order is 'Finished'.");
        // No further transitions
    }
}
package Task2;

public class CreatedState implements OrderState {
    public void handle(OrderContext order) {
        System.out.println("Order is in 'Created' state.");
        order.setState(new ConfirmedState()); // Transition to confirmed state
    }
}

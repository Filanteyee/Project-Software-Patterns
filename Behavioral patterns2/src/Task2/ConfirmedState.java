package Task2;

public class ConfirmedState implements OrderState {
    public void handle(OrderContext order) {
        System.out.println("Order is in 'Confirmed' state.");
        order.setState(new OnTheWayState()); // Transition to on the way state
    }
}

package Task2;

public class OnTheWayState implements OrderState {
    public void handle(OrderContext order) {
        System.out.println("Taxi is 'On the Way'.");
        order.setState(new FinishedState()); // Transition to finished state
    }
}

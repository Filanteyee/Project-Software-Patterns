package Task2;

public class OrderContext {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
        state.handle(this); // Handle the state change
    }
}

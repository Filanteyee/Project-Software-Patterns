package Task2;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.setState(new CreatedState());
    }
}

package Task1;
public class Main {
        public static void main(String[] args) {

            Order order = new Order();

            Client client1 = new Client("Nursultan");
            Client client2 = new Client("Dias");

            order.attach(client1);
            order.attach(client2);

            order.setState("Taxi is approaching");
            order.setState("Order is confirmed");
        }
    }

package Task1;

    public class Client implements Observer {
        private String name;

        public Client(String name) {
            this.name = name;
        }

        @Override
        public void update(String state) {
            System.out.println(name + ", your order status is now: " + state);
        }
    }

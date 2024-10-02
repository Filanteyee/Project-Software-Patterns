package task5.Abstart_Factory;

public class Main {
    public static void main(String[] args) {
        Factory standardFactory = new StandardFactory();
        Taxi standardTaxi = standardFactory.createTaxi("XYZ12345");
        standardTaxi.takePassenger("Alice");

        Factory premiumFactory = new PremiumFactory();
        Taxi premiumTaxi = premiumFactory.createTaxi("XYZ67890");
        premiumTaxi.takePassenger("Bob");
    }
}

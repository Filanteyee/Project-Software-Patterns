package task4.Factory;

public class Main {
    public static void main(String[] args) {
        Factory standardFactory = new StandardTaxiFactory();
        Taxi standardTaxi = standardFactory.createTaxi("Daniele", "XYZ12345");
        standardTaxi.takePassenger("Alice");

        Factory premiumFactory = new PremiumTaxiFactory();
        Taxi premiumTaxi = premiumFactory.createTaxi("Daniele", "XYZ12345");
        premiumTaxi.takePassenger("Bob");
    }
}
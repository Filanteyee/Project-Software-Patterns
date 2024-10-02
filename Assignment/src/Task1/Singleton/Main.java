package Task1.Singleton;

public class Main {
    public static void main(String[] args) {
        DriverManager driverManager = DriverManager.getInstance();

        String nearestDriver = driverManager.findNearestDriver("Location A");

        System.out.println("Nearest driver: " + nearestDriver);

        }
    }
package task5.Abstart_Factory;

public abstract class Factory {
    public abstract Taxi createTaxi(String license);
    public abstract Driver createDriver(String name);
}

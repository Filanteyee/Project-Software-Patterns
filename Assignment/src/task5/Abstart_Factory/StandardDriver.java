package task5.Abstart_Factory;

public class StandardDriver extends Driver {

    public StandardDriver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Standard driver " + name + " is driving.");
    }
}
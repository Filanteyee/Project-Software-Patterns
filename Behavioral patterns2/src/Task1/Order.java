package Task1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    // Attach observer (subscribe)
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Notify all observers
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    // Update order state and notify observers
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}

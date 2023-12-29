package Observer;

import java.util.*;

public class Order implements Observable{
    
    private String position;
    private String destination;
    private int timeBeforeArrival;
    private List<Observer> observers = new ArrayList<>();


    public String getPosition() {
        return this.position;
    }
    public String getDestination() {
        return this.destination;
    }
    public int getTimeBeforeArrival() {
        return this.timeBeforeArrival;
    }

    public void setData(String position_, String destination_, int timeBeforeArrival_) {
        this.position = position_;
        this.destination = destination_;
        this.timeBeforeArrival = timeBeforeArrival_;
        notifyObservers();
    }


    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public boolean notifyObservers() {
        if (observers.isEmpty()) return false;

        for (Observer observer : observers) {
            observer.update(this);
        }
        return true;
    }
}

package StockSimulator;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }
    public synchronized void setIbmPrice(double ibmPrice){
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }
    public synchronized void setAaplPrice(double aaplPrice){
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }
    public synchronized void setGoogPrice(double googPrice){
        this.googPrice = googPrice;
        notifyObservers();
    }


}

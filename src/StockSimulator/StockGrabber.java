package StockSimulator;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private String updated;

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
            observer.update();
        }
    }
    public synchronized void setIbmPrice(double ibmPrice){
        this.ibmPrice = ibmPrice;
        updated = StockNames.IBM_NAME.getName();
        notifyObservers();
    }
    public synchronized void setAaplPrice(double aaplPrice){
        this.aaplPrice = aaplPrice;
        updated = StockNames.AAPL_NAME.getName();
        notifyObservers();
    }
    public synchronized void setGoogPrice(double googPrice){
        this.googPrice = googPrice;
        updated = StockNames.GOOG_NAME.getName();
        notifyObservers();
    }
    public double getIbmPrice(){
        return ibmPrice;
    }
    public double getAaplPrice(){
        return aaplPrice;
    }
    public double getGoogPrice(){
        return googPrice;
    }
    public String getUpdated(){return updated;}

}

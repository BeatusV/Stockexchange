package StockSimulator;

/**
 * A subject contains the list of observers. It can register new Observers an unregister old ones.
 * Als it is able to notify ALL observers at once.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers();
}

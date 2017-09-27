package StockSimulator.Observers;

import StockSimulator.Dictionary.StockNames;
import StockSimulator.StockGrabber;
import StockSimulator.StockModel;
import StockSimulator.Views.GOOGTableView;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 * Created by peter on 25-9-17.
 */
public class GoogObserver implements Observer {
    private GOOGTableView view;
    private static int observerIDTracker = 0;
    private int observerID;
    private StockGrabber stockGrabber;

    public GoogObserver(StockGrabber stockGrabber, GOOGTableView view) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        this.view = view;
        stockGrabber.register(this);
        System.out.println("New Observer " + this.observerID);
    }

    @Override
    public void update() {
        if (stockGrabber.getUpdated().equals(StockNames.GOOG_NAME.getName())) {
            view.updateView(stockGrabber.getAaplPrice());
        }
    }
}

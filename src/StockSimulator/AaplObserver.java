package StockSimulator;

import StockSimulator.Views.AAPLTableView;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 * Created by peter on 25-9-17.
 */
public class AaplObserver implements Observer{
    private AAPLTableView view;
    private static int observerIDtracker = 0;
    private int observerID;
    private StockGrabber stockGrabber;

    public AaplObserver(StockGrabber stockGrabber, AAPLTableView view){
        this.stockGrabber = stockGrabber;
        this.observerID = ++ observerIDtracker;
        this.view = view;
        stockGrabber.register(this);
        System.out.println("New Observer " +this.observerID);
    }

    @Override
    public void update() {
        view.updateView(stockGrabber.getAaplPrice());
    }
}

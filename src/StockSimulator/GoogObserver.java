package StockSimulator;

import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 * Created by peter on 25-9-17.
 */
public class GoogObserver implements Observer {
    private double googPrice;
    private TableView tableView;
    private static int observerIDTracker = 0;
    private int observerID;
    private StockGrabber stockGrabber;

    public GoogObserver(StockGrabber stockGrabber, TableView tableView){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        this.tableView = tableView;
        stockGrabber.register(this);
        System.out.println("New Observer " + this.observerID);
    }
    @Override
    public void update(){
        this.googPrice = stockGrabber.getGoogPrice();
        printThePrices();
        updateTableView();
    }
    private void updateTableView() {
        ObservableList<StockModel> data = tableView.getItems();
        if(data.size() > 0) {
            StockModel latestRow = data.get(data.size() - 1);
            data.add(new StockModel(latestRow.getIBM(), latestRow.getAAPL(), googPrice));
        }
        else {
            data.add(new StockModel(0.0, 0.0, googPrice));
        }
    }
    private void printThePrices(){
        System.out.println(observerID + "\nGOOG:" + googPrice + "\n");
    }
}

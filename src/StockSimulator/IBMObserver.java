package StockSimulator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;


public class IBMObserver implements Observer{
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private TableView tableView;
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public IBMObserver(Subject stockGrabber, TableView tableView){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        this.tableView = tableView;
        stockGrabber.register(this);
        System.out.println("New Observer " + this.observerID);

    }
    @Override
    public void update(double ibmPrice, double aaplPrice, double gooPrice) {
        ObservableList<StockModel> data = tableView.getItems();
        printThePrices();
        data.add(new StockModel(ibmPrice, aaplPrice, gooPrice));
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = gooPrice;
    }

    private void printThePrices(){

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}

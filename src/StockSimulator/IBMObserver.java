package StockSimulator;

import StockSimulator.Models.IbmStockDataModel;
import StockSimulator.Views.IBMTableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;


public class IBMObserver implements Observer{
    private IBMTableView view;
    private static int observerIDTracker = 0;
    private int observerID;
    private StockGrabber stockGrabber;

    public IBMObserver(StockGrabber stockGrabber, IBMTableView view){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        this.view = view;
        stockGrabber.register(this);
        System.out.println("New Observer " + this.observerID);

    }
    @Override
    public void update(){
        if(stockGrabber.getUpdated().equals(StockNames.IBM_NAME.getName())){
            view.updateView(stockGrabber.getIbmPrice());
        }
        //        printThePrices();

    }
//    //private void printThePrices(){
//        System.out.println(observerID + "\nIBM: " + ibmPrice + "\n");
//    }


}

package StockSimulator.Observers;

import StockSimulator.StockGrabber;
import StockSimulator.Dictionary.StockNames;
import StockSimulator.Views.AAPLTableView;

/**
 * Created by peter on 25-9-17.
 */
public class AaplObserver implements Observer {
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
        if(stockGrabber.getUpdated().equals(StockNames.AAPL_NAME.getName())){
            view.updateView(stockGrabber.getAaplPrice());
        }
    }
}

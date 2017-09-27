package StockSimulator.Observers;

import StockSimulator.StockGrabber;
import StockSimulator.Dictionary.StockNames;
import StockSimulator.Views.AAPLGraphView;
import StockSimulator.Views.AAPLTableView;

/**
 * Created by peter on 25-9-17.
 */
public class AaplObserver implements Observer {
    //TODO: Make a 'list of views and iterate to update'
    private AAPLTableView view;
    private AAPLGraphView graphView;
    private static int observerIDtracker = 0;
    private int observerID;
    private StockGrabber stockGrabber;

    public AaplObserver(StockGrabber stockGrabber, AAPLTableView view, AAPLGraphView graphView){
        this.stockGrabber = stockGrabber;
        this.observerID = ++ observerIDtracker;
        this.view = view;
        this.graphView = graphView;
        stockGrabber.register(this);
        System.out.println("New Observer " +this.observerID);
    }

    @Override
    public void update() {
        if(stockGrabber.getUpdated().equals(StockNames.AAPL_NAME.getName())){
            view.updateView(stockGrabber.getAaplPrice());
            graphView.updateView(stockGrabber.getAaplPrice());
        }
    }
}

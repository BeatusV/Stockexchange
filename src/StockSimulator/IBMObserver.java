package StockSimulator;

public class IBMObserver implements Observer{
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public IBMObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        stockGrabber.register(this);

        System.out.println("New Observer " + this.observerID);
    }
    @Override
    public void update(double ibmPrice, double aaplPrice, double gooPrice) {

            printThePrices();  this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = gooPrice;
    }

    public void printThePrices(){

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}

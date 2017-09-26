package StockSimulator;

import StockSimulator.Dictionary.StockNames;

public class GetTheStock implements Runnable {
    private String name;
    private double price;
    private StockGrabber subject;
    public GetTheStock(double price, StockGrabber subject, String name){
        this.price = price;
        this.subject = subject;
        this.name = name;
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(2000);
                double randNum = (Math.random() * (.1)) - .05;
                price = (price + randNum);
                //Update proper name
                if(name.equals(StockNames.IBM_NAME.getName())){
                    subject.setIbmPrice(price);
                }
                else if(name.equals(StockNames.AAPL_NAME.getName())){
                    subject.setAaplPrice(price);
                }
                else if(name.equals(StockNames.GOOG_NAME.getName())){
                    subject.setGoogPrice(price);
                }
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }

    }

}

package StockSimulator;

import javafx.beans.property.SimpleDoubleProperty;

public class StockModel {
    private final SimpleDoubleProperty IBM = new SimpleDoubleProperty();
    private final SimpleDoubleProperty AAPL = new SimpleDoubleProperty();
    private final SimpleDoubleProperty GOOG = new SimpleDoubleProperty();

    public StockModel(){
        this(0.0,0.0,0.0);
    }

    public StockModel(Double ibm, Double aapl, Double goog){
        setIbm(ibm);
        setAapl(aapl);
        setGoog(goog);
    }

    public double getIbm(){
        return IBM.get();
    }

    public void setIbm(double ibm){
        IBM.set(ibm);
    }
    public double getAapl(){
        return AAPL.get();
    }

    public void setAapl(double aapl){
        AAPL.set(aapl);
    }

    public double getGoog(){
        return GOOG.get();
    }
    public void setGoog(double goog){
        GOOG.set(goog);
    }


}

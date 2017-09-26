package StockSimulator;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public  class StockModel {
    private final SimpleDoubleProperty IBM = new SimpleDoubleProperty();
    private final SimpleDoubleProperty AAPL = new SimpleDoubleProperty();
    private final SimpleDoubleProperty GOOG = new SimpleDoubleProperty();

    public StockModel(){
        this(0.0, 0.0, 0.0);
    }

    public StockModel(double ibm, double aapl, double goog){
        setIbm(ibm);
        setAapl(aapl);
        setGoog(goog);
    }

    public double getIBM(){
        return IBM.get();
    }

    public void setIbm(double ibm){
            }
    public double getAAPL(){
        return AAPL.get();
    }

    public void setAapl(double aapl){
        Double number = new Double(aapl);

        AAPL.set(number);
    }
    public double getGOOG(){
        return GOOG.get();
    }
    public void setGoog(double goog){
        Double number = new Double(goog);
        GOOG.set(number);
    }


}
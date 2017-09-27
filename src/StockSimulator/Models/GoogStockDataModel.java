package StockSimulator.Models;

import javafx.beans.property.SimpleDoubleProperty;

/**
 * Created by peter on 27-9-17.
 */
public class GoogStockDataModel {
    private final SimpleDoubleProperty GOOG = new SimpleDoubleProperty();

    public GoogStockDataModel(double ibm) {
        setGOOG(ibm);
    }

    public Double getGOOG() {
        return GOOG.get();
    }

    private void setGOOG(double ibm){
        Double number = new Double(ibm);
        GOOG.set(number);
    }
}

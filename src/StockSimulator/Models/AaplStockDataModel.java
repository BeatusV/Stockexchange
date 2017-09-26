package StockSimulator.Models;

import javafx.beans.property.SimpleDoubleProperty;

/**
 * Created by peter on 26-9-17.
 */
public class AaplStockDataModel {
    private final SimpleDoubleProperty AAPL = new SimpleDoubleProperty();

    public AaplStockDataModel(double aapl) {
        setAAPL(aapl);
    }

    public Double getAAPL() {
        return AAPL.get();
    }

    private void setAAPL(double aapl){
        Double number = new Double(aapl);
        AAPL.set(number);
    }
}

package StockSimulator.Models;

import javafx.beans.property.SimpleDoubleProperty;

/**
 * Created by peter on 26-9-17.
 */
public class IbmStockDataModel {
    private final SimpleDoubleProperty IBM = new SimpleDoubleProperty();

    public IbmStockDataModel(double ibm) {
        setIBM(ibm);
    }

    public Double getIBM() {
        return IBM.get();
    }

    private void setIBM(double ibm){
        Double number = new Double(ibm);
        IBM.set(number);
    }
}

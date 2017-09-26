package StockSimulator;

import javax.print.DocFlavor;

/**
 * Enum to keep stocknames
 */
public enum StockNames {
        IBM_NAME("IBM"),
        AAPL_NAME("AAPLE"),
        GOOG_NAME("GOOG");

        private String name;

        StockNames(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }
}


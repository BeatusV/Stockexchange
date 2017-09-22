package StockSimulator;

import javax.print.DocFlavor;

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


package StockSimulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StockApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StockGrabber stockGrabber = new StockGrabber();
        IBMObserver observer1 = new IBMObserver(stockGrabber);
        GetTheStock appl = new GetTheStock(20.05, stockGrabber, StockNames.AAPL_NAME.getName());
        GetTheStock goog = new GetTheStock(20.00, stockGrabber, StockNames.GOOG_NAME.getName());
        GetTheStock ibm = new GetTheStock(20.00, stockGrabber, StockNames.IBM_NAME.getName());
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
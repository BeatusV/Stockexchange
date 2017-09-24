package StockSimulator;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static javafx.fxml.FXMLLoader.load;

public class StockApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "main.fxml"
                )
        );

        Parent root = loader.load();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Controller controller = loader.<Controller>getController();
        GridPane tablePane = FXMLLoader.load(getClass().getResource("tableview.fxml"));
        controller.InitData(tablePane);
        StockGrabber stockGrabber = new StockGrabber();
        TableView tableView = (TableView) tablePane.lookup("#tableView");
        IBMObserver observer1 = new IBMObserver(stockGrabber, tableView);
        GetTheStock appl = new GetTheStock(20.05, stockGrabber, StockNames.AAPL_NAME.getName());
        GetTheStock goog = new GetTheStock(20.00, stockGrabber, StockNames.GOOG_NAME.getName());
        GetTheStock ibm = new GetTheStock(20.00, stockGrabber, StockNames.IBM_NAME.getName());
    }


    public static void main(String[] args) {
        launch(args);
    }
}

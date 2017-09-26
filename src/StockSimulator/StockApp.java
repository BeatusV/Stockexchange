package StockSimulator;

import StockSimulator.Controllers.TaskBarController;
import StockSimulator.Views.AAPLTableView;
import StockSimulator.Views.IBMTableView;
import StockSimulator.Views.TaskBar;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




import static javafx.fxml.FXMLLoader.load;

public class StockApp extends Application {
    private final VBox vBox = new VBox();
    @Override
    public void start(Stage primaryStage) throws Exception{
        IBMTableView ibmTableView = new IBMTableView();
        AAPLTableView aaplTableView = new AAPLTableView();
        Scene scene = new Scene(vBox);
        primaryStage.setTitle("National Stock exchange");
        primaryStage.setWidth(300);
        primaryStage.setHeight(500);
        TaskBarController taskBarController = new TaskBarController(vBox, ibmTableView, aaplTableView);
        vBox.getChildren().addAll(taskBarController.getView(), ibmTableView.getParent());

        primaryStage.setScene(scene);
        StockGrabber stockGrabber = new StockGrabber();
        IBMObserver observer1 = new IBMObserver(stockGrabber, ibmTableView);
        AaplObserver observer2 = new AaplObserver(stockGrabber, aaplTableView);
        GetTheStock ibmSimulater = new GetTheStock(20,stockGrabber, StockNames.IBM_NAME.getName());
        GetTheStock aaplSimulater = new GetTheStock(20,stockGrabber, StockNames.AAPL_NAME.getName());

        primaryStage.show();





    }


    public static void main(String[] args) {
        launch(args);
    }
}

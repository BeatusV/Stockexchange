package StockSimulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Window;

import java.io.IOException;

public class Controller {
    @FXML
    private Button taskBarButton1;
    @FXML
    private Button taskBarButton2;


    /**
     * Adds the gridPane to the the controller, should be called on initialization.
     * @param gridPane
     */
//    public void InitData(GridPane gridPane){
//        this.gridPane = gridPane;
//    }
     @FXML

     /**
      * Shows the table view when Table button is clicked
      */
     private void showTableView(ActionEvent e) throws IOException{
        Scene scene = taskBarButton1.getScene();
        Pane content = (Pane) scene.lookup("#content");
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(getClass().getResource("tableview.fxml")));
    }

    /**
     * Shows the graph view when Graph button is clicked
     * @param e
     */
    @FXML
    private void showGraphView(ActionEvent e){
        System.out.println("button2");
    }
}

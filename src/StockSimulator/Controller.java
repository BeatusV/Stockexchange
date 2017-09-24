package StockSimulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Window;

import java.io.IOException;

public class Controller {
    @FXML
    private Button taskBarButton1;
    @FXML
    private Button taskBarButton2;

     @FXML
    private void showTableView(ActionEvent e) throws IOException{
        Scene scene = taskBarButton1.getScene();
        Pane content = (Pane) scene.lookup("#content");
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(getClass().getResource("tableview.fxml")));
    }

    @FXML
    private void showGraphView(ActionEvent e){
        System.out.println("button2");
    }
}

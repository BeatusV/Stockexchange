package StockSimulator.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.omg.PortableInterceptor.ACTIVE;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController {
    @FXML
    private TableView tableView;
    @FXML
    private Button ibmButton;
    @FXML
    private Button googButton;
    @FXML
    private void showIbmTableView(ActionEvent e) throws IOException{
//        Scene scene = ibmButton.getScene();
//        Pane pane = (Pane)scene.lookup("#tablePane");
//        pane.getChildren().clear();
//        pane.getChildren().add());
    }
    @FXML
    private void showGoogTableView(ActionEvent e) {

    }

}

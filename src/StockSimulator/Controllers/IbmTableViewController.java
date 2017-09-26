package StockSimulator.Controllers;

import StockSimulator.Models.IbmStockDataModel;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by peter on 26-9-17.
 */
public class IbmTableViewController implements Initializable {
    private ObservableList<IbmStockDataModel> data;
    @FXML
    private TableView tableView;

    public IbmTableViewController(ObservableList<IbmStockDataModel> data){
        this.data = data;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableView.setItems(data);
    }
}

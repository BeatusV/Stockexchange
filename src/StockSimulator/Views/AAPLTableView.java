package StockSimulator.Views;

import StockSimulator.Models.AaplStockDataModel;
import StockSimulator.Models.IbmStockDataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * Created by peter on 26-9-17.
 */
public class AAPLTableView {

    private final ObservableList<AaplStockDataModel> data;
    private TableView<AaplStockDataModel> tableView;
    final Label label;
    final VBox vbox;

    public AAPLTableView(){
        tableView = new TableView<AaplStockDataModel>();
        tableView.setEditable(true);
        label = new Label("AAPL Data");
        vbox = new VBox();
        label.setFont(new Font("Arial", 20));
        data = FXCollections.observableArrayList(new AaplStockDataModel(20.0));
        tableView.setItems(data);
        addColumns();
        setLayout();
    }

    public VBox getParent(){
        return vbox;
    }
    public TableView<AaplStockDataModel> getTableView(){
        return tableView;
    }

    private void addColumns(){
        TableColumn aaplCurrency = new TableColumn("AAPL");
        aaplCurrency.setCellValueFactory(new PropertyValueFactory<AaplStockDataModel, Double>("AAPL"));
        tableView.getColumns().addAll(aaplCurrency);
    }
    private void setLayout(){
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10,0,0,10));
        vbox.getChildren().addAll(label, tableView);
    }

    public void updateView(double price){
        data.add(new AaplStockDataModel(price));
    }
}

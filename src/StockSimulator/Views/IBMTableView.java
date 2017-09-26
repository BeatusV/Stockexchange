package StockSimulator.Views;

import StockSimulator.Models.IbmStockDataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * Created by peter on 26-9-17.
 */
public class IBMTableView {
    private final ObservableList<IbmStockDataModel> data;
    private TableView<IbmStockDataModel> tableView;
    final Label label;
    final VBox vbox;

    public IBMTableView(){
        tableView = new TableView<IbmStockDataModel>();
        tableView.setEditable(true);
        label = new Label("IBM Data");
        vbox = new VBox();
        label.setFont(new Font("Arial", 20));
        data = FXCollections.observableArrayList(new IbmStockDataModel(20.0));
        tableView.setItems(data);
        addColumns();
        setLayout();
    }

    public VBox getParent(){
        return vbox;
    }
    public TableView<IbmStockDataModel> getTableView(){
        return tableView;
    }

    private void addColumns(){
        TableColumn ibmCurrency = new TableColumn("IBM");
        ibmCurrency.setCellValueFactory(new PropertyValueFactory<IbmStockDataModel, Double>("IBM"));
        tableView.getColumns().addAll(ibmCurrency);
    }
    private void setLayout(){
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10,0,0,10));
        vbox.getChildren().addAll(label, tableView);
    }

    public void updateView(double price){
        data.add(new IbmStockDataModel(price));
    }
}

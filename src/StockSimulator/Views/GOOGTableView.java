package StockSimulator.Views;

import StockSimulator.Models.AaplStockDataModel;
import StockSimulator.Models.GoogStockDataModel;
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
 * Created by peter on 27-9-17.
 */
public class GOOGTableView {


    private final ObservableList<GoogStockDataModel> data;
    private TableView<GoogStockDataModel> tableView;
    final Label label;
    final VBox vbox;

    public GOOGTableView() {
        tableView = new TableView<GoogStockDataModel>();
        tableView.setEditable(true);
        label = new Label("Goog Data");
        vbox = new VBox();
        label.setFont(new Font("Arial", 20));
        data = FXCollections.observableArrayList(new GoogStockDataModel(20.0));
        tableView.setItems(data);
        addColumns();
        setLayout();
    }

    public VBox getParent() {
        return vbox;
    }

    public TableView<GoogStockDataModel> getTableView() {
        return tableView;
    }

    private void addColumns() {
        TableColumn gooGCurrency = new TableColumn("GOOG");
        gooGCurrency.setCellValueFactory(new PropertyValueFactory<GoogStockDataModel, Double>("GOOG"));
        tableView.getColumns().addAll(gooGCurrency);
    }

    private void setLayout() {
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, tableView);
    }

    public void updateView(double price) {
        data.add(new GoogStockDataModel(price));
    }
}
package StockSimulator.Views;

import StockSimulator.Controllers.TaskBarController;
import StockSimulator.Dictionary.StockNames;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * Created by peter on 26-9-17.
 */
public class TaskBar extends HBox {
    final Button loadIBMButton;
    final Button loadAAplButton;
    final Button loadGoogButton;
    final Button loadAAplGraphButton;
    private TaskBarController controller;
    public TaskBar(TaskBarController controller){
        this.controller = controller;
        loadIBMButton = new Button(StockNames.IBM_NAME.getName());
        loadAAplButton = new Button(StockNames.AAPL_NAME.getName());
        loadGoogButton = new Button(StockNames.GOOG_NAME.getName());
        loadAAplGraphButton = new Button("test");
        setLayout();
        addHandlers();
        this.getChildren().addAll(loadIBMButton, loadAAplButton, loadGoogButton, loadAAplGraphButton);
    }

    private void addHandlers(){
        loadIBMButton.setOnAction(controller);
        loadAAplButton.setOnAction(controller);
        loadGoogButton.setOnAction(controller);
        loadAAplGraphButton.setOnAction(controller);
    }
    private void setLayout() {
        this.setSpacing(5);
    }
    public Button getLoadIBMButton(){
        return loadIBMButton;
    }
    public Button getLoadAAplButton(){
        return loadAAplButton;
    }
    public Button getLoadGoogButton(){return loadGoogButton;}

    public Button getLoadAAplGraphButton() {
        return loadAAplGraphButton;
    }
}

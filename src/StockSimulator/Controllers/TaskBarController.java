package StockSimulator.Controllers;

import StockSimulator.Views.AAPLTableView;
import StockSimulator.Views.IBMTableView;
import StockSimulator.Views.TaskBar;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by peter on 26-9-17.
 */
public class TaskBarController implements EventHandler{
    private final TaskBar taskBar;
    private final VBox field;
    private final Map<String, Node> views;
    public TaskBarController(VBox field, Map views){
        taskBar = new TaskBar(this);
        this.field = field;
        this.views = views;
    }

    @Override
    public void handle(final Event event) {
        final Object source = event.getSource();
        if(source.equals(taskBar.getLoadAAplButton())) {
            replaceView(views.get(taskBar.getLoadAAplButton().getText()));
        }
        else if(source.equals(taskBar.getLoadIBMButton())) {
            replaceView(views.get(taskBar.getLoadIBMButton().getText()));
        }
        else if(source.equals(taskBar.getLoadGoogButton())) {
            replaceView(views.get(taskBar.getLoadGoogButton().getText()));
        }
        else if(source.equals(taskBar.getLoadAAplGraphButton())){
            replaceView(views.get("test"));
        }
    }
    public TaskBar getView(){
        return taskBar;
    }

    private void replaceView(Node view){
        field.getChildren().remove(1);
        field.getChildren().add(view);
    }
}

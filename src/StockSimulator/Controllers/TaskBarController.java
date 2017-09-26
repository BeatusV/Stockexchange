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

/**
 * Created by peter on 26-9-17.
 */
public class TaskBarController implements EventHandler{
    private final TaskBar taskBar;
    private final VBox field;
    private final IBMTableView ibmTableView;
    private final AAPLTableView aaplTableView;
    public TaskBarController(VBox field, IBMTableView ibmTableView, AAPLTableView aaplTableView){
        taskBar = new TaskBar(this);
        this.field = field;
        this.ibmTableView = ibmTableView;
        this.aaplTableView = aaplTableView;
    }

    @Override
    public void handle(final Event event) {
        final Object source = event.getSource();
        if(source.equals(taskBar.getLoadAAplButton())) {
            replaceView(aaplTableView.getParent());
        }
        else if(source.equals(taskBar.getLoadIBMButton())) {
            replaceView(aaplTableView.getParent());
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

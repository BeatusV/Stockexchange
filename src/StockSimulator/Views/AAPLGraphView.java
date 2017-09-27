package StockSimulator.Views;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * Created by peter on 27-9-17.
 */
public class AAPLGraphView{
    private LineChart<Number, Number> lineChart;
    private int counter = 0;
    final NumberAxis xAxis = new NumberAxis();
    final NumberAxis yAxis = new NumberAxis();
    private XYChart.Series<Number, Number> data;

    public AAPLGraphView() {
        yAxis.setLabel("Curreny");
        xAxis.setLabel("time");
        yAxis.setUpperBound(20.4);
        yAxis.setLowerBound(19.6);
        yAxis.setTickUnit(0.05);
        yAxis.setAutoRanging(false);
        xAxis.setAutoRanging(false);
        xAxis.setLowerBound(0);
        xAxis.setUpperBound(50);
        xAxis.setTickUnit(4);
        lineChart = new LineChart<Number, Number>(xAxis, yAxis);
        lineChart.setTitle("AAPL Stockmonitoring");
        lineChart.setAnimated(false);
        data = new XYChart.Series<>();
        data.setName("Aapl data");
        lineChart.getData().add(data);
    }

  public void updateView(double price){
      Platform.runLater(
              () -> {
                  data.getData().add(new XYChart.Data<Number, Number>(counter, price));
                  counter++;
              }
      );

  }

  public LineChart<Number, Number> getLineChart(){
      return lineChart;
    }
}

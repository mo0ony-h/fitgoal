package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class foodController {

    @FXML
    private TextField chicken;

    @FXML
    private Label chickenresult;

    @FXML
    private Button foodcalc;

    @FXML
    private Label fullresult;

    @FXML
    private TextField meat;

    @FXML
    private Label meatresult;

    @FXML
    private TextField rice;

    @FXML
    private Label riceresult;

    @FXML
    void foodcalcButtonAction(ActionEvent event) {
        try {
            // Calculate the calories here based on the input
            double chickenCalories = Double.parseDouble(chicken.getText()) * 1.5; // raw chicken calories per 1g
            double meatCalories = Double.parseDouble(meat.getText()) * 2.5; // raw meat calories per 1g
            double riceCalories = Double.parseDouble(rice.getText()) * 1.3; // raw rice calories per 1g

            // Display the calculated calories for each item
            chickenresult.setText("" + chickenCalories);
            meatresult.setText("" + meatCalories);
            riceresult.setText("" + riceCalories);

            double totalCalories = chickenCalories + meatCalories + riceCalories;

            // Display the total calculated calories
            fullresult.setText("" + totalCalories);
        } catch (NumberFormatException e) {
            // Handle the exception if the input cannot be parsed as a double
        	Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Please enter a valid number");
            alert.show();
        }
    }
}

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class workoutController {

    @FXML
    private RadioButton cycling;

    @FXML
    private TextField minutes;

    @FXML
    private Label result;

    @FXML
    private RadioButton running;

    @FXML
    private RadioButton swimming;

    @FXML
    private ToggleGroup workout;

    @FXML
    private Button workoutcalcbutton;

    @FXML
    void workoutcalcButtonAction(ActionEvent event) {
          //try and catch for handling Exception problem 
        try {
            int minutesBurned = Integer.parseInt(minutes.getText());

            RadioButton selectedWorkout = (RadioButton) workout.getSelectedToggle();
         
            String workoutType = selectedWorkout.getText();

            double caloriesBurned = 0;
             // calculation for calories 
            if (workoutType.equals("Cycling")) {
                caloriesBurned = minutesBurned * 3.5;
            } else if (workoutType.equals("Running")) {
                caloriesBurned = minutesBurned * 6.0;
            } else {
                caloriesBurned = minutesBurned * 4.0;
            }
             //result set
            result.setText(String.format("you burned : %.0f", caloriesBurned));
        } //if the user dosent type an integer 
        catch (NumberFormatException e) {
        	  Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setTitle("Error");
              alert.setContentText("Please enter a valid number of minutes");
              alert.show();
            //if the user dosent choose a radiobutton
        } catch (NullPointerException e) {
        	  Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setTitle("Error");
              alert.setContentText("Please select a workout type");
              alert.show();
        }
    }

}

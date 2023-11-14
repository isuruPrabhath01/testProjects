package lk.ijse.drivingschool.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import lk.ijse.drivingschool.util.Navigation;
import org.controlsfx.control.Rating;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ExamController{

    public Label note;
    public Rating rating;

    public void btnAddSchedule(ActionEvent actionEvent) throws IOException {
        Navigation.popUP("ExamSchedule.fxml");
    }

    public void btnAddWritingExam(ActionEvent actionEvent) throws IOException {
        Navigation.popUP("AddWritingExam.fxml");

    }

    public void btnAddTrialExam(ActionEvent actionEvent) throws IOException {
        Navigation.popUP("AddTrialExam.fxml");
    }

    public void btnToPass(ActionEvent actionEvent) {

    }

}

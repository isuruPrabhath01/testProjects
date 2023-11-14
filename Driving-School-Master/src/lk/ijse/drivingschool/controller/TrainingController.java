package lk.ijse.drivingschool.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.drivingschool.util.Navigation;
import lk.ijse.drivingschool.util.Routes;

import java.io.IOException;

public class TrainingController {

    public void btnNewTraining(ActionEvent actionEvent) {

    }


    public void btnAdd(ActionEvent actionEvent) throws IOException {
        Navigation.popUP("AddTraining.fxml");
    }

}

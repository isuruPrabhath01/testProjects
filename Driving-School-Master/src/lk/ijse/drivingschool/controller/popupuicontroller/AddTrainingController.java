package lk.ijse.drivingschool.controller.popupuicontroller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class AddTrainingController {

    public JFXButton btnExit;

    public void btnExit(ActionEvent actionEvent) {
        Stage stage= (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}

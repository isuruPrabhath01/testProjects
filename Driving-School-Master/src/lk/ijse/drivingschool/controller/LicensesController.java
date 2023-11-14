package lk.ijse.drivingschool.controller;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.drivingschool.util.Navigation;
import lk.ijse.drivingschool.util.Routes;

import java.io.IOException;

public class LicensesController {



    public void btnLicenseDetails(ActionEvent actionEvent) throws IOException {
       Navigation.popUP("AddLicense.fxml");
    }
}

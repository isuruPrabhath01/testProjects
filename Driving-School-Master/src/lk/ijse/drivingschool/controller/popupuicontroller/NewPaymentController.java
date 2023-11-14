package lk.ijse.drivingschool.controller.popupuicontroller;

import javafx.event.ActionEvent;
import lk.ijse.drivingschool.util.Navigation;

import java.io.IOException;

public class NewPaymentController {

    public void btnPay(ActionEvent actionEvent) throws IOException {
        Navigation.popUP("NewPayment.fxml");
    }
}

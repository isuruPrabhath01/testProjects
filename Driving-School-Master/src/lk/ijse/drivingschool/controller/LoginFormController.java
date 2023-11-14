package lk.ijse.drivingschool.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import lk.ijse.drivingschool.util.CrudUtil;
import lk.ijse.drivingschool.util.Navigation;
import lk.ijse.drivingschool.util.Routes;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFormController {
    public JFXButton bttLogin;
    public JFXPasswordField txtPass;
    public ImageView vision;
    public ImageView visioff;
    public JFXTextField txtPassword;
    public JFXPasswordField txtpasswordfield;
    public JFXTextField txtUser;
    @FXML
    private AnchorPane pane;

    public void initialize() throws IOException {

        visioff.setVisible(false);
        txtPassword.setVisible(false);

    }

    public void bttloginPressed(ActionEvent actionEvent) throws IOException, SQLException, ClassNotFoundException {
//        System.out.println("DashBorad");
//        Navigation.navigate(Routes.DASHBOARD, pane);

//        if (txtUser.getText().matches("^[A-Z][a-z]*$")) {
//            if (txtpasswordfield.getText().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!-&-@])(?=.*[a-zA-Z]).{8,}$")) {

                String username = txtUser.getText();

                String password = txtPassword.getText();
                 Navigation.navigate(Routes.DASHBOARD, pane);
//                if(username.equals("user")&&password.equals("123")){
//
//                }

//                ResultSet user = CrudUtil.execute("SELECT * FROM User WHERE user_name like'"+username+"%'");
//
//                while (user.next()){
//
//                    password = user.getString(3);
//
//                    if (txtpasswordfield.getText().equals(password)){
//                        Navigation.navigate(Routes.DASHBOARD, pane);
//
//                    }
//
//                }
                    txtpasswordfield.setFocusColor(Paint.valueOf("Red"));
                    txtpasswordfield.requestFocus();

//            }else{
//                txtpasswordfield.setFocusColor(Paint.valueOf("Red"));
//                txtpasswordfield.requestFocus();
//            }

//        }else{
//            txtUser.setFocusColor(Paint.valueOf("Red"));
//            txtUser.requestFocus();



    }

    public void exitemouseonaction(MouseEvent mouseEvent) {
        visioff.setVisible(false);
        txtpasswordfield.setVisible(true);
        txtPassword.setVisible(false);
    }

    public void entermouseOnaction(MouseEvent mouseEvent) {
        visioff.setVisible(true);
        txtpasswordfield.setVisible(false);
        txtPassword.setVisible(true);
        txtPassword.setText(txtpasswordfield.getText());
    }
}
package lk.ijse.drivingschool.controller;

import com.gn.GNCarousel;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToggleButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.drivingschool.util.Navigation;
import lk.ijse.drivingschool.util.Routes;
import org.controlsfx.control.PopOver;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DashboardFormController {


    public AnchorPane panes;
    public AnchorPane formLoadPane;
    public AnchorPane dBPane;
    public GNCarousel carousel;
    public JFXToggleButton btnSwitch;
    public AnchorPane headerPane;
    public JFXButton config;


    public void btnCustomer(ActionEvent actionEvent) throws IOException, SQLException, ClassNotFoundException {
        System.out.println("Customer");

        Navigation.navigate(Routes.CUSTOMER, formLoadPane);

    }

    public void btnLogout(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.LOGIN, panes);
    }

    public void BtnInstructors(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.INSTRUCTORS, formLoadPane);
    }

    public void btnDashBoard(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.DASHBOARD, panes
        );
    }

    public void btnExam(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.EXAMS, formLoadPane);
    }

    public void btnLicenses(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.Licenses, formLoadPane);
    }

    public void btnPayment(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.PAYMENT, formLoadPane);
    }

    public void btnTraining(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.Training, formLoadPane);
    }

    public void btnSwitch(ActionEvent actionEvent) {

        if (btnSwitch.isSelected() == true) {
            btnSwitch.setText("Dark Mode");
            setDarkMode();

        } else {
            btnSwitch.setText("Light Mode");
            setLightMode();
        }
    }

    private void setLightMode() {
        panes.getStylesheets().remove("lk/ijse/drivingschool/asserts/css/darkMode.css");
        panes.getStylesheets().add("lk/ijse/drivingschool/asserts/css/lightMode.css");
        headerPane.getStylesheets().remove("lk/ijse/drivingschool/asserts/css/darkMode.css");
        headerPane.getStylesheets().add("lk/ijse/drivingschool/asserts/css/lightMode.css");
    }

    private void setDarkMode() {
        panes.getStylesheets().remove("lk/ijse/drivingschool/asserts/css/lightMode.css");
        panes.getStylesheets().add("lk/ijse/drivingschool/asserts/css/darkMode.css");
        headerPane.getStylesheets().remove("lk/ijse/drivingschool/asserts/css/lightMode.css");
        headerPane.getStylesheets().add("lk/ijse/drivingschool/asserts/css/darkMode.css");

    }

    public void btnProfile(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.PROFILE,formLoadPane);
    }


}




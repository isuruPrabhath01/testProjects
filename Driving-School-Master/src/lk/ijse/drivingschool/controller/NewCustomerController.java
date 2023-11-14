package lk.ijse.drivingschool.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lk.ijse.drivingschool.model.CustomerModel;
import lk.ijse.drivingschool.to.Customer;
import lk.ijse.drivingschool.util.Navigation;
import lk.ijse.drivingschool.util.Routes;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import static sun.net.www.MimeTable.loadTable;

public class NewCustomerController {
    public AnchorPane loadForm;
    public JFXTextField txtID;
    public JFXTextField txtName;
    public JFXTextField txtAge;
    public JFXComboBox <String> txtGender;
    public JFXTextField txtNIC;
    public JFXTextField txtAddress;
    public JFXTextField txtNumber;
    public JFXComboBox <String> txtLicenseType;
    public JFXComboBox <String> txtTransmissionType;
    public JFXTextField txtEmail;
    public JFXComboBox <String> txtVehicleClass;
    public JFXTextField txtCourseFee;
    public JFXTextField txtAmount;
    public Label lblDate;
    public Label txtDate;

    public void initialize(){
        lblDate.setText(String.valueOf(LocalDate.now()));
        genderCombo();
        LicenseType();
        TransmissionType();
        VehicleClass();
    }
    private void VehicleClass(){
        ObservableList<String> obList =FXCollections.observableArrayList();
        obList.addAll("A","A1","B","B1","A/B/B1","A/B","A/B1");
        txtVehicleClass.setItems(obList);
    }
    private void TransmissionType(){
        ObservableList<String> obList= FXCollections.observableArrayList();
        obList.addAll("Auto","Manual");
        txtTransmissionType.setItems(obList);
    }
    private void LicenseType(){
        ObservableList<String> obList= FXCollections.observableArrayList();
        obList.addAll("New","Extend");
        txtLicenseType.setItems(obList);
    }
    private void genderCombo(){
        ObservableList<String> obList= FXCollections.observableArrayList();
        obList.addAll("Male","Female");
        txtGender.setItems(obList);
    }
    public void BackBtn(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.CUSTOMER,loadForm);
    }


    public void btnSaveCustomer(ActionEvent actionEvent) {

        Customer customer = new Customer(
                txtID.getText(),
                txtName.getText(),
                Integer.parseInt(txtAge.getText()),
                txtGender.getValue(),
                txtNIC.getText(),
                txtAddress.getText(),
                txtNumber.getText(),
                txtEmail.getText(),
                txtLicenseType.getValue(),
                txtTransmissionType.getValue(),
                txtVehicleClass.getValue(),
                Double.parseDouble(txtCourseFee.getText()),
                Double.parseDouble(txtAmount.getText()),
                txtDate.getText()
        );

        try {
            boolean isAdded = CustomerModel.isAddCustomer(customer);
            if(isAdded){
                new Alert(Alert.AlertType.INFORMATION,"Customer Added Success!").show();
            }

        } catch (SQLException  | ClassNotFoundException e) {
            System.out.print(e);
        }

    }
}

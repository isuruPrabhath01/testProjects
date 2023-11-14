package lk.ijse.drivingschool.controller;


import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.drivingschool.to.Customer;
import lk.ijse.drivingschool.util.Navigation;
import lk.ijse.drivingschool.util.Routes;
import java.io.IOException;
import java.sql.SQLException;


import static sun.net.www.MimeTable.loadTable;


public class CustomerDetailsController {
    public AnchorPane rootCustomers;
    private ObservableList<Customer> filterCustomers;
    public TableView tblCustomers;
    private ObservableList<Customer> listCustomers;
    public AnchorPane customerPane;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colNumber;
    public TableColumn colFee;
    public TableColumn colLicenseType;
    public TableColumn colMore;
    public TextField txtSearchCustomer;
    public TextField txtSearchNumber;




    public void btnNewCustomer(ActionEvent actionEvent) throws IOException, SQLException, ClassNotFoundException {
        loadTable();
        Navigation.navigate(Routes.Registration,customerPane);
    }

    public void btnSearch(ActionEvent actionEvent) {
    }

    public void searchOnAction(ActionEvent actionEvent) {
    }

    public void filterNameCustomer(KeyEvent keyEvent) {

    }

    public void filterNumberCustomer(KeyEvent keyEvent) {
    }

    public void showDialogddCustomer(MouseEvent mouseEvent) {
    }

    public void filterNameCustomerOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        loadTable();
    }
}

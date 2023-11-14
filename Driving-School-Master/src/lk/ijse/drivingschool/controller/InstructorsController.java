package lk.ijse.drivingschool.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.drivingschool.to.Customer;
import lk.ijse.drivingschool.to.Instructor;
import lk.ijse.drivingschool.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InstructorsController {

    public TextField txtSearch;
    public TableView tableView;
    public TableColumn tblId;
    public TableColumn tblName;
    public TableColumn tblType;
    public TableColumn tblDriver;
    public TableColumn tblContactNumber;

    public void initialize()  {

    }

    public void loadTable() throws SQLException, ClassNotFoundException {

        ObservableList<Instructor> instructorsTable= FXCollections.observableArrayList();
        ResultSet resultSet = CrudUtil.execute("SELECT instructor,instructor_id, instructor_name, instructor_type, driving_license, telephone_number");

        while (resultSet.next()) {
            instructorsTable.add(new Instructor(
                    resultSet.getString("instructor_id"),
                    resultSet.getString("instructor_name"),
                    resultSet.getString("instructor_type"),
                    resultSet.getString("driving_license"),
                    resultSet.getString("telephone_number")
            ));
        }
        tableView.setItems(instructorsTable);
        tblId.setCellValueFactory(new PropertyValueFactory<>("instructor_id"));
        tblName.setCellValueFactory(new PropertyValueFactory<>("instructor_name"));
        tblType.setCellValueFactory(new PropertyValueFactory<>("instructor_type"));
        tblDriver.setCellValueFactory(new PropertyValueFactory<>("driving_license"));
        tblContactNumber.setCellValueFactory(new PropertyValueFactory<>("telephone_number"));
    }





    public void btnSearch(ActionEvent actionEvent) {
    }

    public void searchOnAction(ActionEvent actionEvent) {
    }
}

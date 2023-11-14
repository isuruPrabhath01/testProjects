package lk.ijse.drivingschool.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.ijse.drivingschool.to.Customer;
import lk.ijse.drivingschool.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerModel {

    public static boolean isAddCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                customer.getAdmission_numberr(),
                customer.getFull_namee(),
                customer.getAge(),
                customer.getGender(),
                customer.getNic(),
                customer.getAddress(),
                customer.getTelephone_numberr(),
                customer.getEmail(),
                customer.getLicense_typee(),
                customer.getTransmission_Type(),
                customer.getVehicle_class(),
                customer.getCourse_fee(),
                customer.getAmount(),
                customer.getDate()
        );

    }


}

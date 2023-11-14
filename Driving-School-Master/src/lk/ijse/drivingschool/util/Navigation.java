package lk.ijse.drivingschool.util;

import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static AnchorPane pane;
    private static JFXPanel primaryStage;

    public static void popUP(String fxml) throws IOException {
        Stage priaryStage = new Stage();
        Parent root= FXMLLoader.load(Navigation.class.getResource("/lk/ijse/drivingschool/view/popupui/"+fxml));
        priaryStage.setScene(new Scene(root,500,500));
        priaryStage.show();

    }

    public static void navigate(Routes routes, AnchorPane pane) throws IOException {
        Navigation.pane = pane;
        Navigation.pane.getChildren().clear();
        Stage window = (Stage)Navigation.pane.getScene().getWindow();


        switch (routes) {

            case LOGIN:
                window.setTitle("Welcome");
                initUI("LoginForm.fxml");
                break;

            case DASHBOARD:
                window.setTitle("Dashboard");
                initUI("DashboardForm.fxml");
                break;

            case CUSTOMER:
                window.setTitle("Customer Details");
                initUI("CustomerDetails.fxml");
                break;

            case INSTRUCTORS:
                window.setTitle("INSTRUCTORS");
                initUI("Instructors.fxml");
                break;

            case Training:
                window.setTitle("Training");
                initUI("Training.fxml");
                break;

            case EXAMS:
                window.setTitle("Exam");
                initUI("Exam.fxml");
                break;

            case Licenses:
                window.setTitle("Licenses");
                initUI("Licenses.fxml");
                break;

            case PAYMENT:
                window.setTitle("Payment");
                initUI("Payment.fxml");
                break;

            case Registration:
                window.setTitle("Registration");
                initUI("newCustomer.fxml");
                break;

            case PROFILE:
                window.setTitle("Super Driver");
                initUI("Profile.fxml");
                break;
        }
    }
    public static void  initUI(String location) throws IOException {
        Navigation.pane.getChildren().add(FXMLLoader.load(Navigation.class.getResource("/lk/ijse/drivingschool/view/"+location)));
    }

}

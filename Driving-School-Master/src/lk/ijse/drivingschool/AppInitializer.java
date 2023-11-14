package lk.ijse.drivingschool;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.io.IOException;

//public class AppInitializer extends Application {
//    public static Stage mainStage;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//
//    @Override
//    public void start(Stage stage) throws Exception {
//
//        Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/drivingschool/view/Loading.fxml"));
//        Scene scene = new Scene(root);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.getIcons().add(new Image("/lk/ijse/drivingschool/asserts/Logo/SDLogo1.png"));
//        stage.show();
//
//        Parent loginRoot = FXMLLoader.load(getClass().getResource("/lk/ijse/drivingschool/view/LoginForm.fxml"));
//        Stage logStage = new Stage();
//
//        logStage.setScene(new Scene(loginRoot, 1366, 768));
//        logStage.getIcons().add(new Image(getClass().getResourceAsStream("/lk/ijse/drivingschool/asserts/Logo/SDLogo1.png")));
//
//        this.mainStage = logStage;
//
//        PauseTransition delay = new PauseTransition(Duration.seconds(2));
//        delay.setOnFinished(event -> stage.close());
//        delay.play();
//        PauseTransition delayLog = new PauseTransition(Duration.seconds(2));
//        delayLog.setOnFinished(event -> logStage.show());
//
//
//        delayLog.play();
//    }
//}


///////////////////////////////new code///////////////////////////////////////

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/drivingschool/view/LoginForm.fxml"))));
        primaryStage.setTitle("Smart Driver");
        primaryStage.getIcons().add(new Image("/lk/ijse/drivingschool/asserts/Logo/SDLogo1.png"));
        primaryStage.show();
    }
}


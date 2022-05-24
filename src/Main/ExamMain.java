package Main;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExamMain extends Application {

    public ExamMain() {}


    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage stage) throws Exception {
//        loading the fxml file
        Parent root = FXMLLoader.load(getClass().getResource("/views/Questions.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Online Test of Java");
        stage.show();
    }

}

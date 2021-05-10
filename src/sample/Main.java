package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setOnCloseRequest(e ->{
            e.consume();
            CloseProgram();
        });

        AnchorPane root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("MainStyle.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void CloseProgram(){
        boolean ans = CustomClass.YesNo("Close Program", "Are you sure want to exit?");
        if(ans)
            window.close();
    }
}

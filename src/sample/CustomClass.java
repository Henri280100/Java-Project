package sample;

import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.*;

public class CustomClass {

    static private Button yesButton, noButton;
    static private Stage window;
    static boolean ans;

    public static boolean YesNo(String title, String message){
        window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);

        // label
        Label label = new Label();
        label.setText(message);

        // closing system
        yesButton = new Button("Yes");
        yesButton.setOnAction(e -> {
            ans = true;
            window.close();
        });

        noButton = new Button("No");
        noButton.setOnAction(e -> {
            ans = false;
            window.close();
        });
        /////////////////////////////////
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton,noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 250,150);
        window.setScene(scene);
        window.showAndWait();

        return ans;
    }

}

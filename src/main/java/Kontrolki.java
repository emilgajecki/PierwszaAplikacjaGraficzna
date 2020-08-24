import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.awt.*;

public class Kontrolki extends Application{

    public static void main(String[] args) {launch(args);

    }
    @Override
    public void start(Stage primaryStage){
        //                                                pogrubienie
        Font font = Font.font("Times New Roman", FontWeight.BOLD,16);

        Color color = Color.web("#f06927");

        //Label
        Label label = new Label("Moja pierwsza labelka");
        //ustawienie labelki
        label.setLayoutX(10);
        label.setLayoutY(35);
        // ustawienia wilkosci czcionki
        //label.setFont(new Font(20));
        label.setFont(font);

        // ustawianie koloru dla labelki
        //label.setTextFill(Color.BLUE);

        // usatwianie koloru własnego dla Labelki
        // 1.   Color color = Color.web("#f06927");
        label.setTextFill(color);

        Group group = new Group();
        group.getChildren().add(label);
        // tutaj mozęmy okreslic rozmiar
        Scene scene = new Scene(group,1900,1000);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplikacja Kontrolki");
        primaryStage.show();
    }
}

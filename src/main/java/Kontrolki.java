import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

        //////////////////////////IMAGEVIEW///////////////////////////////
        //ImageView - po pobraniu grafiki przciagamy ja do resources
        Image image = new Image("obrazek.png");
        ImageView imageView = new ImageView(image);
        // przypisanie obrazku do labelki
        label.setGraphic(imageView);

        //////////////////////////////////////////////////////////////////

        ////////////////////////////BUTTON////////////////////////////////
        //sekcja Button
        Button button= new Button("Pierwszy klikalny przycisk");

        //zmiana pozycji przycisku
        button.setLayoutX(20);
        button.setLayoutY(100);
        // ustawienie koloru na przycisku - tekst
        button.setTextFill(color);
        // ustawienie grafiki przypidanej do tekstu
        //button.setGraphic(imageView);
        // wyłączenie przycisku (true - wylaczony)
        //button.setDisable(true);


        //przechwyteywanie klikania na przycisku
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Klikam!");
                button.setText("po kliknieciu zmienam nazwe na inna");
                // w tym miejcsu po kliknieciu wyląłczamy przycisk
                button.setDisable(true);


            }
        });
        //////////////////////////////////////////////////////////////////

        //////////////////////////TEXTFIELD//////////////////////////////
        // KONTROLKA DO WPISYWANIA TEKTU
        TextField textField = new TextField();
        // podpowiadanie co ma wpisac
        textField.setPromptText("wpisz e-mail");
        // maksymalna ilosc znakwo
        textField.setPrefColumnCount(20);
        textField.setLayoutX(20);
        textField.setLayoutY(130);
        /////////////////////////////////////////////////////////////////

        ////////////////////////PASSWORDFIELD////////////////////////////
        //sekcja do wpisywania hasla
        PasswordField passwordField = new PasswordField();
        //ustawianie podpowiedzi
        passwordField.setPromptText("Wpisz haslo");
        passwordField.setLayoutX(30);
        passwordField.setLayoutX(100);
        ////////////////////////////////////////////////////////////////

        Group group = new Group();
        group.getChildren().add(label);
        group.getChildren().add(button);
        group.getChildren().add(textField);
        group.getChildren().add(passwordField);
        //group.getChildren().add(imageView);

        // tutaj mozęmy okreslic rozmiar
        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplikacja Kontrolki");
        primaryStage.show();
    }
}

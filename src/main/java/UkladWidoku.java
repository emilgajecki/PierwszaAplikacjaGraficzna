import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UkladWidoku extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ////////////HBox////////////////
        //ulozone poziomo
        Button menuButton = new Button("Menu");
        Button kontaktButton = new Button("Kontakt");
        Button zamowienieButton = new Button("Zamowienie");

        HBox hbox = new HBox();
        hbox.getChildren().add(menuButton);
        hbox.getChildren().add(kontaktButton);
        hbox.getChildren().add(zamowienieButton);
        // to samo co wyzej - w inny sposob
        //hbox.getChildren().addAll(menuButton,kontaktButton,zamowienieButton);
        // odstepy miedzy pomiedzy kontrolkami
        hbox.setSpacing(10);
        // odspepy - miedzy czaseci - marginesy z kazdej strony
        // jezeli chcemy marginesy z kazdej strony inny to :
        // piszemy 4 cyfry po przcinku : top, right, bottom, left
        hbox.setPadding(new Insets(5,10, 2, 1));
        // zmiana koloru tła
        hbox.setBackground(new Background
                (new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY,
                        Insets.EMPTY)));
        // do layout'a mozna dodac kolejnego
        ////////////////////////////////

        ////////////VBox////////////////
        // pionowo jeden pod drugim
        // zrobimy obrazek z labelka
        ImageView pizzaImageView =
                new ImageView(new Image("obrazki/ikony/pizza.png"));
       Label pizzaLabel = new Label("pizza", pizzaImageView);
       ImageView hamburgerImageView =
             new ImageView(new Image("obrazki/ikony/hamburger.png"));
       Label hamburgerLabel = new Label("Hamburger", hamburgerImageView);
       ImageView napojeImageView =
               new ImageView(new Image("obrazki/ikony/napoje.png"));
       Label napojeLabel = new Label("Napoje", napojeImageView);

        VBox vbox = new VBox();
        // kolejnosc ma znaczenie - w takiej kolejnosci zostana dodane
        vbox.getChildren().addAll(pizzaLabel,hamburgerLabel,napojeLabel);
        ////////////////////////////////

        /////////BORDERPANE/////////////
        // ustawienie elementow na gora,dol,lewo,prawo
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hbox);
        borderPane.setLeft(vbox);
//        TextField textField = new TextField("Gora");
//        borderPane.setTop(textField);
//        TextField textField1 = new TextField("Dol");
//        borderPane.setBottom(textField1);
//        TextField textField2 = new TextField("srodek");
//        borderPane.setCenter(textField2);
//        TextField textField3 = new TextField("lewo");
//        borderPane.setLeft(textField3);
//        TextField textField4 = new TextField("prawy");
//        borderPane.setRight(textField4);
        ////////////////////////////////


        // nasz root - borderPane
        Scene scene = new Scene(borderPane , 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Uklad elementow w widoku");
        primaryStage.show();
    }
}

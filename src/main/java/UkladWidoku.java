import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
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
        // odstepu po miedzy dodanymi elementami
        vbox.setSpacing(10);
        //wewnetrzny magrines
        vbox.setPadding(new Insets(20));
        //utworzenie koloru
        vbox.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        ////////////////////////////////

        ////////////STACKPANE///////////
        // UKLADA JEDEN NA DRUGIM - STOS
        // obrazek a na nim opis
        ImageView pizzaDuzaImageView = new ImageView(new Image("obrazki/pizza/pizza-cztery-sery-duza.png"));
        Label opisLabel = new Label("Pizza cztery sery składa sie z 4 serów");
        // zmiana koloru Labelki
        opisLabel.setTextFill(Color.WHITE);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(pizzaDuzaImageView,opisLabel);
        // zmiana elemento, ktr maja byc wyrysowane - np w kotrym miejscu maja sie stykac
        stackPane.setAlignment(Pos.TOP_CENTER);
        stackPane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        ////////////////////////////////

        ////////////FLOWPANE///////////
        // MOZEMY UKLADAC PIONOW, POZMIOMO, ALE JEZELI NIE
        // STARCZY MIEJSCA JEST PRZEKLADANE DO NASTEPNEJ KOLUMNY\WIERSZA
        ImageView pizzaCzterySery = new ImageView(new Image("obrazki/pizza/pizza-cztery-sery.png"));
        //ImageView pizzaCzterySeryDuza = new ImageView(new Image("obrazki/pizza/pizza-cztery-sery-duza.png"));
        ImageView pizzaFunghi = new ImageView(new Image("obrazki/pizza/pizza-funghi.png"));
        ImageView pizzaMargaritta = new ImageView(new Image("obrazki/pizza/pizza-margaritta.png"));
        ImageView pizzaMexicana = new ImageView(new Image("obrazki/pizza/pizza-mexicana.png"));
        ImageView pizzaPepperoni = new ImageView(new Image("obrazki/pizza/pizza-pepperoni.png"));
        ImageView pizzaSalami = new ImageView(new Image("obrazki/pizza/pizza-salami.png"));

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().
                addAll(pizzaCzterySery,pizzaFunghi,pizzaMargaritta,pizzaMexicana,pizzaPepperoni,pizzaSalami );
        //ustawianie orientacji - domyslnie horyzontalnie
        flowPane.setOrientation(Orientation.HORIZONTAL);
        //aby zmienialy - przeskakiwaly do kolumny lub wiersza nalezy ustalic wielkosc
        flowPane.setMaxWidth(150);
        //odleglosci miedzy obrazkami
        flowPane.setHgap(5);
        flowPane.setVgap(10);
        // marginesu
        flowPane.setPadding(new Insets(10));
        ////////////////////////////////

        /////////GRIDPANE//////////////
        // taka siatka - okreslamy gdzie chcemy osadzic
        Button minusButton = new Button("-");
        minusButton.setPrefSize(30,30);
        Button plusButton = new Button("+");
        plusButton.setPrefSize(30,30);
        Label iloscLabel = new Label("1");
        iloscLabel.setPadding(new Insets(0,10,0,10));
        Button okButton = new Button("OK");
        Button anulujButton = new Button("Anuluj");
        // odzielania elementow - robi przestrzen
        Pane pane = new Pane();
        pane.setPrefWidth(50);

        // wskazanie w ktorym wierszu chcemy wstawic eleement - zaczynamy od 0
        GridPane gridPane = new GridPane();
        // pierwsza liczba - indeks kolumny
        // druga liczna  indeks wiersza
        gridPane.add(minusButton, 0,0); //1 kolumna, 1 wiersz
        gridPane.add(iloscLabel, 1,0); // 2 kolumna, 1 wiersz
        gridPane.add(plusButton,2,0);// 3 kolumna, 1 wiersz
        gridPane.add(pane,3,1); // 4 kolimna, wiersz
        gridPane.add(okButton,4,1);// 5 kolumna, 2 wiersz
        gridPane.add(anulujButton,5,1); // 6 kolumna,2 wiersz
        ////////////////////////////////

        /////////SCROLLPANE//////////////
        // mozliwosc przewijania elementow

        for (int i = 0; i<10;i++){
            ImageView kopaPizzaImageView = new ImageView(new Image("obrazki/pizza/pizza-cztery-sery.png"));
            flowPane.getChildren().add(kopaPizzaImageView);
        }

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setMaxWidth(150);
        // do scrolpane usawtimy flowPane
        scrollPane.setContent(flowPane);
        ////////////////////////////////

        /////////BORDERPANE/////////////
        // ustawienie elementow na gora,dol,lewo,prawo
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hbox);
        borderPane.setLeft(vbox);
        borderPane.setCenter(stackPane);
        borderPane.setRight(scrollPane);
        borderPane.setBottom(gridPane);

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

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AplikacjaGraficzna  extends Application {

   // main dla aplikacji graficznej
    public static void main (String[] args) {
        // metoda pochodząca z apllication
        launch(args);
    }
   // metoda wywyoływana razem z launch
    @Override
    public void start(Stage primaryStage)  {
        //Stage - główne okno wyjściowe aplikcaji
        //Scene -
        //StackPane - root
        //Text -
        Text text = new Text("Teks z pierwszej aplikacji graficznej");
        Button button = new Button("Moj piewszy przycisk");
        Text textDrugi = new Text("Tekst drugi");

        // Storage -> Scene -> StackPane -> Text
        // do roota dodajemy zawsze wszystkie dzieci (dodtki)
        //StackPane root = new StackPane();

        //horizontal box - elementy sa wyrysowywane kolo siebie
        //HBox root = new HBox();

        //sa one z gory na dol
        VBox root = new VBox();

        root.getChildren().add(text);
        root.getChildren().add(button);
        root.getChildren().add(textDrugi);

        // w scenie musimy dać root'a - do płótna musimy dac kontorlkę,
        // miejsce od którego będziemy wyrysowoać
        // to jest taki korzeń
        Scene scene = new Scene(root);

        //głowne okno to primaryStage
        // scaena to jak jakby płótno na którym bedziemy rysować obiekty
        // miejscie w teatrze - i wszystko ustawiamy co ma zostac odegrane
        // takie sceny

        //stage i co możemy ustawic
        primaryStage.setScene(scene);

        // ustawianie tytulu
        primaryStage.setTitle("Moja aplikacja");

        // ustawianie współrzędnych - na jakich chcemy aby wyswietlilo sie okienko
        primaryStage.setX(1);
        primaryStage.setY(1);

        // ustawianie szerokości i wysokości okna
        primaryStage.setWidth(1920);
        primaryStage.setHeight(1080);

        //ustawianie min i max wysokości
        //primaryStage.setMinHeight();
        //primaryStage.setMinWidth();
        // tak samo z maxem

        // jak ustawic styl
        // primaryStage.initStyle(StageStyle.DECORATED) -warotsc domysla
        // primaryStage.initStyle(StageStyle.UNDECORATED) - wylaczony pasek na gorze
        // primaryStage.initStyle(StageStyle.UTILITY) - pasem menu umozliwa tylko zamkniecie okna
        // primaryStage.initStyle(StageStyle.TRANSPARENT) - okno staje sie to przezroczyste
        // primaryStage.initStyle(StageStyle.UNIFIED) - jednolity

        // ustawianie okna na FULL
        primaryStage.setFullScreen(false);

        //tytuł aplikacji
        primaryStage.setTitle("Moja aplikacja");

        //pokazanie wszystkeigo - bez tego nie ruszy
        primaryStage.show();


    }
}

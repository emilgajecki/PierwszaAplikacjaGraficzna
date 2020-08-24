import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
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
        //StackPane -
        //Text -
        Text text = new Text("Teks z pierwszej aplikacji graficznej");


        // Storage -> Scene -> StackPane -> Text
        StackPane stackPane = new StackPane();// nazywany jako root
        stackPane.getChildren().add(text);

        // w scenie musimy dać root'a - do płótna musimy dac kontorlkę,
        // miejsce od którego będziemy wyrysowoać
        // to jest taki korzeń
        Scene scene = new Scene(stackPane);

        //głowne okno to primaryStage
        // scaena to jak jakby płótno na którym bedziemy rysować obiekty
        // miejscie w teatrze - i wszystko ustawiamy co ma zostac odegrane
        // takie sceny

        //stage i co możemy ustawic
        primaryStage.setScene(scene);

        // ustawianie tytulu
        primaryStage.setTitle("Moja aplikacja");

        // ustawianie współrzędnych - na jakich chcemy aby wyswietlilo sie okienko
        primaryStage.setX(500);
        primaryStage.setY(500);

        // ustawianie szerokości i wysokości okna
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);

        //ustawianie min i max wysokości
        //primaryStage.setMinHeight();
        //primaryStage.setMinWidth();
        // tak samo z maxem

        // jak ustawic styl
        // DECORATED -warotsc domysla
        // UNDECORATED - wylaczony pasek na gorze
        // UTILITY - pasem menu umozliwa tylko zamkniecie okna
        // TRANSPARENT - okno staje sie to przezroczyste
        // UNIFIED - jednolity
        primaryStage.initStyle(StageStyle.DECORATED);

        // ustawianie okna na FULL
        primaryStage.setFullScreen(true);

        //pokazanie wszystkeigo - bez tego nie ruszy
        primaryStage.show();

    }
}

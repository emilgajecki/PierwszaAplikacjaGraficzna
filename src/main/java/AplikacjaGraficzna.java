import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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

        // w scenie musimy dać root'a - do płótna musimy dac kontorlkę, miejsce od którego będziemy wyrysowoać
        // to jest taki korzeń
        Scene scene = new Scene(stackPane);

        //głowne okno to primaryStage
        // scaena to jak jakby płótno na którym bedziemy rysować obiekty
        primaryStage.setScene(scene);

        //pokazanie wszystkeigo - bez tego nie ruszy
        primaryStage.show();

    }
}

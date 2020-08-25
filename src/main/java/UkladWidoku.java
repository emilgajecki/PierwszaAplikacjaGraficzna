import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UkladWidoku extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        /////////BORDERPANE/////////////
        // ustawienie elementow na gora,dol,lewp,prawo
        BorderPane borderPane = new BorderPane();
        TextField textField = new TextField("Góra");
        borderPane.setTop(textField);
        TextField textField1 = new TextField("Dol");
        borderPane.setBottom(textField1);
        TextField textField2 = new TextField("srodek");
        borderPane.setCenter(textField2);
        TextField textField3 = new TextField("lewo");
        borderPane.setLeft(textField3);
        TextField textField4 = new TextField("prawy");
        borderPane.setRight(textField4);

        // nasz root - borderPane
        Scene scene = new Scene(borderPane , 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Układ elementów w widoku");
        primaryStage.show();
    }
}

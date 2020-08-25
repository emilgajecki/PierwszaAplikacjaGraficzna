import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class KontrolkiZadanie extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Pasek Postepu");
        label.setLayoutX(10);
        label.setLayoutY(35);

        Label finishedLabel = new Label("Zakonczono");
        finishedLabel.setLayoutX(10);
        finishedLabel.setLayoutY(75);

        ProgressBar progressBar = new ProgressBar();
        progressBar.setLayoutX(10);
        progressBar.setLayoutY(50);
        progressBar.setProgress(0);

        Button buttonStart = new Button("Start");
        buttonStart.setLayoutX(10);
        buttonStart.setLayoutY(100);

        Button buttonRestart = new Button("Restart");
        buttonRestart.setLayoutX(60);
        buttonRestart.setLayoutY(100);



        finishedLabel.setVisible(false);
        buttonRestart.setDisable(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<=100; i++){
                    double progressValue = 0.01*i;

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progressValue);
                        }
                    });
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        finishedLabel.setVisible(true);
                        buttonRestart.setVisible(true);
                        buttonRestart.setDisable(false);
                    }
                });

            }
        };


        buttonStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                buttonStart.setDisable(true);
                new Thread(runnable).start();
            }

        });

        buttonRestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                progressBar.setProgress(0);
                finishedLabel.setDisable(false);
                buttonStart.setDisable(false);
                buttonRestart.setDisable(true);
            }
        });


        Group group = new Group();
        group.getChildren().add(label);
        group.getChildren().add(finishedLabel);
        group.getChildren().add(progressBar);
        group.getChildren().add(buttonStart);
        group.getChildren().add(buttonRestart);



        Scene scene = new Scene(group, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplikacja Kontroli Zadanie");
        primaryStage.show();


    }
}

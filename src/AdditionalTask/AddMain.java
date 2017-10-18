package AdditionalTask;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class AddMain extends Application {


    public static void Players(Pane root) {
        Play1 play1 = new Play1(3.8);
        System.out.println("\nPlayer 1:");
        play1.playSong();
        play1.show(root, 10, 30);

        Play2 play2 = new Play2(4.5);
        System.out.println("\nPlayer 2:");
        play2.playSong();
        play2.show(root, 10, 80);

        Play3 play3 = new Play3(5.8);
        System.out.println("\nPlayer 3:");
        play3.playSong();
        play3.playAllSongs();
        play3.show(root, 10, 130);

        Play4 play4 = new Play4(1.0);
        System.out.println("\nPlayer 4:");
        play4.playSong();
        play4.playAllSongs();
        play4.show(root, 10, 220);

        Play5 player5 = new Play5(1.0);
        System.out.println("\nPlayer 5:");
        player5.playSong();
        player5.playAllSongs();
        player5.show(root, 10, 310);

        Play6 play6 = new Play6(1.0);
        System.out.println("\nPlayer 6:");
        play6.playSong();
        play6.playAllSongs();
        play6.shuffle();
        play6.playAllSongs();
        play6.show(root, 10, 400);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Players");
        primaryStage.setWidth(300);
        primaryStage.setHeight(900);
        Pane root = new Pane();
        Players(root);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
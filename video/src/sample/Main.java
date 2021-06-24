package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import javax.print.attribute.standard.MediaName;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Media media;
        media = new Media("file:v.mkv");
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView= new MediaView(mediaPlayer);
        HBox root = new HBox();
        root.getChildren().add(mediaView);
        Scene scene= new Scene(root,720,1080);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vidio");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

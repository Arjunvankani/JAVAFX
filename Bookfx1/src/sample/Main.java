package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.VideoTrack;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Label;


import java.awt.*;
import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        StackPane root =new StackPane();
        FileInputStream fileInputStream = new FileInputStream("src/sample/view.jpg");
        Image image = new Image(fileInputStream);

        ImageView imageView = new ImageView(image);
        Label label = new Label("New ", imageView);
        Scene scene = new Scene(root,720,1020);
        root.getChildren().add(label);
        primaryStage.setTitle("Image");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

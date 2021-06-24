package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Circle circle= new Circle(150,150,50);
        circle.setFill(Color.BLANCHEDALMOND);
        circle.setStroke(Color.LIGHTCYAN);

        Timeline timeline = new Timeline();
        KeyValue keyValue= new KeyValue(circle.translateXProperty(),200);
        KeyFrame keyFrame = new KeyFrame(Duration.millis(1000),keyValue);
        timeline.getKeyFrames().addAll(keyFrame);
        timeline.setCycleCount(5);
        timeline.setAutoReverse(true);
        timeline.play();
        Group root = new Group();
        root.getChildren().addAll(circle);
        Scene scene = new Scene(root,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Timeline");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

package sample;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.lang.management.GarbageCollectorMXBean;
import java.text.CharacterIterator;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Circle circle = new Circle(50,20,40);

        circle.setFill(Color.LIGHTCYAN);
        circle.setStroke(Color.BROWN);

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(1000));
        pathTransition.setNode(circle);
        Circle circle1 = new Circle(120,140,70);
        pathTransition.setPath(circle1);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(5);
        pathTransition.setAutoReverse(true);
        pathTransition.play();
        Group root = new Group();
        root.getChildren().addAll(circle);
        Scene scene =new Scene(root,700,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Path");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

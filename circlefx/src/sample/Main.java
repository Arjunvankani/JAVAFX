package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setFill(Color.LIGHTCORAL);
        Circle circle1 = new Circle();
        circle1.setCenterX(125);
        circle1.setCenterY(125);
        circle1.setRadius(30);
        circle1.setFill(Color.LIGHTCYAN);
        Circle circle2 = new Circle();
        circle2.setCenterX(85);
        circle2.setCenterY(85);
        circle2.setRadius(30);
        circle2.setFill(Color.LIGHTBLUE);
        Group root =new Group(circle,circle1,circle2);
        Scene scene = new Scene(root,300,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

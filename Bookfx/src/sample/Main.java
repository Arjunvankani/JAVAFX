package sample;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.SceneAntialiasing;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    StackPane root = new StackPane();
   Rectangle rectangle[ ] = new Rectangle[10];
    rectangle[0] = new Rectangle(10,20);
    rectangle[1] = new Rectangle(30,60);
    rectangle[2] = new Rectangle(50,80);
    rectangle[3] = new Rectangle(70,100);
    rectangle[4] = new Rectangle(100,120);
    rectangle[5] = new Rectangle(120,150);

    int red =18;
    int green=3;
    int blue=50;
        rectangle[0].setFill(Color.rgb(red, green, blue, 0.1));
        rectangle[1].setFill(Color.rgb(red, green, blue, 0.2));
        rectangle[2].setFill(Color.rgb(red, green, blue, 0.3));
        rectangle[3].setFill(Color.rgb(red, green, blue, 0.4));
        rectangle[4].setFill(Color.rgb(red, green, blue, 0.5));
        rectangle[5].setFill(Color.rgb( red,green,blue,0.6));



        root.getChildren().addAll(rectangle[0],rectangle[1],rectangle[2],rectangle[3],rectangle[4],rectangle[5]);



        Scene scene = new Scene(root,300,200);
    primaryStage.setTitle("Color");
    primaryStage.setScene(scene);
    primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

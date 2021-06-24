package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Rectangle rectangle =new Rectangle(10,10,80,70);
        rectangle.setArcHeight(50);
        rectangle.setArcWidth(50);
        rectangle.setFill(Color.LIGHTCYAN);
        rectangle.setOnMouseClicked(e-> rectangle.setFill(Color.LIGHTYELLOW));

        Rectangle rectangle1 = new Rectangle(60,60,80,70);
        rectangle1.setArcWidth(40);
        rectangle1.setArcHeight(40);
        rectangle1.setFill(Color.LIGHTYELLOW);
        rectangle1.setOnMouseClicked(e-> rectangle1.setFill(Color.LIGHTCORAL));

        Rectangle rectangle2 =new Rectangle(110,110,80,70);
        rectangle2.setArcHeight(30);
        rectangle2.setArcWidth(30);
        rectangle2.setFill(Color.LIGHTCORAL);
        rectangle2.setOnMouseClicked(e-> rectangle2.setFill(Color.LIGHTPINK));

        Rectangle rectangle3 = new Rectangle(160,160,80,70);
        rectangle3.setArcWidth(20);
        rectangle3.setArcHeight(20);
        rectangle3.setFill(Color.LIGHTPINK);
        rectangle3.setOnMouseClicked(e-> rectangle3.setFill(Color.LIGHTCYAN));
        Group root = new Group(rectangle,rectangle1,rectangle2,rectangle3);
        Scene scene = new Scene(root,300,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rectangle ..");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

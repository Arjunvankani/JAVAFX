package sample;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    Stage window;
    Button button;
    Stage Controller;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        window = primaryStage;
        window.setTitle("The new boaton");

        button = new Button("Click Here");


        //This class will handle the button events

        button.setOnAction(e -> {
            System.out.println("Yes youu....");
            System.out.println("and me.....");
        });


            StackPane layout = new StackPane();
            layout.getChildren().add(button);



        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

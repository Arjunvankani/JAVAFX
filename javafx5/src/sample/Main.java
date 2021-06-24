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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        window = primaryStage;
        window.setTitle("JavaFx - The newButton");

       window.setOnCloseRequest(e->{
           e.consume();
           closeProgram();
       });

        button = new Button("Close Program");
        button.setOnAction(e-> closeProgram());


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private  void closeProgram(){

        Boolean answer = ConfirmBox.display("Title","Sure you want to exit??");
        if (answer)
            System.out.println("Files were saved Succesfully !!");
        window.close();
    }
}

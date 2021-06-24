package sample;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
        window.setTitle("Log in ");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(20);
        grid.setHgap(40);

        // Name label
        Label nameLabel = new Label("UserName : ");
        GridPane.setConstraints(nameLabel, 0,0);

        //Name Input
        TextField nameInput = new TextField("Arjun");
        GridPane.setConstraints(nameInput, 1, 0);

        //Passqord Label
        Label passLabel = new Label("Password : ");
        GridPane.setConstraints(passLabel,0,1);

        //Password Input
        PasswordField passInput = new PasswordField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1 ,1);

        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton,1 ,2);

        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);

        Scene scene = new Scene(grid, 440,210);

        window.setScene(scene);
        window.show();
    }
}

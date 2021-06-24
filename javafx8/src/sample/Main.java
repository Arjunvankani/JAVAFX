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
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World");
        window = primaryStage;
        window.setTitle("Log in ");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(20);
        grid.setHgap(40);

        // Name label
        Label nameLabel = new Label("UserName : ");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
        TextField nameInput = new TextField("Arjun");
        GridPane.setConstraints(nameInput, 1, 0);

        //Passqord Label
        Label passLabel = new Label("Password : ");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password Input
        PasswordField passInput = new PasswordField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        //Age Label
        Label ageLabel = new Label("Age : ");
        GridPane.setConstraints(ageLabel, 0, 2);

        //Age Input
        TextField ageInput = new TextField();
        GridPane.setConstraints(ageInput, 1, 2);


        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 3);
        loginButton.setOnAction(e -> {
            System.out.println(nameInput.getText());
            System.out.println(passInput.getText());
            System.out.println(isInt(ageInput, ageInput.getText()));

        });

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput,ageLabel,ageInput, loginButton);

        Scene scene = new Scene(grid, 440, 210);

        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField input, String message)
    {
        try
        {
            int age = Integer.parseInt(input.getText());
            System.out.println(("User is : " + age));
            return true;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error " + message + " is not a number");
        }

        return false;
    }
}


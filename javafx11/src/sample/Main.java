package sample;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    Stage window;
    Button button;
    Scene scene;
    ComboBox<String> comboBox;

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

        //CheckBox
        CheckBox box1 = new CheckBox("Good Design");
        GridPane.setConstraints(box1, 1, 3);

        CheckBox box2 = new CheckBox("Responsive");
        GridPane.setConstraints(box2, 1, 4);
        //default selected
        box2.setSelected(true);

        ChoiceBox<String> choiceBox = new ChoiceBox<String>();
        //getItems returns the Observation object which you can add item to
        choiceBox.getItems().add("HTML");
        choiceBox.getItems().add("CSS");
        choiceBox.getItems().add("PHP");
        choiceBox.getItems().addAll("PhpMyAdmin","MySql","Java");
        choiceBox.setValue("Java");
        //Listen for Selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v,oldValue, newValue) -> System.out.println(newValue) );
        GridPane.setConstraints(choiceBox, 1, 5);



        //Combo Box
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Inheritance",
                "Encapsulation",
                "Constructor"
        );
        comboBox.setPromptText("What is your Choicee??");
        //editt that time
        comboBox.setEditable(true);
        GridPane.setConstraints(comboBox, 1, 6);




        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 7);
        loginButton.setOnAction(e -> {
            System.out.println(nameInput.getText());
            System.out.println(passInput.getText());
            System.out.println(isInt(ageInput, ageInput.getText()));
            handleOptions(box1, box2);
            getChoice(choiceBox);
            printChoice();
        });

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, ageLabel, ageInput, box1, box2,choiceBox,comboBox, loginButton);

        Scene scene = new Scene(grid, 720, 420);

        window.setScene(scene);
        window.show();
    }

    private void printChoice() {
        System.out.println("User Selected :"+comboBox.getValue());
    }

    //To get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox) {
        String devloper = choiceBox.getValue();
        System.out.println("\n"+devloper);

    }

    //Handle Checkbox option
    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "FeedBack : \n";
        if (box1.isSelected())
            message += "Good Design\n";
        if (box2.isSelected())
            message += "Responsive\n";
        System.out.println(message);

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


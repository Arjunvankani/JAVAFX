package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

        Stage window;
        Scene scene1,scene2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label(" Welcome to the frist scene !");
        Button button1 = new Button("Go to Scence 2");

        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 = childern are liad out in vertical coloum
        VBox layout1 = new VBox(40);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 500, 500);

        //Button 2
        Button button2 = new Button("This scence sucks, go back to scence 1 ..");
        button2.setOnAction(e-> window.setScene(scene1));

        //Layout 2

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Screen Switiching  ...");
        window.show();

    }
}

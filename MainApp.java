package lesson_4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btnEnter = new Button();
        TextField textField = new TextField();
        Label labelMain = new Label();
        labelMain.setTextAlignment(TextAlignment.LEFT);

        btnEnter.setText("ENTER");
        btnEnter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                labelMain.setText(labelMain.getText()=="" ? textField.getText() : labelMain.getText() + "\n" + textField.getText());
                textField.clear();
            }
        });

        textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                    labelMain.setText(labelMain.getText()=="" ? textField.getText() : labelMain.getText() + "\n" + textField.getText());
                    textField.clear();
                }
            }
        });

        BorderPane borderMain = new BorderPane();
        BorderPane borderBottom = new BorderPane();
        borderMain.setCenter(labelMain);
        borderMain.setBottom(borderBottom);
        borderBottom.setCenter(textField);
        borderBottom.setRight(btnEnter);


        Scene scene = new Scene(borderMain, 300, 250);

        primaryStage.setTitle("Trust Massage");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}

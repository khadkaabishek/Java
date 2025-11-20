
//create a javafx application that uses mouse and action listener 

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.*;

public class JavaFx extends Application {
    @Override
    public void start(Stage stg) {
        TextField text = new TextField("out");
        Label label = new Label("x : 0 y : 0");
        Button btn = new Button("UpperCase");
        FlowPane root = new FlowPane();
        root.getChildren().addAll(text, label, btn);

        Scene scene = new Scene(root, 400, 500);

        stg.setScene(scene);
        stg.setTitle("Mouse & Action Listener Demo");
        stg.show();

        btn.setOnAction(e -> {
            text.setText(text.getText().toUpperCase());
        });

        scene.setOnMouseEntered(e -> {
            text.setText("in");
        });

        scene.setOnMouseExited(e -> {
            text.setText("out");
        });

        scene.setOnMouseMoved(e -> {
            label.setText("X : " + e.getX() + " Y : " + e.getY());
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}


import javafx.application.Applicaion;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Login extends Application {
    public void start(Stage stage) {
        Label name = new Label("Username");
        Label pass = new Label("Password");
        TextField uname = new TextField();
        Password pwd = new Password();
        Button login = new Button("Login");
        GridPane root = new GridPane(2, 3);
        root.addColumn(0, name, pass);
        root.addColumn(1, uname, pwd, login);
        root.vgap(20);
        root.hgap(10);
        Scene scene = new Scene(root, 400, 500);
        stage.setScene(scene);
        stage.show();
        // root.getChildren().addAll()
    }

    public static void main(String[] args) {
        launch(args);
    }
}
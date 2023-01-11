import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

/**
 * Write a description of JavaFX class JavaFXTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JavaFXTest extends Application
{
    @Override
    public void start(Stage stage){
        Text text = new Text();
        text.setText("Hello!");
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 400);
        root.getChildren().add(text);
        stage.setScene(scene);
        stage.setTitle("JavaFX test");
        stage.show();
    }
    
    public static void main(String[]args){
        launch(args);
    }
}

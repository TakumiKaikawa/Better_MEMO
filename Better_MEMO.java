import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.application.Application;


public class Better_MEMO extends Application{
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage){
        VBox layout = new VBox(20);

        Scene scene = new Scene(layout,600,300);
        Label titleLabel = new Label("Better_MEMO");
        layout.getChildren().add(titleLabel);

        stage.setScene(scene);
        stage.show();
    }
}
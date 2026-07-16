import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Better_MEMO extends Application{
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage){
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout,300,600);
        Label titleLabel = new Label("Better_MEMO");
        layout.getChildren().add(titleLabel);

        TextField textfield = new TextField();
        layout.getChildren().add(textfield);

        Button btn = new Button("記録する");
        layout.getChildren().add(btn);

        Label recordLabel = new Label();

        Memory memory = new Memory();

        btn.setOnAction(e ->{
            String record = textfield.getText();
            memory.save(record);

            recordLabel.setText(String.join("\n",memory.list));

            textfield.clear();
        });

        stage.setScene(scene);
        stage.show();
    }
}
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Better_MEMO extends Application{
    Memory memory = new Memory();
    TextField textfield = new TextField();
    Label recordLabel = new Label();

    // setOnActionの中の処理
        public void saveMemo(){
        String record = textfield.getText();
            memory.save(record);

            recordLabel.setText(String.join("\n",memory.list));

            textfield.clear();
        }


    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage){
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout,300,600);

        stage.setTitle("Better_MEMO");
        Label titleLabel = new Label("Better_MEMO");
        layout.getChildren().add(titleLabel);

        layout.getChildren().add(textfield);

        Button btn = new Button("記録する");
        layout.getChildren().add(btn);

        layout.getChildren().add(recordLabel);



        btn.setOnAction(e ->saveMemo()
        );

        stage.setScene(scene);
        stage.show();
    }
}
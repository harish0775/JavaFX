import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class EventHandling extends Application implements EventHandler<ActionEvent> {
    Button b;
    int count = 0;
    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        b = new Button("ok");
        b.setOnAction(this);
        b.setPrefSize(100, 30);
        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp,400,400);
        stage.setScene(sc);
        stage.show();
         
    }
    public void handle(ActionEvent ae){
        count++;
        b.setText(""+count);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
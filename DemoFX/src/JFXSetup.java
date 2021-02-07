import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
public class JFXSetup extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
    //     stage.setTitle("Hello Brother");
    //   stage.show();
      Button b = new Button("click Me");
      FlowPane fp = new FlowPane();
     fp.getChildren().add(b);
      Scene sc = new Scene(fp);
     stage.setScene(sc);
     stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

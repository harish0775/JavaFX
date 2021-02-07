import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.*;

public class practice extends Application{

   public void start(Stage stage) throws Exception{
       Button b = new Button("click Me");
        b.setTextFill(Color.WHEAT);
        b.setMnemonicParsing(true);
        Tooltip tp = new Tooltip("click here");
        b.setTooltip(tp);
        
        b.setStyle("-fx-border-Color:black;-fx-background-color:grey");
        Alert a = new Alert(AlertType.INFORMATION,"Clicked Here");
        b.setOnAction(e ->a.show());

      
      FlowPane fp = new FlowPane(b);
      Scene sc = new Scene(fp,800,800);
      stage.setTitle("Hello");
      stage.setScene(sc);
      stage.show();
    
     

   }
   public static void main(String[] args) {
       launch(args);
   }
}

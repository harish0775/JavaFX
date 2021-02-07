import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;


public class JFXproperty extends Application
{
    public void start(Stage stage) throws Exception
    {
        Button b=new Button("Click _Me"); // clicked button box
        b.setTextFill(Color.BLACK); //clicked box color
        b.setMnemonicParsing(true); //under line
        Tooltip tp=new Tooltip("Click this Button to Save Data");  // hover over tool tip show
        b.setTooltip(tp);
       b.setStyle("-fx-border-color:yellow;-fx-background-color:red");//set border&background color
        Alert a=new Alert(AlertType.INFORMATION,"Button is Clicked"); // alert pop up , alert typer Information 
          // different type of alert : information error,warning,conformation etc
       b.setOnAction(e->a.show());
       
        FlowPane fp=new FlowPane(b);
        
        Scene sc=new Scene(fp,400,400);
        stage.setScene(sc);
        stage.show();
        
        
    }
    public static void main(String[] args) 
    {
        launch(args);
    }   
}

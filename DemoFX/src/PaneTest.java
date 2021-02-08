import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PaneTest extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
         ImageView iv1=null;
         ImageView iv2=null;
         ImageView iv3=null;
         
         iv1=new ImageView(new Image(new FileInputStream("images/eiffel.jpg")));
         iv2=new ImageView(new Image(new FileInputStream("images/liberty.jpg")));
         iv3=new ImageView(new Image(new FileInputStream("images/qutub.jpg")));
         
         ScrollPane sp1=new ScrollPane(iv1);
         ScrollPane sp2=new ScrollPane(iv2);
         ScrollPane sp3=new ScrollPane(iv3);
         
         
         TitledPane t1=new TitledPane("Eiffel",sp1);
         TitledPane t2=new TitledPane("Liberty",sp2);
         TitledPane t3=new TitledPane("Qutub",sp3);
        
         Accordion root=new Accordion();
         root.getPanes().addAll(t1,t2,t3);
         
         
        Scene sc=new Scene(root,400,400);
        
        stage.setScene(sc);
        stage.show();

    }
    public static void main(String[] args) 
    {
        launch(args);
    }    
}

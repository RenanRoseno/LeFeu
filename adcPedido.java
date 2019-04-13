package restaurante.leFeu.view;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author rosen
 */
public class adcPedido extends Application {
   private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("adcPedido.fxml"));
        
        Scene scene = new Scene(root);
      scene.setRoot(root);
       stage.setScene(scene);
       stage.setTitle("Restaurante LeFeu");
       stage.setResizable(false);
       stage.show();
       setStage(stage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
 
    }
    public static Stage getStage(){
        return stage;
    }
    public static void setStage(Stage s){
        adcPedido.stage = s;
    }
}
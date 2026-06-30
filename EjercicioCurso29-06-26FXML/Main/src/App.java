import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    
    public void start(Stage Stage) throws Exception {
        FXMLLoader LLamar = new FXMLLoader(getClass().getResource("Controller.java"));
        Scene Pantalla = new Scene(LLamar.load(), 400, 400);

        Stage.setTitle("App de Cambio".toUpperCase());
        Stage.setScene(Pantalla);
        Stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class ControleurInspirationVisuelle {

    @FXML protected void trouverInspiration(ActionEvent evenement) {

        System.out.println("trouverInspiration( )");

        // Singleton obligatoire car le framework de JavaFX cache l'instance
        //VueInspirationVisuelle.getInstance().ecrireUnMessage("allo");
    }

}
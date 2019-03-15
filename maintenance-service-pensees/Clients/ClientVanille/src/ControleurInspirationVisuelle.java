import accesseur.PenseeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import modele.Pensee;
import outils.Journal;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

public class ControleurInspirationVisuelle  implements Initializable {
    protected PenseeDAO penseeDAO = new PenseeDAO();

    public ControleurInspirationVisuelle()
    {
        List<Pensee> listePensees = penseeDAO.listerPensees();

        for(Iterator<Pensee> visiteur = listePensees.iterator(); visiteur.hasNext(); )
        {
            Pensee pensee = visiteur.next();
            Journal.ecrire(5, pensee.getMessage() + "(" + pensee.getAuteur() + ")");
        }
        ControleurInspirationVisuelle.instance = this;
    }
    protected static ControleurInspirationVisuelle instance = null;
    public static ControleurInspirationVisuelle getInstance() {return ControleurInspirationVisuelle.instance;}
    @FXML protected void trouverInspiration(ActionEvent evenement) {

        System.out.println("trouverInspiration( )");

        // Singleton obligatoire car le framework de JavaFX cache l'instance
        //VueInspirationVisuelle.getInstance().ecrireUnMessage("allo");
    }
    public void initialiser()
    {
        VueInspirationVisuelle.getInstance().afficherListePensees();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

}
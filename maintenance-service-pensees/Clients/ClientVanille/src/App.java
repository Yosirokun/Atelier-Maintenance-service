import java.util.Iterator;
import java.util.List;
import accesseur.PenseeDAO;
import modele.Pensee;
import outils.Journal;

public class App {

	public static void main(String[] args) {

		Journal.activerNiveau(0);



		//Pensee pensee = new Pensee("Rossetti","Ce qui est plus triste qu une oeuvre inachevee, c est une oeuvre jamais commencee.");
		//penseeDAO.ajouterPensee(pensee);

		VueInspirationVisuelle.launch(VueInspirationVisuelle.class, args);

	}
	

}


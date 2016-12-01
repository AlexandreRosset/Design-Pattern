package connect4;

/**
 * Created by alexa on 24/11/2016.
 */
public class CaseDePlateau {

    private String valeur;

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        if(valeur != "X" && valeur != "O") {
            throw new RuntimeException();
        }
        this.valeur = valeur;
    }

    public CaseDePlateau() {
        valeur = " ";
    }
}

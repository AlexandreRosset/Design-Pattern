package connect4;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by alexa on 24/11/2016.
 */
public class PlateauDeJeuTest {
    private PlateauDeJeu P;
    @Before
    public void init() {
        P = new PlateauDeJeu();
    }
    @Test
    public void instensiationPlateauDeJeu() {
        PlateauDeJeu P = new PlateauDeJeu();
    }
    @Test (expected = RuntimeException.class)
    public void modificationDeCase() {
        P.ajouterUnPiont(5, "X");
        P.ajouterUnPiont(9, "X");
    }
    @Test (expected = PilePleineException.class)
    public void ColonnePleine() {
        P.ajouterUnPiont(5, "X");
        P.ajouterUnPiont(5, "X");
        P.ajouterUnPiont(5, "X");
        P.ajouterUnPiont(5, "X");
        P.ajouterUnPiont(5, "X");
        P.ajouterUnPiont(5, "X");
        P.ajouterUnPiont(5, "X");
    }
}
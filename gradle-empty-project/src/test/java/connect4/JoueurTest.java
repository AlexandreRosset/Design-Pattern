package connect4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexa on 24/11/2016.
 */
public class JoueurTest {
    @Test
    public void creationJoueur()
    {
        Joueur j = new Joueur("X");
        assertEquals("X", j.getSymbole());
    }
    @Test (expected = MauvaisSymboleException.class)
    public void creationJoueur2()
    {
        Joueur j = new Joueur("Toto");
    }
}
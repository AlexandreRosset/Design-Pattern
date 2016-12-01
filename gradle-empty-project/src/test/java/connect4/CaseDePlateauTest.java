package connect4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexa on 24/11/2016.
 */
public class CaseDePlateauTest {
    private CaseDePlateau caseDePlateau;
    @Before
    public void init() {
        caseDePlateau = new CaseDePlateau();
    }
    @Test
    public void instensiationCaseDePlateau() {
        CaseDePlateau c = new CaseDePlateau();
    }
    @Test (expected = RuntimeException.class)
    public void testgetsetValeur() {
        assertEquals(" ", caseDePlateau.getValeur());
        caseDePlateau.setValeur("X");
        assertEquals("X", caseDePlateau.getValeur());
        caseDePlateau.setValeur("Toto");
        assertEquals("X", caseDePlateau.getValeur());
    }
}
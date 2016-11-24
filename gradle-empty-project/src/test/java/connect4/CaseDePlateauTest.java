package connect4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexa on 24/11/2016.
 */
public class CaseDePlateauTest {
    private CaseDePlateau c;
    @Before
    public void init() {
        c = new CaseDePlateau();
    }
    @Test
    public void instensiationCaseDePlateau() {
        CaseDePlateau c = new CaseDePlateau();
    }
    @Test (expected = RuntimeException.class)
    public void testgetsetValeur() {
        assertEquals(" ", c.getValeur());
        c.setValeur("X");
        assertEquals("X", c.getValeur());
        c.setValeur("Toto");
        assertEquals("X", c.getValeur());
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import roomalaisetnumerot.RoomalaisetNumerot;

public class RoomalaisetNumerotTest {

    RoomalaisetNumerot rn;

    @Before
    public void setUp() {
        rn = new RoomalaisetNumerot();
    }

    @Test
    public void palauttaaJotain() {
        assertNotNull(rn.tekstiksi(1));
    }

    @Test
    public void ykkönenToimii() {
        assertEquals("I", rn.tekstiksi(1));
    }

    @Test
    public void kakkonenToimii() {
        assertEquals("II", rn.tekstiksi(2));
    }

    @Test
    public void kolmonenToimii() {
        assertEquals("III", rn.tekstiksi(3));
    }

    @Test
    public void nelonenToimii() {
        assertEquals("IV", rn.tekstiksi(4));
    }
    
    @Test
    public void vitonenToimii() {
        assertEquals("V", rn.tekstiksi(5));
    }
    
    
}

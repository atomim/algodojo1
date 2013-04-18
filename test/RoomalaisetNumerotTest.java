
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
    
    @Test
    public void seiskaToimii() {
        assertEquals("VII", rn.tekstiksi(7));
    }
    
    @Test
    public void ysiToimii() {
        assertEquals("IX", rn.tekstiksi(9));
    }
    
    @Test
    public void kymppiToimii() {
        assertEquals("X", rn.tekstiksi(10));
    }
    
    @Test
    public void yhdestätoistaKahteenkymmeneenToimii() {
        
        assertEquals("XI", rn.tekstiksi(11));
        assertEquals("XII", rn.tekstiksi(12));
        assertEquals("XIII", rn.tekstiksi(13));
        assertEquals("XIV", rn.tekstiksi(14));
        assertEquals("XV", rn.tekstiksi(15));
        assertEquals("XVI", rn.tekstiksi(16));
        assertEquals("XVII", rn.tekstiksi(17));
        assertEquals("XVIII", rn.tekstiksi(18));
        assertEquals("XIX", rn.tekstiksi(19));
        assertEquals("XX", rn.tekstiksi(20));

        
        
        
    }
}

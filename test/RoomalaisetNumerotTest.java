
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
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            assertEquals("X" + vastaukset[i - 1], rn.tekstiksi(10 + i));
        }
    }

    @Test
    public void kaksyhdestKolmeenkymppiinToimii() {
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            assertEquals("XX" + vastaukset[i - 1], rn.tekstiksi(20 + i));
        }
    }

    @Test
    public void kolmestyhestKolmeysiinToimii() {
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 1; i <= 9; i++) {
            assertEquals("XXX" + vastaukset[i - 1], rn.tekstiksi(30 + i));
        }
    }
    
    @Test
    public void nelkytToimii() {
        assertEquals("XL", rn.tekstiksi(40));
   
    }
    
    @Test
    public void viiskytToimii() {
        assertEquals("L", rn.tekstiksi(50));
   
    }
    @Test
    public void viidestäkymmenestäyhdestäKuuteenkymmeneenToimii() {
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            assertEquals("L" + vastaukset[i - 1], rn.tekstiksi(50 + i));
        }
    }

    @Test(expected=IllegalArgumentException.class)
    public void negatiivinenFailaa() {
        rn.tekstiksi(-1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void nollaFailaa() {
        rn.tekstiksi(0);
    }
}

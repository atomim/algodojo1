
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
    public void kutonenToimii() {
        assertEquals("VI", rn.tekstiksi(6));
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

    @Test
    public void kuudestakymmenestäSeitsemäänkymmeneenToimii() {
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            assertEquals("LX" + vastaukset[i - 1], rn.tekstiksi(60 + i));
        }
    }

    @Test
    public void seitsemästäkymmenestäKahdeksaankymmeneenToimii() {
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            assertEquals("LXX" + vastaukset[i - 1], rn.tekstiksi(70 + i));
        }
    }

    @Test
    public void kahdeksastakymmenestäKahdeksaankymmeneenyhdeksäänToimii() {
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 1; i <= 9; i++) {
            assertEquals("LXXX" + vastaukset[i - 1], rn.tekstiksi(80 + i));
        }
    }

    @Test
    public void ysikytToimii() {
        assertEquals("XC", rn.tekstiksi(90));
    }

    @Test
    public void ysikytViivaYsiysiToimii() {
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 1; i <= 9; i++) {
            assertEquals("XC" + vastaukset[i - 1], rn.tekstiksi(90 + i));
        }
    }

    @Test
    public void sataToimii() {
        assertEquals("C", rn.tekstiksi(100));
    }

    @Test
    public void sataViivaSatakymmenenToimii() {
        String vastaukset[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            assertEquals("C" + vastaukset[i - 1], rn.tekstiksi(100 + i));
        }
    }
    
    @Test
    public void pistokokeet() {
        assertEquals("CXV", rn.tekstiksi(115));
        assertEquals("CXXVII", rn.tekstiksi(127));
        assertEquals("CXL", rn.tekstiksi(140));
        assertEquals("CLXIX", rn.tekstiksi(169));
        assertEquals("CXCII", rn.tekstiksi(192));
        assertEquals("CMXIX", rn.tekstiksi(919));
        assertEquals("DCCXLIV", rn.tekstiksi(744));
    }
    
    @Test
    public void sadatToimii() {
        assertEquals("CC", rn.tekstiksi(200));
        assertEquals("CCC", rn.tekstiksi(300));
        assertEquals("CD", rn.tekstiksi(400));
        assertEquals("D", rn.tekstiksi(500));
        assertEquals("DC", rn.tekstiksi(600));
        assertEquals("DCC", rn.tekstiksi(700));
        assertEquals("DCCC", rn.tekstiksi(800));
    }
    
   

    @Test(expected = IllegalArgumentException.class)
    public void negatiivinenFailaa() {
        rn.tekstiksi(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nollaFailaa() {
        rn.tekstiksi(0);
    }
}

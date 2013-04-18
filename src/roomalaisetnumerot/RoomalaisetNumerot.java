/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roomalaisetnumerot;

/**
 *
 * @author olavilin
 */
public class RoomalaisetNumerot {

    private String rekursoi(int luku) {
        if (luku >= 10) {
            String lol = rekursoi(luku / 10);
            lol = lol.replace("C", "M").replace("X", "C").replace("L", "D").replace("V", "L").replace("I", "X");
            return lol + rekursoi(luku % 10);
        }
        String vastaukset[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return vastaukset[luku];
    }

    public String tekstiksi(int luku) {
        if (luku <= 0) {
            throw new IllegalArgumentException(
                    "Epäpositiivisia lukuja ei saa laittaa");
        }
        return rekursoi(luku);
    }
}

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
        if (luku == luku) {
            return vastaukset[luku];
        }

        if (luku == 4) {
            return "IV";
        }
        if (luku == 5) {
            return "V";
        }
        if (luku == 9) {
            return "IX";
        }
        if (luku == 10) {
            return "X";
        }
        if (luku == 50) {
            return "L";
        }
        if (luku == 100) {
            return "C";
        }
        if (luku == 500) {
            return "D";
        }

        if (luku > 500) {
            return ("D" + rekursoi(luku - 500)).replace("DCD", "CM");
        }
        if (luku > 100) {
            return ("C" + rekursoi(luku - 100)).replace("CCCC", "CD");
        }
        if (luku > 50) {
            return ("L" + rekursoi(luku - 50)).replace("LXL", "XC");
        }
        if (luku > 10) {
            return ("X" + rekursoi(luku - 10)).replace("XXXX", "XL");
        }
        if (luku > 5) {
            return "V" + rekursoi(luku - 5);
        }
        String pelle = "";
        for (int i = 0; i < luku; i++) {
            pelle = pelle + "I";
        }
        return pelle;
    }

    public String tekstiksi(int luku) {
        if (luku <= 0) {
            throw new IllegalArgumentException(
                    "Epäpositiivisia lukuja ei saa laittaa");
        }
        return rekursoi(luku);
    }
}

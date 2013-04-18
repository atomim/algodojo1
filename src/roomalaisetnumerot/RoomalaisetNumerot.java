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

    public String tekstiksi(int luku) {
        if (luku <= 0) {
            throw new IllegalArgumentException(
                    "epäpositiivisia lukuja ei saa laittaa");
        }
        if (luku == 4) {
            return "IV";
        }
        if(luku==5) return "V";
        if (luku == 9) {
            return "IX";
        }
        if (luku==10) return "X";
        if(luku== 50) return "L";
        if (luku > 50) return ("L" + tekstiksi(luku-50));
        if (luku > 10) {
            return ("X" + tekstiksi(luku - 10)).replace("XXXX", "XL");
        }
   
        if (luku > 5) {
            return "V" + tekstiksi(luku - 5);
        }
        String pelle = "";
        for (int i = 0; i < luku; i++) {
            pelle = pelle + "I";
        }
        return pelle;
    }
}

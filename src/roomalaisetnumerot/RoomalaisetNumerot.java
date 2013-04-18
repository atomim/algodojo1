package roomalaisetnumerot;

public class RoomalaisetNumerot {

    private String rekursoi(int luku) {
        if (luku >= 10) {
            return rekursoi(luku / 10).replace("C", "M").replace("X", "C").replace("I", "X").replace("L", "D").replace("V", "L") + rekursoi(luku % 10);
        }
        return (new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"})[luku];
    }

    public String tekstiksi(int luku) {
        if (luku <= 0) {
            throw new IllegalArgumentException(
                    "Epäpositiivisia lukuja ei saa laittaa");
        }
        return rekursoi(luku);
    }
}

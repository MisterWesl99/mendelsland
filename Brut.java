package mendelsland2;

import java.util.*;

public class Brut {

    static int brutgroesse;

    static ArrayList<Schmetterling> brut = new ArrayList<>();

    public static List<Schmetterling> paarung() {


        
        Schmetterling mutter = Schmetterling.erstelleVater();
        Schmetterling vater = Schmetterling.erstelleVater();

        Schmetterling kind = new Schmetterling(null, null, null);

        for (int i = 0; i < (brutgroesse); i++) {

            int a = (Math.random() <= 0.5) ? 1 : 2;
            if (a == 1) {
                kind.musterung = vater.getMusterung();
            } else {
                kind.musterung = mutter.getMusterung();
            }

            int b = (Math.random() <= 0.5) ? 1 : 2;
            if (b == 1) {
                kind.fluegelfarbe = mutter.getFluegelfarbe();
                
            } else {
                kind.fluegelfarbe = vater.getFluegelfarbe();
                
            }

            int c = (Math.random() <= 0.5) ? 1 : 2;
            if (c == 1) {
                kind.fuehlerform = vater.getFuehlerform();
            } else {
                kind.fuehlerform = mutter.getFuehlerform();
            }

            brut.add(kind);
        }

        return brut;

    }
}

package mendelsland2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.*;

public class Brut {

    static ArrayList<Schmetterling> brut = new ArrayList<>();
    
    static int brutgroesse;

    public static List<Schmetterling> paarung() {

        brutgroesse = (int) (Math.random() * 1001)+1000;

        for (int i = 0; i < (brutgroesse); i++) {

            Schmetterling kind = new Schmetterling(null, null, null);

            int a = (int)(Math.random()*1)+1;
            if (a == 1) {
                Schmetterling.musterung = Schmetterling.vater.getMusterung();
            } else {
                Schmetterling.musterung = Schmetterling.mutter.getMusterung();
            }

            int b = (int)(Math.random()*1)+1;
            if (b == 1) {
                Schmetterling.fluegelfarbe = Schmetterling.vater.getFluegelfarbe();
            } else {
                Schmetterling.fluegelfarbe = Schmetterling.mutter.getFluegelfarbe();
            }

            int c = (int)(Math.random()*1)+1;
            if (c == 1) {
                Schmetterling.fuehlerform = Schmetterling.vater.getFuehlerform();
            } else {
                Schmetterling.fuehlerform = Schmetterling.mutter.getFuehlerform();
            }

            brut.add(kind);

        }

        return brut;
    }
}

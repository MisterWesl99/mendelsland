package mendelsland2;

import java.util.*;

public class Schmetterlingskunstler {

    public static List<Schmetterling> einfangen() {

        Fuehlerform fuehler;
        Musterung muster;
        Fluegelfarbe fluegel;

        ArrayList<Schmetterling> fang = new ArrayList<>();

        UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie die gewünschte Merkmalart an", "Musterung", "Flügelfarbe", "Fühlerform");

        if (UserInterface.givenChoice == 0) {

            UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie das gewünschte Muster an", "kein Muster", "schwarze Punkte", "schwarze Streifen");

            if (UserInterface.givenChoice == 0) {
                muster = Musterung.KEINMUSTER;
                
            } else if (UserInterface.givenChoice == 1) {
                muster = Musterung.SCHWARZEPUNKTE;

            } else {
                muster = Musterung.SCHWARZESTREIFEN;
            }

            for (int i = 0; i < Brut.brutgroesse; i++) {
                
                if (Brut.brut.get(i).getMusterung() == muster){
                    fang.add(Brut.brut.get(i));
                }
            }
        } else if (UserInterface.givenChoice == 1) {

            UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie die gewünschte Flügelfarbe an", "rot", "gelb", "grün", "blau");

            if (UserInterface.givenChoice == 0) {
                fluegel = Fluegelfarbe.ROT;
                
            } else if (UserInterface.givenChoice == 1) {
                fluegel = Fluegelfarbe.GELB;
                
            } else if (UserInterface.givenChoice == 2) {
                fluegel = Fluegelfarbe.GRUEN;
                
            } else {
                fluegel = Fluegelfarbe.BLAU;
                
            }

            for (int i = 0; i < Brut.brutgroesse; i++) {

                if (fluegel == Brut.brut.get(i).getFluegelfarbe()){
                    fang.add(Brut.brut.get(i));
                }
            }
        } else {
            UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie die gewünschte Fühlerform an", "gerade", "gekrümt");

            if (UserInterface.givenChoice == 0) {
                fuehler = Fuehlerform.GERADE;
                
            } else {
                fuehler = Fuehlerform.GEKRUEMMT;
                
            }
            for (int i = 0; i < Brut.brutgroesse; i++) {

                if (fuehler == Brut.brut.get(i).getFuehlerform()){
                    fang.add(Brut.brut.get(i));
                }
            }
        }

        return fang;

    }
    
}

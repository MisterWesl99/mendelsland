package mendelsland2;

public class Schmetterling {

    static Musterung musterung;
    static Fluegelfarbe fluegelfarbe;
    static Fuehlerform fuehlerform;
    static Schmetterling mutter;
    static Schmetterling vater;
   

    public Schmetterling(Musterung musterung, Fluegelfarbe fluegelfarbe, Fuehlerform fuehlerform) {
        
    }

    public Musterung getMusterung() {
        return musterung;
    }

    public Fluegelfarbe getFluegelfarbe() {
        return fluegelfarbe;
    }

    public Fuehlerform getFuehlerform() {
        return fuehlerform;
    }

    public static void erstelleEltern() {

        erstelleMutter();
        erstelleVater();
    }

    public static Schmetterling erstelleMutter() {

        mutter = new Schmetterling(null, null, null);

         UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie das gewünschte Muster der Mutter an", "kein Muster", "schwarze Punkte", "schwarze Streifen");

        if (UserInterface.givenChoice == 0) {
            Schmetterling.musterung = Musterung.KEINMUSTER;
        } else if (UserInterface.givenChoice == 1) {
            Schmetterling.musterung = Musterung.SCHWARZEPUNKTE;
        } else {
            Schmetterling.musterung = Musterung.SCHWARZESTREIFEN;
        }

        UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie die gewünschte Flügelfarbe der Mutter an", "rot", "gelb", "grün", "blau");

        if (UserInterface.givenChoice == 0) {
            Schmetterling.fluegelfarbe = Fluegelfarbe.ROT;
        } else if (UserInterface.givenChoice == 1) {
            Schmetterling.fluegelfarbe = Fluegelfarbe.GELB;
        } else if (UserInterface.givenChoice == 2){
            Schmetterling.fluegelfarbe = Fluegelfarbe.GRUEN;
        } else {
            Schmetterling.fluegelfarbe = Fluegelfarbe.BLAU;
        }

        UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie die gewünschte Fühlerform der Mutter an", "gerade", "gekrümmt");

        if (UserInterface.givenChoice == 0) {
            Schmetterling.fuehlerform = Fuehlerform.GERADE;
        } else {
            Schmetterling.fuehlerform = Fuehlerform.GEKRUEMMT;
        } 

        return mutter;
    }

    public static Schmetterling erstelleVater() {

        vater = new Schmetterling(null,  null, null);

        UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie das gewünschte Muster des Vaters an", "kein Muster", "schwarze Punkte", "schwarze Streifen");

        if (UserInterface.givenChoice == 0) {
            Schmetterling.musterung = Musterung.KEINMUSTER;
        } else if (UserInterface.givenChoice == 1) {
            Schmetterling.musterung = Musterung.SCHWARZEPUNKTE;
        } else {
            Schmetterling.musterung = Musterung.SCHWARZESTREIFEN;
        }

        UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie die gewünschte Flügelfarbe des Vaters an", "rot", "gelb", "grün", "blau");

        if (UserInterface.givenChoice == 0) {
            Schmetterling.fluegelfarbe = Fluegelfarbe.ROT;
        } else if (UserInterface.givenChoice == 1) {
            Schmetterling.fluegelfarbe = Fluegelfarbe.GELB;
        } else if (UserInterface.givenChoice == 2){
            Schmetterling.fluegelfarbe = Fluegelfarbe.GRUEN;
        } else {
            Schmetterling.fluegelfarbe = Fluegelfarbe.BLAU;
        }

        UserInterface.givenChoice = UserInterface.requestChoice("Bitte geben Sie die gewünschte Fühlerform des Vaters an", "gerade", "gekrümmt");

        if (UserInterface.givenChoice == 0) {
            Schmetterling.fuehlerform = Fuehlerform.GERADE;
        } else {
            Schmetterling.fuehlerform = Fuehlerform.GEKRUEMMT;
        } 

        return vater;
    }
}
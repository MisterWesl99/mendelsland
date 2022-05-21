package mendelsland2;

public class Schmetterling {

    Musterung musterung;
    Fluegelfarbe fluegelfarbe;
    Fuehlerform fuehlerform;
   

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

    public static Schmetterling erstelleVater() {

        Schmetterling vater = new Schmetterling(null, null, null);

        vater.musterung = Musterung.SCHWARZESTREIFEN;
        vater.fluegelfarbe = Fluegelfarbe.GELB;
        vater.fuehlerform = Fuehlerform.GEKRUEMMT;

        return vater;
    }

    public static Schmetterling erstelleMutter() {

        Schmetterling mutter = new Schmetterling(null, null, null);

        mutter.musterung = Musterung.SCHWARZEPUNKTE;
        mutter.fluegelfarbe = Fluegelfarbe.BLAU;
        mutter.fuehlerform = Fuehlerform.GERADE;

        return mutter;
    }

    
}
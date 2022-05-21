package mendelsland2;

public class Main {
    
    public static void main(String[] args) {

        Brut.paarung();

        Statistik.erstelleStatistik();
        Statistik.ausgabeStatistik();

        System.out.println(Brut.brutgroesse);

        System.out.println(Brut.brut.get(3).getFluegelfarbe());
        System.out.println(Brut.brut.get(4).getFluegelfarbe());
        System.out.println(Brut.brut.get(5).getFluegelfarbe());
        System.out.println(Brut.brut.get(6).getFluegelfarbe());
        System.out.println(Brut.brut.get(7).getFluegelfarbe());
        System.out.println(Brut.brut.get(8).getFluegelfarbe());
        System.out.println(Brut.brut.get(9).getFluegelfarbe());
        System.out.println(Brut.brut.get(13).getFluegelfarbe());
        System.out.println(Brut.brut.get(14).getFluegelfarbe());
        System.out.println(Brut.brut.get(15).getFluegelfarbe());
        System.out.println(Brut.brut.get(16).getFluegelfarbe());
        System.out.println(Brut.brut.get(17).getFluegelfarbe());
        System.out.println(Brut.brut.get(18).getFluegelfarbe());
        System.out.println(Brut.brut.get(19).getFluegelfarbe());
        System.out.println(Brut.brut.get(18));
        System.out.println(Brut.brut.get(19));
        //System.out.println(Schmetterling.vater.getFluegelfarbe());

    }
}

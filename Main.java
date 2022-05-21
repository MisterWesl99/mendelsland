package mendelsland2;

public class Main {
    
    public static void main(String[] args) {

        Schmetterling.erstelleMutter();
        Schmetterling.erstelleVater();

        Brut.paarung();

        Statistik.erstelleStatistik();
        Statistik.ausgabeStatistik();

    }
}

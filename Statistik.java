package mendelsland2;

public class Statistik {

    static int komb1 = 0;
    private static int komb2 = 0;
    private static int komb3 = 0;
    private static int komb4 = 0;
    private static int komb5 = 0;
    private static int komb6 = 0;
    private static int komb7 = 0;
    private static int komb8 = 0;
    private static int komb9 = 0;
    private static int komb10 = 0;
    private static int komb11 = 0;
    private static int komb12 = 0;
    private static int komb13 = 0;
    private static int komb14 = 0;
    private static int komb15 = 0;
    private static int komb16 = 0;
    private static int komb17 = 0;
    private static int komb18 = 0;
    private static int komb19 = 0;
    private static int komb20 = 0;
    private static int komb21 = 0;
    private static int komb22 = 0;
    private static int komb23 = 0;
    private static int komb24 = 0;

    public static void erstelleStatistik() {

        for (int i = 0; i < Brut.brut.size(); i++) {

            Musterung muster = Brut.brut.get(i).getMusterung();
            Fluegelfarbe fluegel = Brut.brut.get(i).getFluegelfarbe();
            Fuehlerform fuehler = Brut.brut.get(i).getFuehlerform();
            

            if (fuehler == Fuehlerform.GERADE) {
                if (muster == Musterung.KEINMUSTER) {
                    if (fluegel == Fluegelfarbe.ROT) {
                        komb1++;
                    } else if (fluegel == Fluegelfarbe.GELB) {
                        komb2++;
                    } else if (fluegel == Fluegelfarbe.GRUEN) {
                        komb3++;
                    } else {
                        komb4++;
                    }
                } else if (muster == Musterung.SCHWARZEPUNKTE) {
                    if (fluegel == Fluegelfarbe.ROT) {
                        komb5++;
                    } else if (fluegel == Fluegelfarbe.GELB) {
                        komb6++;
                    } else if (fluegel == Fluegelfarbe.GRUEN) {
                        komb7++;
                    } else {
                        komb8++;
                    }
                } else {
                    if (fluegel == Fluegelfarbe.ROT) {
                        komb9++;
                    } else if (fluegel == Fluegelfarbe.GELB) {
                        komb10++;
                    } else if (fluegel == Fluegelfarbe.GRUEN) {
                        komb11++;
                    } else {
                        komb12++;
                    }
                }  
            } else {
                if (muster == Musterung.KEINMUSTER) {
                    if (fluegel == Fluegelfarbe.ROT) {
                        komb13++;
                    } else if (fluegel == Fluegelfarbe.GELB) {
                        komb14++;
                    } else if (fluegel == Fluegelfarbe.GRUEN) {
                        komb15++;
                    } else {
                        komb16++;
                    }
                } else if (muster == Musterung.SCHWARZEPUNKTE) {
                    if (fluegel == Fluegelfarbe.ROT) {
                        komb17++;
                    } else if (fluegel == Fluegelfarbe.GELB) {
                        komb18++;
                    } else if (fluegel == Fluegelfarbe.GRUEN) {
                        komb19++;
                    } else {
                        komb20++;
                    }
                } else {
                    if (fluegel == Fluegelfarbe.ROT) {
                        komb21++;
                    } else if (fluegel == Fluegelfarbe.GELB) {
                        komb22++;
                    } else if (fluegel == Fluegelfarbe.GRUEN) {
                        komb23++;
                    } else {
                        komb24++;
                    }
                }
            }
        }
    }

    public static void ausgabeStatistik() {

        if (komb1 != 0) {
            int kombination1 = (komb1*100) / Brut.brutgroesse;
            System.out.println("kein Muster, rote Flügel und gerade Fühler besitzen "+komb1+" Kinder( "+Math.round(kombination1 * 100d) / 100d+" %)");
        }
        if (komb13 != 0) {
            int kombination13 = (komb13*100) / (Brut.brutgroesse);
            System.out.println("kein Muster, rote Flügel und gekrümmte Fühler besitzen "+komb13+" Kinder( "+Math.round(kombination13 * 100d) / 100d+" %)");
        }
        if (komb2 != 0) {
            int kombination2 = (komb2*100) / (Brut.brutgroesse);
            System.out.println("kein Muster, gelbe Flügel und gerade Fühler besitzen "+komb2+" Kinder( "+Math.round(kombination2 * 100d) / 100d+" %)");
        }
        if (komb14 != 0) {
            int kombination14 = (komb14*100) / (Brut.brutgroesse);
            System.out.println("kein Muster, gelbe Flügel und gekrümmte Fühler besitzen "+komb14+" Kinder( "+Math.round(kombination14 * 100d) / 100d+" %)");
        }
        if (komb3 != 0) {
            int kombination3 = (komb3*100) / (Brut.brutgroesse);
            System.out.println("kein Muster, grüne Flügel und gerade Fühler besitzen "+komb3+" Kinder( "+Math.round(kombination3 * 100d) / 100d+" %)");
        }
        if (komb15 != 0) {
            int kombination15 = (komb15*100) / (Brut.brutgroesse);
            System.out.println("kein Muster, grüne Flügel und gekrümmte Fühler besitzen "+komb15+" Kinder( "+Math.round(kombination15 * 100d) / 10d+" %)");
        }
        if (komb4 != 0) {
            int kombination4 = (komb4*100) / (Brut.brutgroesse);
            System.out.println("kein Muster, blaue Flügel und gerade Fühler besitzen "+komb4+" Kinder( "+Math.round(kombination4 * 100d) / 100d+" %)");
        }
        if (komb16 != 0) {
            int kombination16 = (komb16*100) / (Brut.brutgroesse);
            System.out.println("kein Muster, blaue Flügel und gekrümmte Fühler besitzen "+komb16+" Kinder( "+Math.round(kombination16 * 100d) / 100d+" %)");
        }
        if (komb5 != 0) {
            int kombination5 = (komb5*100) / (Brut.brutgroesse);
            System.out.println("schwarze Punkte, rote Flügel und gerade Fühler besitzen "+komb5+" Kinder( "+Math.round(kombination5 * 10d) / 10d+" %)");
        }
        if (komb17 != 0) {
            int kombination17 = (komb17*100) / (Brut.brutgroesse);
            System.out.println("schwarze Punkte, rote Flügel und gekrümmte Fühler besitzen "+komb17+" Kinder( "+Math.round(kombination17 * 10d) / 10d+" %)");
        }
        if (komb6 != 0) {
            int kombination6 = (komb6*100) / (Brut.brutgroesse);
            System.out.println("schwarze Punkte, gelbe Flügel und gerade Fühler besitzen "+komb6+" Kinder( "+Math.round(kombination6 * 10d) / 10d+" %)");
        }
        if (komb18 != 0) {
            int kombination18 = (komb18*100) / (Brut.brutgroesse);
            System.out.println("schwarze Punkte, gelbe Flügel und gekrümmte Fühler besitzen "+komb18+" Kinder( "+Math.round(kombination18 * 10d) / 10d+" %)");
        }
        if (komb7 != 0) {
            int kombination7 = (komb7*100) / (Brut.brutgroesse);
            System.out.println("schwarze Punkte, grüne Flügel und gerade Fühler besitzen "+komb7+" Kinder( "+Math.round(kombination7 * 100d) / 100d+" %)");
        }
        if (komb19 != 0) {
            int kombination19 = (komb19*100) / (Brut.brutgroesse);
            System.out.println("schwarze Punkte, grüne Flügel und gekrümmte Fühler besitzen "+komb19+" Kinder( "+Math.round(kombination19 * 100d) / 100d+" %)");
        }
        if (komb8 != 0) {
            int kombination8 = (komb8*100) / (Brut.brutgroesse);
            System.out.println("schwarze Punkte, blaue Flügel und gerade Fühler besitzen "+komb15+" Kinder( "+Math.round(kombination8 * 100d) / 100d+" %)");
        }
        if (komb20 != 0) {
            int kombination20 = (komb20*100) / (Brut.brutgroesse);
            System.out.println("schwarze Punkte, blaue Flügel und gekrümmte Fühler besitzen "+komb20+" Kinder( "+Math.round(kombination20 * 100d) / 100d+" %)");
        }
        if (komb9 != 0) {
            int kombination9 = (komb9*100) / (Brut.brutgroesse);
            System.out.println("schwarze Streifen, rote Flügel und gerade Fühler besitzen "+komb9+" Kinder( "+Math.round(kombination9 * 100d) / 100d+" %)");
        }
        if (komb21 != 0) {
            int kombination21 = (komb21*100) / (Brut.brutgroesse);
            System.out.println("schwarze Streifen, rote Flügel und gekrümmte Fühler besitzen "+komb21+" Kinder( "+Math.round(kombination21 * 100d) / 100d+" %)");
        }
        if (komb10 != 0) {
            int kombination10 = (komb10*100) / (Brut.brutgroesse);
            System.out.println("schwarze Streifen, gelbe Flügel und gerade Fühler besitzen "+komb10+" Kinder( "+Math.round(kombination10 * 100d) / 100d+" %)");
        }
        if (komb22 != 0) {
            int kombination22 = (komb22*100) / (Brut.brutgroesse);
            System.out.println("schwarze Streifen, gelbe Flügel und gekrümmte Fühler besitzen "+komb22+" Kinder( "+Math.round(kombination22 * 100d) / 100d+" %)");
        }
        if (komb11 != 0) {
            int kombination11 = (komb11*100) / (Brut.brutgroesse);
            System.out.println("schwarze Streifen, grüne Flügel und gerade Fühler besitzen "+komb11+" Kinder( "+Math.round(kombination11 * 100d) / 100d+" %)");
        }
        if (komb23 != 0) {
            int kombination23 = (komb23*100) / (Brut.brutgroesse);
            System.out.println("schwarze Streifen, grüne Flügel und gekrümmte Fühler besitzen "+komb23+" Kinder( "+Math.round(kombination23 * 100d) / 100d+" %)");
        }
        if (komb12 != 0) {
            int kombination12 = (komb12*100) / (Brut.brutgroesse);
            System.out.println("schwarze Streifen, blaue Flügel und gerade Fühler besitzen "+komb12+" Kinder( "+Math.round(kombination12 * 100d) / 100d+" %)");
        }
        if (komb24 != 0) {
            int kombination24 = (komb24*100) / (Brut.brutgroesse);
            System.out.println("schwarze Streifen, blaue Flügel und gekrümmte Fühler besitzen "+komb24+" Kinder( "+Math.round(kombination24 * 100d) / 100d+" %)");
        }
    }
}

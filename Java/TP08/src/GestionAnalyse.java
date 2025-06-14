import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionAnalyse {
    private static ArrayList<Analyse> analyses = new ArrayList<>();

    public static void chargerAnalyses(ArrayList<String[]> fichier) {
        boolean erreurDetectee = false;

        for (int i = 0; i < fichier.size(); i++) {
            int ligne = i + 1;
            String[] ligneData = fichier.get(i);

            try {
                int idAnalyse = Integer.parseInt(ligneData[0]);
                String typeAnalyse = ligneData[1];
                String resultatString = ligneData[2];
                String age = ligneData[3];
                int idPatient = Integer.parseInt(ligneData[4]);

                verifierTypeAnalyse(typeAnalyse);

                if (typeAnalyse.equals("PLA")) {
                    int resultatAnalyse = Integer.parseInt(resultatString);
                    AnalyseSanguine as = new AnalyseSanguine(idAnalyse, idPatient, typeAnalyse, resultatAnalyse);
                    analyses.add(as);
                } else if (resultatString.equals("NEGATIF")) {
                    AnalyseVirale av = new AnalyseVirale(idAnalyse, idPatient, typeAnalyse, false);
                    analyses.add(av);
                } else if (resultatString.equals("POSITIF")) {
                    AnalyseVirale av = new AnalyseVirale(idAnalyse, idPatient, typeAnalyse, true);
                    analyses.add(av);
                }

            } catch (TypeInconnu t) {
                System.out.println("- Erreur de type à la ligne " + ligne + ". " + t.getMessage()
                        + " La suite du fichier n'a donc pas été prise en compte.");
                erreurDetectee = true;
                break;
            }
        }

        if (!erreurDetectee) {
            System.out.println("- Aucune erreur détectée");
        }
    }

    public static void verifierTypeAnalyse(String nom) throws TypeInconnu {
        List<String> typesValid = Arrays.asList("PLA", "VHA", "TOX");
        if (!typesValid.contains(nom)) {
            throw new TypeInconnu("Le type \"" + nom + "\" est inconnu !");
        }

    }

    public static void afficherAnalyses() {
        for (Analyse analyse : analyses) {
            System.out.println(analyse);
        }
    }

    public static void main(String[] args) {
        System.out.println("----- Chargement du fichier : LstAnalyses.csv -----");
        GestionAnalyse.chargerAnalyses(FileToStr.lireFichier("LstAnalyses.csv"));

        System.out.println("----- Chargement du fichier : LstAnalyses2.csv -----");
        GestionAnalyse.chargerAnalyses(FileToStr.lireFichier("LstAnalyses2.csv"));

        System.out.println("----- Affichage des analyses -----");
        afficherAnalyses();
    }
}

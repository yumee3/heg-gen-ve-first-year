package Ex2_CoursesSki.Application;

import Ex2_CoursesSki.Domaine.Resultat;
import Ex2_CoursesSki.Donnees.Bdd;

import java.util.ArrayList;
import java.util.List;

import static Ex2_CoursesSki.Donnees.Bdd.recupererLesDossards;
import static Ex2_CoursesSki.Donnees.Bdd.recupererLesTemps;

/**
 * Cette classe ne contient pas de methode main, il faudra l'utiliser
 * dans la classe Main pour lancer la méthode principale
 */
public class StatCourse {

    private static List<Resultat> resultats = new ArrayList<>();

    public static List<Resultat> chargerResultats() {
        int[] dossards = Bdd.recupererLesDossards();
        double[] temps = Bdd.recupererLesTemps();

        resultats.clear();
        for (int i = 0; i < dossards.length; ++i) {
            resultats.add(new Resultat(dossards[i], temps[i]));
        }
        return resultats;
    }



    public static void afficherResultats(List<Resultat> data) {
        if (data.isEmpty()) {
            System.out.println("Aucun résultat disponible.");
            return;
        }

        for (Resultat r : data) {
            System.out.println(r);
        }
    }

    public static String plusRapide(List<Resultat> data) {
        if (data.isEmpty()) {
            return null; // Aucun coureur enregistré
        }

        Resultat best = data.get(0);

        for (Resultat r : data) {
            if (r.getTemps() < best.getTemps()) {
                best = r;
            }
        }

        return "Plus rapide est " + best;
    }

    public static String nbFois(int dossard) {
        if (resultats == null || resultats.isEmpty()) {
            return "Aucun skieur enregistré.";
        }

        int total = 0;

        for (Resultat r : resultats) {
            if (r.getDossard() == dossard) {
                total += 1;
            }
        }

        return "Le skieur '" + dossard + "' a effectué " + total + " fois la course.";
    }





    public static void afficherStats() {

        List<Resultat> resultats = chargerResultats();
        afficherResultats(resultats);
        System.out.println(plusRapide(resultats));
        System.out.println(nbFois(116));

    }

}
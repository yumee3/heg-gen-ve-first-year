package Ex2_CoursesSki.Application;

import Ex2_CoursesSki.Domaine.Resultat;
import Ex2_CoursesSki.Donnees.Bdd;

import java.util.ArrayList;
import java.util.List;

import static Ex2_CoursesSki.Donnees.Bdd.recupererLesDossards;
import static Ex2_CoursesSki.Donnees.Bdd.recupererLesTemps;

public class StatCourse {

    // Liste qui stocke les résultats de la course
    private static List<Resultat> resultats = new ArrayList<>();

    // Charge les résultats depuis la base de données fictive
    public static List<Resultat> chargerResultats() {
        int[] dossards = Bdd.recupererLesDossards(); // récupère les numéros de dossard
        double[] temps = Bdd.recupererLesTemps();   // récupère les temps de course

        resultats.clear(); // vide les anciens résultats avant de recharger
        for (int i = 0; i < dossards.length; ++i) {
            resultats.add(new Resultat(dossards[i], temps[i])); // crée les objets Resultat
        }
        return resultats;
    }

    // Affiche tous les résultats
    public static void afficherResultats(List<Resultat> data) {
        if (data.isEmpty()) {
            System.out.println("Aucun résultat disponible.");
            return;
        }

        for (Resultat r : data) {
            System.out.println(r); // affiche chaque résultat via toString()
        }
    }

    // Retourne le coureur avec le temps le plus rapide
    public static String plusRapide(List<Resultat> data) {
        if (data.isEmpty()) {
            return null; // aucun résultat disponible
        }

        Resultat best = data.get(0); // on suppose que le 1er est le plus rapide

        for (Resultat r : data) {
            if (r.getTemps() < best.getTemps()) {
                best = r; // met à jour le plus rapide
            }
        }

        return "Plus rapide est " + best;
    }

    // Retourne combien de fois un skieur avec ce dossard a participé
    public static String nbFois(int dossard) {
        if (resultats == null || resultats.isEmpty()) {
            return "Aucun skieur enregistré.";
        }

        int total = 0;

        for (Resultat r : resultats) {
            if (r.getDossard() == dossard) {
                total += 1; // incrémente chaque fois que le dossard est trouvé
            }
        }

        return "Le skieur '" + dossard + "' a effectué " + total + " fois la course.";
    }

    // Méthode principale qui affiche toutes les stats
    public static void afficherStats() {
        List<Resultat> resultats = chargerResultats(); // charge les données
        afficherResultats(resultats); // affiche la liste
        System.out.println(plusRapide(resultats)); // affiche le plus rapide
        System.out.println(nbFois(116)); // affiche combien de fois le dossard 116 a participé
    }
}

package Exercice1;

public class Main {
    public static void main(String[] args) {
        // Création des voitures
        Voiture v1 = new Voiture("Porsche", "Cayenne", 2007);
        Voiture v2 = new Voiture("Ford", "Fiesta", 2019);
        Voiture v3 = new Voiture("Audi", "S3", 2022);

        // Création des maisons
        Maison m1 = new Maison(600, 14, true, 10800);
        Maison m2 = new Maison(200, 8, true, 7050);
        Maison m3 = new Maison(100, 6, false, 1600000);

        // Création des personnes
        Personne p1 = new Personne("Dupont", "Paul", "Chemin de la route 35", 24, v2);
        Personne p2 = new Personne("Grosjean", "Felix", "Chemin de la rue 97", 37, m2);
        Personne p3 = new Personne("Harat", "Séverine", "Chemin de l'impasse 12", 58, v1, m1);
        Personne p4 = new Personne("Carat", "Aude", "Chemin du sentier 34", 19);
        Personne p5 = new Personne("Camar", "Jack", "Chemin de la route 35", 44);

        // Affichage des informations
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();
        p5.afficher();

        // Ajout d'une voiture et d'une maison à une personne sans bien
        System.out.println("Ajout d'une voiture et d'une maison à Aude.");
        p4.setVoiture(v3);
        p4.setMaison(m3);
        p4.afficher();
    }
}

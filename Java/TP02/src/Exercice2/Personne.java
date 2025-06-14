package Exercice2; // Le fichier appartient au package "Exercice2"

public class Personne {
    // Attributs privés d'une personne
    private String nom;
    private String prenom;
    private int age;
    private Ecole ecole; // Association : chaque personne est liée à une école

    // Constructeur de la classe Personne
    // Permet d'initialiser une personne avec nom, prénom, âge, et une école
    Personne(String nom, String prenom, int age, Ecole ecole) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ecole = ecole;
    }

    // Redéfinition de la méthode toString() pour afficher les infos de la personne
    @Override
    public String toString() {
        // Cas 1 : si l'école a un degré "Tertiaire" (ex : université, HES)
        if (ecole.getDegre().equals("Tertiaire")) {
            return nom + " " + prenom + " " + age + " ans" + "\n"
                    + "Étudiant universitaire - Degré tertiaire" + "\n" + ecole;
        }
        // Cas 2 : si l'école est publique
        else if (ecole.getType().equals("Publique")) {
            return nom + " " + prenom + " " + age + " ans" + "\n" + ecole;
        }
        // Cas 3 : si l'école est privée
        else if (ecole.getType().equals("Privé")) {
            return nom + " " + prenom + " " + age + " ans" + "\n" + ecole.getNom(); // Affiche juste le nom de l'école
        }

        // Cas par défaut : l'école n'est pas définie ou ne correspond à aucun cas ci-dessus
        return nom + " " + prenom + " " + age + " ans" + "\n" + "École non définie";
    }
}

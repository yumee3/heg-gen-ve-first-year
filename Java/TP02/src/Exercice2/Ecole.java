package Exercice2;

import java.util.Objects; // Import non utilisé ici, peut être supprimé

public class Ecole {
    // Déclaration des attributs privés de l'école
    private String nom;
    private String adresse;
    private String type;        // "Publique" ou "Privé"
    private int nbBat;          // Nombre de bâtiments
    private String degre;       // Niveau d'enseignement (ex : "Primaire", "Tertiaire")
    private String domaine;     // Domaine d'études ou de formation
    private int Nbetudiant;     // Nombre d'étudiants

    // Constructeur pour initialiser tous les champs d'une école
    Ecole(String nom, String adresse, String type, int nbBat, String degre, String domaine, int nbetudiant) {
        this.nom = nom;
        this.adresse = adresse;
        this.type = type;
        this.nbBat = nbBat;
        this.degre = degre;
        this.domaine = domaine;
        this.Nbetudiant = nbetudiant;
    }

    // Getter pour accéder au nom
    public String getNom() {
        return nom;
    }

    // Setter pour modifier le nombre de bâtiments
    public void setNbBat(int nbBat) {
        this.nbBat = nbBat;
    }

    // Setter pour modifier le nombre d'étudiants
    public void setNbetudiant(int nbetudiant) {
        Nbetudiant = nbetudiant;
    }

    // Setter pour modifier le degré d'étude
    // + logique spéciale si l'école est publique ET le degré est "Primaire" ou "C.O"
    public void setDegre(String degre) {
        this.degre = degre;
        if (this.type.equals("Publique")) {
            if (this.degre.equals("Primaire") || this.degre.equals("C.O")) {
                this.domaine = "Général"; // Remplace automatiquement le domaine
            }
        }
    }

    // Getter pour récupérer le degré
    public String getDegre() {
        return degre;
    }

    // Getter pour récupérer le type (Publique ou Privé)
    public String getType() {
        return type;
    }

    // Méthode d'affichage personnalisée pour afficher les infos de l'école
    @Override
    public String toString() {
        return nom + ", " + adresse + " " + "\n"
                + "Ecole " + type + " de degré " + degre + " dans le domaine " + domaine + "\n"
                + "Il y a " + nbBat + " bâtiments pour " + Nbetudiant + " étudiants";
    }

    // Redéfinition de equals() pour comparer deux objets Ecole
    @Override
    public boolean equals(Object obj) {
        Ecole ecole = (Ecole) obj;

        // Si les deux écoles sont privées, comparaison stricte sur nom, adresse et domaine
        if (this.type.equals("Privé") && ecole.type.equals("Privé")) {
            return nom.equals(ecole.nom) &&
                    adresse.equals(ecole.adresse) &&
                    domaine.equals(ecole.domaine);
        }

        // Sinon, comparaison seulement sur nom + adresse
        return nom.equals(ecole.nom) && adresse.equals(ecole.adresse);
    }
}

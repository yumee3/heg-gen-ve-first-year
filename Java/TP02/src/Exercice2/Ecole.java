package Exercice2;

import java.util.Objects;

public class Ecole {
    private String nom;
    private String adresse;
    private String type;
    private int nbBat;
    private String degre;
    private String domaine;
    private int Nbetudiant;

    Ecole(String nom, String adresse, String type, int nbBat, String degre, String domaine, int nbetudiant) {
        this.nom = nom;
        this.adresse = adresse;
        this.type = type;
        this.nbBat = nbBat;
        this.degre = degre;
        this.domaine = domaine;
        this.Nbetudiant = nbetudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNbBat(int nbBat) {
        this.nbBat = nbBat;
    }

    public void setNbetudiant(int nbetudiant) {
        Nbetudiant = nbetudiant;
    }

    public void setDegre(String degre) {
        this.degre = degre;
        if (this.type.equals("Publique")) {
            if (this.degre.equals("Primaire") || this.degre.equals("C.O")) {
                this.domaine = "Général";
            }
        }
    }

    public String getDegre() {
        return degre;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return nom + ", " + adresse + " " + "\n"
                + "Ecole " + type + " de degré " + degre + " dans le domaine " + domaine + "\n"
                + "Il y a " + nbBat + " bâtiments pour " + Nbetudiant + " étudiants";
    }

    @Override
    public boolean equals(Object obj) {
        Ecole ecole = (Ecole) obj;
        if (this.type.equals("Privé") && ecole.type.equals("Privé")) {
            return nom.equals(ecole.nom) &&
                    adresse.equals(ecole.adresse) &&
                    domaine.equals(ecole.domaine);
        }
        return nom.equals(ecole.nom) && adresse.equals(ecole.adresse);
    }
}


package Exercice1;

public class Voiture {
    private String marque;
    private String modele;
    private int annee;

    // Constructeur
    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    // toString 
    @Override
    public String toString() {
        return marque + " " + modele + " de " + annee;
    }
}

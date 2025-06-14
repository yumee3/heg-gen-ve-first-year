package Exercice1;

public class Maison {
    private float surface;
    private int nbPieces;
    private boolean location;
    private float prix;

    public Maison(float surface, int nbPieces, boolean location, float prix) {
        this.surface = surface;
        this.nbPieces = nbPieces;
        this.location = location;
        this.prix = prix;
    }

    public String affichageMaison() {
        if (location) {
            return "Le loyer est de " + prix + " CHF mensuel.";
        } else {
            return "Le prix est de " + prix + " CHF.";
        }
    }

    @Override
    public String toString() {
        return "Maison d'une surface de " + surface + "m² comportant " + nbPieces + " pièces. " + affichageMaison();
    }
}

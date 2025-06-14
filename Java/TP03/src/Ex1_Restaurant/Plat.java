package Ex1_Restaurant;

public class Plat {
    String nom;
    String typePlat;

    public Plat(String nom, String typePlat) {
        this.nom = nom;
        this.typePlat = typePlat;
    }

    public String toString() {
        return nom + " (" + typePlat + ")";
    }
}

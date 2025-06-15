package Ex1_Restaurant; // Ce fichier appartient au package Ex1_Restaurant

public class Plat {
    String nom;        // Nom du plat
    String typePlat;   // Type du plat (ex : "dessert", "plat principal", etc.)

    // Constructeur pour créer un plat avec nom et type
    public Plat(String nom, String typePlat) {
        this.nom = nom;
        this.typePlat = typePlat;
    }

    // Méthode toString pour afficher le plat sous forme "Nom (Type)"
    public String toString() {
        return nom + " (" + typePlat + ")";
    }
}

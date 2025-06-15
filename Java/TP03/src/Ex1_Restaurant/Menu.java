package Ex1_Restaurant; // Le fichier fait partie du package Ex1_Restaurant

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // Attributs privés de la classe
    private String nom;        // Nom du menu (ex : "Menu Italien")
    private int prix;          // Prix du menu
    private List<Plat> plats;  // Liste des plats contenus dans ce menu

    // Constructeur pour initialiser nom et prix + une liste vide de plats
    public Menu(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
        this.plats = new ArrayList<Plat>(); // Initialise la liste vide
    }

    // Méthode pour ajouter un plat au menu
    public void AjoutPlat(Plat plat) {
        if (plats.size() < 5) {            // Vérifie qu'on ne dépasse pas 5 plats
            plats.add(plat);               // Ajoute le plat à la liste
        } else {
            // Si on dépasse 5, affiche une erreur
            System.out.println("Erreur : il ne peut y avoir que 5 plats dans un menu.");
        }
    }

    // Getters pour accéder aux attributs
    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public List<Plat> getPlats() {
        return plats;
    }
}

package Ex1_Restaurant; // Fait partie du package Ex1_Restaurant

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    // Liste statique contenant tous les menus du restaurant
    private static List<Menu> menuPlat = new ArrayList<>();

    // Méthode pour rechercher un plat dans tous les menus
    public static void Recherche(Plat p) {
        System.out.println("\n Recherche de " + p + " :");
        // Parcourt chaque menu
        for (Menu menu : menuPlat) {
            // Parcourt chaque plat du menu courant
            for (Plat plats : menu.getPlats()) {
                // Si le plat recherché est trouvé dans ce menu
                if (plats.equals(p)) {
                    System.out.println("Le plat " + p + " se trouve dans le menu " + menu.getNom() +
                            " à " + menu.getPrix() + " CHF composé de : " +
                            menu.getPlats().toString());
                    return; // Arrête la recherche dès qu'on le trouve
                }
            }
        }
        // Si on a fini tous les menus sans le trouver
        System.out.println("Le plat " + p + " n'est dans aucun menu.");
    }

    public static void main(String[] args) {
        // Création de 10 plats
        Plat p1 = new Plat("Cassoulet", "Plat");
        Plat p2 = new Plat("Pâtes au saumon", "Plat");
        Plat p3 = new Plat("Salade verte", "Entrée");
        Plat p4 = new Plat("Assiette Valaisanne", "Entrée/Plat");
        Plat p5 = new Plat("Coupe Danemark", "Dessert");
        Plat p6 = new Plat("Quiche Lorraine", "Plat");
        Plat p7 = new Plat("Pizza 4 saisons", "Plat");
        Plat p8 = new Plat("Tartare d'aubergines", "Entrée");
        Plat p9 = new Plat("Salade Niçoise", "Entrée/Plat");
        Plat p10 = new Plat("Profiteroles", "Dessert");

        // Création de 5 menus
        Menu m1 = new Menu("du jour", 35);
        Menu m2 = new Menu("de saison", 40);
        Menu m3 = new Menu("duo", 60);
        Menu m4 = new Menu("enfant", 25);
        Menu m5 = new Menu("découverte", 45);

        // Ajout de plats dans m1
        m1.AjoutPlat(p1);
        m1.AjoutPlat(p2);
        m1.AjoutPlat(p5);
        menuPlat.add(m1); // Ajout de m1 à la liste de menus

        // Ajout de 5 fois le même plat (p1) dans m2
        m2.AjoutPlat(p1);
        m2.AjoutPlat(p1);
        m2.AjoutPlat(p1);
        m2.AjoutPlat(p1);
        m2.AjoutPlat(p1);
        menuPlat.add(m2); // Ajout de m2 à la liste

        // Recherche dans les menus du plat p6 (non ajouté)
        Recherche(p6); // devrait afficher "n'est dans aucun menu"

        // Recherche dans les menus du plat p1 (présent dans m1 et m2)
        Recherche(p1); // devrait afficher le premier menu où il est trouvé
    }
}

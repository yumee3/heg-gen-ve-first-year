package Ex1_Restaurant;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static List<Menu> menuPlat = new ArrayList<>();

    public static void Recherche(Plat p) {
        System.out.println("\n Recherche de " + p + " :");
        for (Menu menu : menuPlat) {
            for (Plat plats : menu.getPlats()) {
                if (plats.equals(p)) {
                    System.out.println("Le plat " + p + " se trouve dans le menu " + menu.getNom() +
                            " à " + menu.getPrix() + " CHF composé de : " +
                            menu.getPlats().toString());
                    return;
                }
            }
        }
        System.out.println("Le plat " + p + " n'est dans aucun menu.");
    }

    public static void main(String[] args) {
        // Création des plats
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

        // Création des menus
        Menu m1 = new Menu("du jour", 35);
        Menu m2 = new Menu("de saison", 40);
        Menu m3 = new Menu("duo", 60);
        Menu m4 = new Menu("enfant", 25);
        Menu m5 = new Menu("découverte", 45);

        // Ajout des plats aux menus
        m1.AjoutPlat(p1);
        m1.AjoutPlat(p2);
        m1.AjoutPlat(p5);
        menuPlat.add(m1);

        m2.AjoutPlat(p1);
        m2.AjoutPlat(p1);
        m2.AjoutPlat(p1);
        m2.AjoutPlat(p1);
        m2.AjoutPlat(p1);
        menuPlat.add(m2);

        // Recherche des plats
        Recherche(p6);
        Recherche(p1);
    }
}

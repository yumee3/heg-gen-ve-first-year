package Ex1_Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nom;
    private int prix;
    private List<Plat> plats;

    public Menu(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
        this.plats = new ArrayList<Plat>();
    }

    public void AjoutPlat(Plat plat) {
        if (plats.size() < 5) {
            plats.add(plat);
        } else {
            System.out.println("Erreur : il ne peut y avoir que 5 plats dans un menu.");
        }
    }

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

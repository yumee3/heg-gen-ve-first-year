public class Espresso extends Cafe {
    private int quantiteCreme;

    public Espresso(int quantite, String nom, double prix, int taille, String provenance, int force, int quantiteCreme) {
        super(quantite, nom, prix, taille, provenance, force);
        this.quantiteCreme = quantiteCreme;
    }

    @Override
    public String toString() {
        return getProvenance() + ", intensité " + getForce() + ", " + quantiteCreme + "cl de crème";
    }

    public void affichageSelonType() {
        if (getQuantite() < 2) {
            System.out.println(getNom() + " (" + getPrix() + " CHF) - " + getTaille() + "cl "
                    + getProvenance() + ", intensité " + getForce() + " : "
                    + getQuantite() + " unité. /!/ a réaprovisonné");
        } else {
            System.out.println(getNom() + "(" + getPrix() + ") - " + getTaille() + "cl " + getProvenance() + ", intensité " + getForce() + ", " + quantiteCreme + "cl de crème : " + getQuantite() + " unité.\n");
        }
    }

    public void allergie() {
        if (quantiteCreme > 0) {
            System.out.println("\t- Contient du lactose");
        }
    }

}

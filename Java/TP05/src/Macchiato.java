public class Macchiato extends Cafe {
    private int quantiteLait;

    public Macchiato(int quantite, String nom, double prix, int taille, String provenance, int force, int quantiteLait) {
        super(quantite, nom, prix, taille, provenance, force);
        this.quantiteLait = quantiteLait;
    }

    @Override
    public String toString() {
        return getProvenance() + ", intensité " + getForce() + ", " + quantiteLait + "cl de lait";
    }

    public void affichageSelonType() {
        if (getQuantite() < 2) {
            System.out.println(getNom() + " (" + getPrix() + " CHF) - " + getTaille() + "cl "
                    + getProvenance() + ", intensité " + getForce() + ", "
                    + quantiteLait + "cl de lait : " + getQuantite() + " unité. /!/ a réaprovisonné\n");
        } else {
            System.out.println(getNom() + " (" + getPrix() + " CHF) - " + getTaille() + "cl "
                    + getProvenance() + ", intensité " + getForce() + ", "
                    + quantiteLait + "cl de lait : " + getQuantite() + " unité.\n");
        }
    }
    public void allergie() {
        if (quantiteLait > 0) {
            System.out.println("\t- Contient du lactose");
        }
    }
}

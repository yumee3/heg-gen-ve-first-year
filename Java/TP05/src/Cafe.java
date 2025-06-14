public abstract class Cafe extends Boisson {
    private String provenance;
    private int force;

    public Cafe(int quantite, String nom, double prix, int taille, String provenance, int force) {
        super(quantite, nom, prix, taille);
        this.provenance = provenance;
        this.force = force;
    }

    public String getProvenance() {
        return provenance;
    }

    public int getForce() {
        return force;
    }

    @Override
    public void affichageSelonType() {
        if (getQuantite() < 2) {
            System.out.println(getNom() + " (" + getPrix() + " CHF) - " + getTaille() + "cl "
                    + getProvenance() + ", intensité " + getForce() + " : "
                    + getQuantite() + " unité. /!/ a réaprovisonné");
        }
        else {
            System.out.println(getNom() + " (" + getPrix() + " CHF) - " + getTaille() + "cl "
                    + getProvenance() + ", intensité " + getForce() + " : "
                    + getQuantite() + " unité.");
        }
    }

}

public abstract class Boisson {
    private int quantite;
    private String nom;
    private double prix;
    private int taille;

    public Boisson(int quantite, String nom, double prix, int taille) {
        this.nom = nom;
        this.prix = prix;
        this.taille = taille;
        this.quantite = quantite;
    }

    public abstract void affichageSelonType();

    public int getQuantite() {
        return quantite;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getTaille() {
        return taille;
    }

    public abstract void allergie();

    public void afficherStock() {
        System.out.print(nom + "(" + prix + "Chf) - " + taille + "cl " + this + " : " + quantite + " unités.");
    }

}

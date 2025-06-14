public class Chocolat extends Boisson {
    private String typeChocolat;

    public Chocolat(int quantite, String nom, double prix, int taille, String typeChocolat) {
        super(quantite, nom, prix, taille);
        this.typeChocolat = typeChocolat;
    }

    public String getTypeChocolat() {
        return typeChocolat;
    }

    @Override
    public String toString() {
        return "chocolat " + typeChocolat;
    }


    public void affichageSelonType() {
        if (getQuantite() < 2) {
            System.out.println(getNom() + " (" + getPrix() + " CHF) - " + getTaille() + "cl, type : "
                    + getTypeChocolat() + " : " + getQuantite() + " unité. /!/ a réaprovisonné");
        }
        else {
            System.out.println(getNom() + " (" + getPrix() + " CHF) - " + getTaille() + "cl, type : "
                    + getTypeChocolat() + " : " + getQuantite() + " unité.");
            if (typeChocolat.equalsIgnoreCase("au lait")) {
                System.out.println("\t Contient du lactose");
            }
        }
    }
    public void allergie() {
        if (typeChocolat.equalsIgnoreCase("au lait")) {
            System.out.println("\t- Contient du lactose");
        }
    }
}

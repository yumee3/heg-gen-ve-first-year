import java.io.File;
import java.util.ArrayList;

public class GestionBoisson {

    private ArrayList<Boisson> liste = new ArrayList<>();

    public static void main(String[] args){
        GestionBoisson gB = new GestionBoisson();
        String localDir = System.getProperty("user.dir");

        gB.chargerData(localDir + File.separator +"stock.csv");
        Boisson b = new Chocolat(5,"Chocolat",1.5, 25,"au lait");

        System.out.println("------ Affichage du Stock ------- \n");
        gB.afficherStock();
        System.out.println();
        System.out.println("------ Ventes de produits ------- \n");

        gB.servirProduit(b);
        gB.servirProduit(b);
        System.out.println();
        System.out.println("------ Affichage du Stock ------- \n");
        gB.afficherStock();
    }

    public void chargerData(String localDir) {
        String[] lignes = FileToStr.lireCsv(localDir);
        liste.clear();
        for (String ligne : lignes) {
            String[] champs = ligne.split(";");

            int quantite = Integer.parseInt(champs[0]);
            String nom = champs[1];
            double prix = Double.parseDouble(champs[2]);
            int taille = Integer.parseInt(champs[3]);

            if (nom.equals("Chocolat")) {
                String typeChocolat = champs[4];
                Boisson b = new Chocolat(quantite, nom, prix, taille, typeChocolat);
                liste.add(b);
            }
            else {
                String provenance = champs[4];
                int force = Integer.parseInt(champs[5]);

                if (nom.equals("Espresso")) {
                    int quantiteCreme = Integer.parseInt(champs[6]);
                    Boisson b = new Espresso(quantite, nom, prix, taille, provenance, force, quantiteCreme);
                    liste.add(b);
                }
                else if (nom.equals("Macchiato")) {
                    int quantiteLait = Integer.parseInt(champs[6]);
                    Boisson b = new Macchiato(quantite, nom, prix, taille, provenance, force, quantiteLait);
                    liste.add(b);
                }
            }
        }
    }

    public void servirProduit(Boisson b) {
        if (b.getQuantite() > 0) {
            if (b instanceof Chocolat) {
                Chocolat c = (Chocolat) b;
                System.out.println(b.getNom() + " (" + b.getPrix() + " CHF) - " + b.getTaille() + "cl " + c.getTypeChocolat() + ". Santé !");
            }
            else {
                System.out.println(b.getNom() + " (" + b.getPrix() + " CHF) - " + b.getTaille() + "cl " + ". Santé !");
            }
        }
        else {
            System.out.println("Impossible de réaliser l'opération, le produit désiré n'est plus disponible.");
        }
    }

    public void afficherStock() {
        for (Boisson b : liste) {
            b.afficherStock();
            System.out.println();
            b.allergie();
            System.out.println();
        }
    }
}

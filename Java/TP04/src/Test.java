import java.util.*;

public class Test {
    // Variable "livres" permettant de stocker les livres
    private static ArrayList<Livre> livres = new ArrayList<>();

    //Vos autres variables ici...


    /**
     * Charger les données des livres à partir d'un fichier csv
     * @param path
     */
    public static void chargerData(String path){
        String[] data = FileToStr.lireCsv(path);
        String[] dataLivre = data[0].split(",");
        Livre l = new Livre(dataLivre[0], dataLivre[1], Integer.parseInt(dataLivre[2]));

        // Pour tout le reste : Traitement des recettes
        for(int i = 1; i < data.length; i++){
            String[] dataRecette = data[i].split(",");
            Recette r = new Recette(dataRecette[0],
                    Integer.parseInt(dataRecette[1]),
                    Integer.parseInt(dataRecette[2]),
                    Integer.parseInt(dataRecette[3]));
            l.ajoutRecette(r);
        }
        livres.add(l);
    }

    public static void afficherLivres(ArrayList<Livre> livres) {
        for (Livre livre : livres) {
            livre.afficher();
        }
    }

    public static void main(String[] args){
        String localDir = System.getProperty("user.dir");
        chargerData(localDir + "\\src\\Ressources\\livre1.csv");
        chargerData(localDir + "\\src\\Ressources\\livre2.csv");

        // Methodes à developper
        afficherLivres(livres);
        genererPlanning();
        afficherPlanning();
        System.out.println("");
        rechercheRecette(new Recette("Jaret de porc",10,2,60));
        rechercheRecette(new Recette("Jaret de boeuf",10,2,60));
        rechercheRecettePlanning(new Recette("Jaret de porc",10,2,60));

    }
}

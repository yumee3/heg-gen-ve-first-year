import java.util.ArrayList;
import java.util.Random;
public class Livre {
    private String titre;
    private String auteur;
    private int nbPage;
    private ArrayList<Recette> recettes = new ArrayList<>();

    public Livre(String titre, String auteur, int nbPage) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPage = nbPage;
    }

    public void ajoutRecette(Recette r){
            recettes.add(r);
    }

    public String getRecettesAleatoire() {
        Random rand = new Random();
        int index = rand.nextInt(recettes.size());
        return recettes.get(index).toString();
    }

    public void afficher() {
        System.out.println("\n\"" + titre + "\" de " + auteur + " (" + nbPage + " pages) contient les recettes :");

        for (Recette r : recettes) {
            r.afficher();
        }
    }
}


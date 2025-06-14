package Ex2.Domaine;

public class TableRectangle extends Table {
    private int largeur;
    private int longueur;


    public TableRectangle(String code, int nb_places, String matiere, int largeur, int longueur) {
        super(code, nb_places, matiere);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public double getSurface() {
        return largeur * longueur;
    }

    @Override
    public String toString() {
        return "Table Rectangle (" + getCode() + ") : " + getNb_places() + " places, en " + getMatiere() + " de " + largeur + "x" + longueur;
    }
}

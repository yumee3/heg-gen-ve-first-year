package Ex2.Domaine;

public class TableRonde extends Table {
    private int diametre;

    public TableRonde(String code, int nb_places, String matiere, int diametre) {
        super(code, nb_places, matiere);
        this.diametre = diametre;
    }

    @Override
    public double getSurface() {
        double rayon = diametre / 2.0;
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Table Ronde (" + getCode() + ") : " + getNb_places() + " places, en " + getMatiere() + " de diamètre " + diametre;
    }
}

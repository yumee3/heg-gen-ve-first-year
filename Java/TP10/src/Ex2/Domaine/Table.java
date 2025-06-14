package Ex2.Domaine;
import java.util.Objects;

public abstract class Table {
    private String code;
    private int nb_places;
    private String matiere;

    public Table(String code, int nb_places, String matiere) {
        this.code = code;
        this.nb_places = nb_places;
        this.matiere = matiere;
    }

    public abstract double getSurface();

    public String getCode() {
        return code;
    }

    public int getNb_places() {
        return nb_places;
    }

    public String getMatiere() {
        return matiere;
    }
}
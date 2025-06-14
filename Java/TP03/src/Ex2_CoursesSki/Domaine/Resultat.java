package Ex2_CoursesSki.Domaine;

public class Resultat {
    private int idDossard;
    private double temps;

    public Resultat(int idDossard, double temps) {
        this.idDossard = idDossard;
        this.temps = temps;
    }

    public int getDossard() {
        return idDossard;
    }

    public double getTemps() {
        return temps;
    }

    @Override
    public String toString() {
        return "Dossard " + idDossard + " : " + temps;
    }
}

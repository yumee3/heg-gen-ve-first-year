package Ex2_CoursesSki.Domaine;

public class Resultat {
    // Numéro de dossard du participant
    private int idDossard;

    // Temps réalisé par le participant
    private double temps;

    // Constructeur de la classe : initialise le dossard et le temps
    public Resultat(int idDossard, double temps) {
        this.idDossard = idDossard;
        this.temps = temps;
    }

    // Retourne le numéro de dossard
    public int getDossard() {
        return idDossard;
    }

    // Retourne le temps du participant
    public double getTemps() {
        return temps;
    }

    // Affichage personnalisé d’un objet Resultat
    @Override
    public String toString() {
        return "Dossard " + idDossard + " : " + temps;
    }
}

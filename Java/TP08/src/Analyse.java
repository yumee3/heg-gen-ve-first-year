public abstract class Analyse {

    private int analyseID;
    private int patientID;

    public Analyse(int analyseID, int patientID) {
        this.analyseID = analyseID;
        this.patientID = patientID;
    }

    public abstract boolean isProblematic();

    public int getPatientID() {
        return patientID;
    }

    @Override
    public String toString() {
        return "Analyse " + analyseID + " pour patient " + patientID;
    }
}

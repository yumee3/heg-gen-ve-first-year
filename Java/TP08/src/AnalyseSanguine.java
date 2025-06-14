public class AnalyseSanguine extends Analyse {
    public String typeAnalyse;
    public int valeurAnalyse;

    public AnalyseSanguine(int analyseID, int patientID, String typeAnalyse, int valeurAnalyse) {
        super(analyseID, patientID);
        this.typeAnalyse = typeAnalyse;
        this.valeurAnalyse = valeurAnalyse;
    }

    public String getTypeAnalyse() {
        return typeAnalyse;
    }

    @Override
    public boolean isProblematic() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " " + typeAnalyse + ", valeur " + valeurAnalyse;
    }
}

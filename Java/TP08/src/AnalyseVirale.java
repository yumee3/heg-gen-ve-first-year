public class AnalyseVirale extends Analyse {
    public String nomVirus;
    public boolean valeurAnalyse;

    public AnalyseVirale(int analyseID, int patientID, String nomVirus, boolean valeurAnalyse) {
        super(analyseID, patientID);
        this.nomVirus = nomVirus;
        this.valeurAnalyse = valeurAnalyse;
    }

    public String getNomVirus() {
        return nomVirus;
    }

    public String affichageBool() {
        if (valeurAnalyse == true) {
            return "OUI";
        } else {
            return "NON";
        }
    }

    @Override
    public boolean isProblematic() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " Virus " + nomVirus + " " + affichageBool();
    }
}

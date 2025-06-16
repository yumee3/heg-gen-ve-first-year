public class Moto extends Vehicule {
    int cylindree;

    public Moto(String marque, String modele, int annee, String plaqueImmatriculation, int anneeRevision, int cylindree) {
        super(marque, modele, annee, plaqueImmatriculation, anneeRevision);
        this.cylindree = cylindree;
    }
    @Override
    public String toString() {
        return super.toString() + cylindree;
    }
}

public class Soigneur extends Personnage implements ICompetenceSpeciale, IAttaquant, IDefenseur {
    private int recupPv;

    public Soigneur(String nom, int niveau, int pv, int mana, int pAttaque, int pDefense, int recupPv) {
        super(nom, niveau, pv, mana, pAttaque, pDefense);
        this.recupPv = recupPv;
    }

    public int getRecupPv() {
        return recupPv;
    }

    @Override
    public void capaciteSpeciale() {
        if (getMana() >= 10) {
            setMana(getMana() - 10);
            setPv(getPv() + 10);
            System.out.println(getNom() + " utilise un soin magique ! Il récupère 10 PV.");
        } else {
            System.out.println(getNom() + " n’a pas assez de mana pour se soigner !");
        }
    }

    @Override
    public int attaquer(int nbAleatoire) {
        if (nbAleatoire == 2 && getMana() >= 10) {
            setMana(getMana() - 10);
            setPv(getPv() + 10);
            System.out.println(getNom() + " utilise sa compétence spéciale et récupère 10 PV !");
            return 0;
        } else if (nbAleatoire == 2) {
            System.out.println(getNom() + " veut se soigner mais n’a pas assez de mana. Il attaque faiblement.");
        } else {
            System.out.println(getNom() + " attaque faiblement.");
        }

        return getpAttaque();
    }

    public void defendre() {
        setpDefense(getpDefense() + 1);
        System.out.println(getNom() + " se défend calmement (+1 défense).");
    }

    @Override
    public String toString() {
        return super.toString() + " il s'agit d'un soigneur";
    }
}

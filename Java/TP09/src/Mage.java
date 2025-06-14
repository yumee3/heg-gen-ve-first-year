public class Mage extends Personnage implements ICompetenceSpeciale, IAttaquant, IDefenseur {
    private int puissanceMagique;

    public Mage(String nom, int niveau, int pv, int mana, int pAttaque, int pDefense, int puissanceMagique) {
        super(nom, niveau, pv, mana, pAttaque, pDefense);
        this.puissanceMagique = puissanceMagique;
    }

    @Override
    public void capaciteSpeciale() {
        if (getMana() >= 10) {
            setMana(getMana() - 10);
            System.out.println(getNom() + " lance un sort magique puissant !");
        } else {
            System.out.println(getNom() + " n’a pas assez de mana !");
        }
    }

    @Override
    public int attaquer(int nbAleatoire) {
        int degats = getpAttaque() + puissanceMagique;

        if (nbAleatoire == 2 && getMana() >= 10) {
            degats *= 2;
            setMana(getMana() - 10);
            System.out.println(getNom() + " utilise sa compétence spéciale et inflige une attaque magique puissante !");
        } else if (nbAleatoire == 2) {
            System.out.println(getNom() + " veut utiliser sa compétence spéciale mais n’a pas assez de mana. Il attaque normalement.");
        } else {
            System.out.println(getNom() + " attaque normalement.");
        }

        return degats;
    }

    public void defendre() {
        setpDefense(getpDefense() + 1);
        System.out.println(getNom() + " se défend et augmente sa défense de 1.");
    }

    @Override
    public String toString() {
        return super.toString() + " il s'agit d'un mage";
    }
}

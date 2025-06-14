public class Guerrier extends Personnage implements ICompetenceSpeciale, IAttaquant, IDefenseur {
    private int resistance;

    public Guerrier(String nom, int niveau, int pv, int mana, int pAttaque, int pDefense, int resistance) {
        super(nom, niveau, pv, mana, pAttaque, pDefense);
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

    @Override
    public void capaciteSpeciale() {
        System.out.println(getNom() + " entre en posture défensive ! Sa défense est doublée.");
        setpDefense(getpDefense() * 2);
    }

    @Override
    public int attaquer(int nbAleatoire) {
        if (nbAleatoire == 2) {
            System.out.println(getNom() + " utilise sa compétence spéciale : il double sa défense !");
            setpDefense(getpDefense() * 2);
        } else {
            System.out.println(getNom() + " attaque avec force !");
        }

        return getpAttaque();
    }

    public void defendre() {
        int boost = 1 + resistance;
        setpDefense(getpDefense() + boost);
        System.out.println(getNom() + " se défend et augmente sa défense de " + boost + " (résistance incluse).");
    }

    @Override
    public String toString() {
        return super.toString() + " il s'agit d'un guerrier";
    }
}

public abstract class Personnage {
    private String nom;
    private int niveau;
    private int pv;
    private int mana;
    private int pAttaque;
    private int pDefense;

    public Personnage(String nom, int niveau, int pv, int mana, int pAttaque, int pDefense) {
        this.nom = nom;
        this.niveau = niveau;
        this.pv = pv;
        this.mana = mana;
        this.pAttaque = pAttaque;
        this.pDefense = pDefense;
    }

    public int nbAleatoire() {
        return (int)(Math.random() * 2) + 1;
    }

    public String getNom() {
        return nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getpAttaque() {
        return pAttaque;
    }

    public void setpAttaque(int pAttaque) {
        this.pAttaque = pAttaque;
    }

    public int getpDefense() {
        return pDefense;
    }

    public void setpDefense(int pDefense) {
        this.pDefense = pDefense;
    }

    @Override
    public String toString() {
        return nom + " est de niveau " + niveau + ",";
    }
}

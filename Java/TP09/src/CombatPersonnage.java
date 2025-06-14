import java.util.Random;

public class CombatPersonnage {
    private Personnage p1;
    private Personnage p2;
    private Random random = new Random();

    public CombatPersonnage(Personnage p1, Personnage p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void lancerCombat() {
        System.out.println("Combat entre les deux personnages suivants :");
        System.out.println(p1.toString());
        System.out.println("VS");
        System.out.println(p2.toString());

        int tours = 0;

        while (!estMort(p1) && !estMort(p2) && tours < 10) {
            tours++;

            effectuerTour(p1, p2);
            if (estMort(p2)) {
                System.out.println("Fin du combat");
                System.out.println("Victoire de " + p1.getNom());
                return;
            }

            effectuerTour(p2, p1);
            if (estMort(p1)) {
                System.out.println("Fin du combat");
                System.out.println("Victoire de " + p2.getNom());
                return;
            }
        }

        System.out.println("Fin du combat");

        if (p1.getPv() > p2.getPv()) {
            System.out.println("Victoire de " + p1.getNom());
        } else if (p2.getPv() > p1.getPv()) {
            System.out.println("Victoire de " + p2.getNom());
        } else {
            System.out.println("Match nul");
        }
    }

    private void effectuerTour(Personnage attaquant, Personnage cible) {
        int action = random.nextInt(3) + 1;

        if (action == 1 && attaquant instanceof IAttaquant) {
            int choix = random.nextInt(2) + 1;
            ((IAttaquant) attaquant).attaquer(choix);
            System.out.println(attaquant.getNom() + " lance une attaque magique sur " + cible.getNom());
        }

        else if (action == 2 && attaquant instanceof IDefenseur) {
            ((IDefenseur) attaquant).defendre();
            System.out.println(attaquant.getNom() + " se protège avec un bouclier magique");
        }

        else if (action == 3 && attaquant instanceof ICompetenceSpeciale) {
            ((ICompetenceSpeciale) attaquant).capaciteSpeciale();
            System.out.println(attaquant.getNom() + " utilise un sort puissant");
        }
    }

    private boolean estMort(Personnage p) {
        return p.getPv() <= 0;
    }
}

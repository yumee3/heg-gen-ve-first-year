import java.util.ArrayList;
import java.util.Random;

public class GestionPersonnages {
    private static ArrayList<Personnage> personnages = new ArrayList<>();;

    public static void chargerPersonnages(String fileName) {

        //J'ai bloquer sur la gestion d'erreur, je n'ai pas trouvé le moyen de le faire
        
        String[] data = FileToStr.lireCsv(fileName);

        for (int i = 0; i < data.length; i++) {
            String[] personnage = data[i].split(";");
            String nom = personnage[1];
            int niveau = Integer.parseInt(personnage[2]);
            int pointsVie = Integer.parseInt(personnage[3]);
            int pointsMana = Integer.parseInt(personnage[4]);
            int pointAttaque = Integer.parseInt(personnage[5]);
            int pointDefense = Integer.parseInt(personnage[6]);
            if (personnage[0].equals("G")) {
                String type = "Guerrier";
                int resistance = Integer.parseInt(personnage[7]);
                Guerrier g = new Guerrier(nom, niveau, pointsVie, pointsMana, pointAttaque, pointDefense, resistance);
                personnages.add(g);
            }
            else if (personnage[0].equals("M")) {
                String type = "Mage";
                int puissanceMagique = Integer.parseInt(personnage[7]);
                Mage m = new Mage(nom, niveau, pointsVie, pointsMana, pointAttaque, pointDefense, puissanceMagique);
                personnages.add(m);
            }
            else if (personnage[0].equals("S")) {
                String type = "Soigneur";
                int recupPV = Integer.parseInt(personnage[7]);
                Soigneur s = new Soigneur(nom, niveau, pointsVie, pointsMana, pointAttaque, pointDefense, recupPV);
                personnages.add(s);
            }
        }
    }

    public static void afficherPersonnages(){
        for (Personnage p : personnages) {
            System.out.println(p);
        }
    }

    public static void creerCombatAleatoire() {
        if (personnages.size() < 2) {
            System.out.println("Pas assez de personnages pour lancer un combat.");
            return;
        }

        Random random = new Random();
        int index1 = random.nextInt(personnages.size());
        int index2;

        do {
            index2 = random.nextInt(personnages.size());
        } while (index2 == index1);

        Personnage p1 = personnages.get(index1);
        Personnage p2 = personnages.get(index2);

        System.out.println("\nCombat aléatoire sélectionné entre : " + p1.getNom() + " et " + p2.getNom());
        CombatPersonnage combat = new CombatPersonnage(p1, p2);
        combat.lancerCombat();
    }

    public static void main(String[] args) {
        //charger les personnages
        System.out.println("\n\n------Chargement des personnages------");
        chargerPersonnages("personnages.csv");


        //afficher les personnages
        System.out.println("\n\n------Affichage des personnages------");
        afficherPersonnages();

        //Creer un combat aléatoire
        System.out.println("\n\n------Lancement d'un combat aléatoire------");
        creerCombatAleatoire();
    }
}

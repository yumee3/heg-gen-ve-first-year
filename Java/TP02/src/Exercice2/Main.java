package Exercice2; // Ce fichier est dans le package "Exercice2"

public class Main {
    public static void main(String[] args)
    {
        // Création de plusieurs objets Ecole avec différentes caractéristiques
        Ecole e1 = new Ecole("Haute école de gestion", "Route de drize 19", "Privé",5,"Tertiaire","Gestion",1500);
        Ecole e2 = new Ecole("Schultz", "Route du lac 29", "Privé",2,"Secondaire","Général",200);
        Ecole e3 = new Ecole("Collège Saint-Louis", "Route de Corzier 23", "Privé",3,"Secondaire","Général",400);
        Ecole e4 = new Ecole("Collège Saint-Louis", "Route de Corzier 23", "Privé",1,"Secondaire","Mathématique",50);
        Ecole e5 = new Ecole("Collège de Carouge", "Route des centenaires 34", "Publique",4,"Secondaire","Général",1500);
        Ecole e6 = new Ecole("Collège de Carouge", "Route des centenaires 34", "Publique",4,"Secondaire","Général",500);

        // Affichage de toutes les écoles créées avec leur méthode toString()
        System.out.println("Affichage des écoles");
        System.out.println("---------------------------------------------");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println(e5.toString());
        System.out.println(e6.toString());
        System.out.println("");

        // Test de la méthode equals() pour comparer les écoles
        System.out.println("Test des égalités entre écoles");
        System.out.println("---------------------------------------------");

        // Test : e3 et e4 → même nom et adresse, mais domaines différents → donc ≠
        if (e3.equals(e4)==false)
        {
            System.out.println(e3.toString());
            System.out.println("-------------- n'est pas égal à --------------");
            System.out.println(e4.toString());
            System.out.println("\n");
        }
        else
        {
            System.out.println(e3.toString());
            System.out.println("-------------- est égal à --------------");
            System.out.println(e4.toString());
            System.out.println("\n");
        }

        // Test : e5 et e6 → même nom et adresse, tous deux publics → donc = même si nb étudiants différent
        if (e5.equals(e6)==false)
        {
            System.out.println(e5.toString());
            System.out.println("-------------- n'est pas égal à --------------");
            System.out.println(e6.toString());
            System.out.println("\n");
        }
        else
        {
            System.out.println(e5.toString());
            System.out.println("-------------- est égal à --------------");
            System.out.println(e6.toString());
            System.out.println("\n");
        }

        // ------------------------------------------------------------------------------
        // Création de deux personnes liées à des écoles
        Personne p1 = new Personne("Muani", "Kolo", 26, e1); // Étudiant tertiaire (privé)
        Personne p2 = new Personne("Ru", "Salm", 26, e3);    // Étudiant secondaire (privé)

        // Affichage de ces personnes via leur méthode toString()
        System.out.println(p1);
        System.out.println("");
        System.out.println(p2);
    }
}

package Ex1;

import java.util.*;

/**
 * Exercice d'introduction à la comparaison d'objets simples (String, Integer, Personne, Lists)
 * Main plus bas pour tester les fonctions
 *
 * Implémentez les méthodes TODO
 */
public class SimpleCompare {


    // 1) Comparer deux String pour tester une égalité
    public static boolean compareString(String s1, String s2) {
        return false;
    }

    // 2) Comparer deux int pour tester une égalité
    public static boolean compareInt(int i1, int i2) {

        return i1 == i2;
    }

    // 3) Comparer deux int avec la méthode compareTo
    public static void compareIntAlphabetically(Integer i1, Integer i2) {

        //v1 classique = avec des operateurs et if

        //v2 on peut utiliser compareTo
        int res = i1.compareTo(i2);
        if (res < 0) {
            System.out.println(i1 + " est plus petit que " + i2);
        }
        else if (res > 0) {
            System.out.println(i1 + " est plus grand que " + i2);
        }
        else {
            System.out.println("Les deux sont égaux : " + i1 + " " + i2);
        }
    }

    // 4) Comparer deux chaines alphabétiquement et afficher le résultat
    public static void compareStringAlphabetically(String s1, String s2) {
        //TODO
        int res = s1.compareTo(s2);
        if (res < 0) {
            System.out.println(s1 + " est plus petit que " + s2);
        }
        else if (res > 0) {
            System.out.println(s1 + " est plus grand que " + s2);
        }
        else {
            System.out.println("Les deux sont égaux : " + s1 + " " + s2);
        }
    }

    // 5) Trier une liste de String avec sort
    public static void sortStringList(List<String> list) {
        //TODO
        System.out.println("Liste avant tri : " + list);
        Collections.sort(list);
        System.out.println("Liste après tri : " + list);
    }

    // 6) Inverser une liste de String
    public static void reverseStringList(List<String> list) {
        //TODO
        System.out.println("Liste avant tri : " + list);
        Collections.reverse(list);
        System.out.println("Liste après tri : " + list);
    }

    // 7) Comparer et trier deux Objects Personne par leur nom
    public static void compareAndSortPersonne(Personne a, Personne b) {

        compareStringAlphabetically(a.getNom(), b.getNom());
    }

    // 8) Trier une liste de Personne par leur nom en utilisant l'interface Comparable
    public static void sortPersonneList(List<Personne> list) {

        System.out.println("Liste avant tri : " + list);
        Collections.sort(list);
        System.out.println("Liste après tri : " + list);
    }

    // 9) Trier une liste de Personne par leur age en utilisant un Comparator
    public static void sortPersonneByAge(List<Personne> list) {

        System.out.println("Liste avant tri : " + list);
        Collections.sort(list, new CompareToPersonneAge());
        System.out.println("Liste après tri : " + list);
    }

    // 10) Trier une liste de Personne par leur nom descendant
    public static void sortPersonneByNameDesc(List<Personne> list) {

        System.out.println("Liste avant tri : " + list);
        Collections.sort(list, new CompareToPersonneDesc());
        System.out.println("Liste après tri : " + list);
    }

    public static void main(String[] args) {
        // MAIN : Pour tester vos fonctions

        // 1) Comparer deux String pour tester une égalité
        System.out.println("1)");
        System.out.println("compareString(\"test\", \"test\"): " + compareString("test", "test"));
        System.out.println("compareString(\"abc\", \"def\"): " + compareString("abc", "def"));

        // 2) Comparer deux int pour tester une égalité
        System.out.println("2)");
        System.out.println("compareInt(5, 5): " + compareInt(5, 5));
        System.out.println("compareInt(3, 4): " + compareInt(3, 4));

        // 3) Comparer deux int avec la méthode compareTo
        System.out.println("3)");
        compareIntAlphabetically(2, 10);
        compareIntAlphabetically(10, 2);
        compareIntAlphabetically(5, 5);

        // 4) Comparer deux chaines alphabétiquement et afficher le résultat
        System.out.println("4)");
        compareStringAlphabetically("alpha", "beta");
        compareStringAlphabetically("gamma", "beta");
        compareStringAlphabetically("delta", "delta");

        // 5) Trier une liste de String avec sort
        System.out.println("5)");
        List<String> words = new ArrayList<>(Arrays.asList("pomme", "banane", "orange", "kiwi"));
        sortStringList(words);

        // 6) Inverser une liste de String
        System.out.println("6)");
        reverseStringList(words);

        // 7) Comparer et trier deux Objects Personne par leur nom
        System.out.println("7)");
        Personne p1 = new Personne("Alice", 30);
        Personne p2 = new Personne("Bob", 25);
        Personne p3 = new Personne("Charlie", 35);
        compareAndSortPersonne(p1, p2);

        List<Personne> people = new ArrayList<>(Arrays.asList(
                p2, p3, p1

        ));
        // 8) Trier une liste de Personne par leur nom en utilisant Comparable
        System.out.println("8)");
        sortPersonneList(people);

        // 9) Trier une liste de Personne par leur age en utilisant un Comparator
        System.out.println("9)");
        sortPersonneByAge(people);

        // 10) Trier une liste de Personne par leur nom descendant
        System.out.println("10)");
        sortPersonneByNameDesc(people);
    }

}

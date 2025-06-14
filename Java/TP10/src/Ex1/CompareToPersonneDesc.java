package Ex1;

import java.util.Comparator;

public class CompareToPersonneDesc implements Comparator<Personne> {
    @Override
    public int compare(Personne o1, Personne o2) {
        int res = o1.getNom().compareTo(o2.getNom());
        return res * -1;
    }
}

package Ex1;

import java.util.Comparator;

public class CompareToPersonneAge implements Comparator<Personne> {
    @Override
    public int compare(Personne o1, Personne o2) {
        if (o1.getAge() < o2.getAge())
            return -1;
        else if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        return 0;
    }
}

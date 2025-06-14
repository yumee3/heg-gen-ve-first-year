package Ex2.Domaine;

import java.util.Comparator;

public class CompareToTableBois implements Comparator<Table> {
    @Override
    public int compare(Table o1, Table o2) {
        int res = o1.getCode().compareTo(o2.getCode());
        if (res < 0) {
            return -1;
        } else if (res > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

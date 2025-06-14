package Ex2.Domaine;

import java.util.Comparator;

public class CompareToSurfaceDesc implements Comparator<Table> {
    @Override
    public int compare(Table o1, Table o2) {
        int res = Double.compare(o2.getSurface(), o1.getSurface());
        if (res < 0) {
            return -1;
        }
        else if (res > 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

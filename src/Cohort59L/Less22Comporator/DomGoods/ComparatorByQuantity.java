package Cohort59L.Less22Comporator.DomGoods;

import java.util.Comparator;

public class ComparatorByQuantity implements Comparator<Good> {


    @Override
    public int compare(Good o1, Good o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}

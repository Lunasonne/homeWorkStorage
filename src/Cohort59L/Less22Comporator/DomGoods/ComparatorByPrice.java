package Cohort59L.Less22Comporator.DomGoods;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Good> {


    @Override
    public int compare(Good o1, Good o2) {
        return  Double.compare(o1.getPrice(),o2.getPrice());
    }


}

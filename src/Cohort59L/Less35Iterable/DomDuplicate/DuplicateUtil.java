package Cohort59L.Less35Iterable.DomDuplicate;
// Дан лист String. Необходимо определить, есть ли в данном листе повторяющиеся объекты.
// (данный метод можно реализовать в общем виде, для листа любых объектов)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateUtil {

    public static <T> boolean hasDuplicate(List<T> list) {
        Set<T> result = new HashSet<>();
        for (T currentList : list) {
            if (result.contains(currentList)) {
                return true;
            } else result.add(currentList);
        }
        return false;
    }

    public static <T> List<T> deleteDuplicate(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }

    public static String deleteDuplicateName(String name) {
        String[] names = name.split(",");
        Set<String> uniqueNames = new HashSet<>();
        for (String currentName : names) {
            uniqueNames.add(currentName);
        }
        return String.join(",", uniqueNames);
    }
}
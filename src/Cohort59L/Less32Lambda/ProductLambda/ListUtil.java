package Cohort59L.Less32Lambda.ProductLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtil {

    public static <T> List<T> sort(List<T> list, Comparator<T> comparator){
        List<T> result = new ArrayList<>(list);
        Collections.sort(result,comparator);
        return result;
    }



    public static <T> void print(List<T> list){
        for (T element: list){
            System.out.println(element);
        }
    }

    public static List<Product> filter(List<Product> list, Filter filter ){
        List<Product> result = new ArrayList<>();
        for (Product element: list){
           if(filter.test(element)){
               result.add(element);
           }
        }
        return result;
    }


    private ListUtil() {
    }
}

package Cohort59L.Less22Comporator.DomGoods;

import Cohort59L.Less22Comporator.Person.ComparatorByName;
import Cohort59L.Less22Comporator.Person.Person;

import java.util.*;

public class ShopperApp {
    public static void main(String[] args) {

        List<Good> goodsList = new ArrayList<>();
        goodsList.add(new Good("Xiaomi 14", 250.0, 70, 4));
        goodsList.add(new Good("Apple iPhone 15", 1200.0, 55, 2));
        goodsList.add(new Good("Samsung galaxy A71", 500.0, 50, 5));
        goodsList.add(new Good("Samsung galaxy A56", 450.0, 35, 6));
        goodsList.add(new Good("Apple iPhone 16", 1500.0, 60, 1));
        goodsList.add(new Good("Apple iPhone 14", 1100.0, 20, 3));
        goodsList.add(new Good("Apple iPhone 13", 900.0, 10, 7));
        goodsList.add(new Good("Xiaomi 13", 150.0, 29, 7));


        // public void start() {

        //  while (true) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите пункт меню: ");
        Integer scannerUser = scanner.nextInt();

                switch (scannerUser) {
            case 1:
                Collections.sort(goodsList, new ComparatorByPrice());
                System.out.println("Товар отсортирован в порядке возрастания цены: ");
                print(goodsList);
            break;

            case 2:
                Collections.sort(goodsList, new ComparatorByPrice().reversed());
                System.out.println("Товар отсортирован в порядке  убывания цены: " );
                print(goodsList);
                break;

            case 3:
                Collections.sort(goodsList, new ComparatorByRating());
                System.out.println("Товар отсортирован по рейтингу: ");
                print(goodsList);
                break;

            case 4:
                Collections.sort(goodsList, new ComparatorByQuantity());
                System.out.println("Товар отсортирован по количеству: " );
                print(goodsList);
                break;

            default:
                System.out.println("Некорректный выбор пункта меню");
        }

    }
        public static void print (List<Good> list) {
            for (Good good : list) {
                System.out.println(good);
            }

        }
    }
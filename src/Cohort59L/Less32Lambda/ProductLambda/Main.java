package Cohort59L.Less32Lambda.ProductLambda;/*
Предположим, вы пишите программу для on-line магазина
У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д.
Программа предлагает пользователю выбрать, как бы он хотел сортировать товары и,
в зависимости от выбора пользователя, выводит список товаров в нужном порядке (например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).

Давайте создадим интерфейс
interface Filter {
    boolean test(Product p);
}
Напишите метод, который используя этот интерфейс фильтрует список товаров заданным способом.
Реализуйте интерфейс с помощью анонимных классов, и
отберите из заданного списка продуктов продукты дороже 100
отберите из заданного списка продуктов продукты, которых на складе менее 100
 */

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product("Samsung S24", 650, 4.7, 12),
                new Product("Apple Iphone 15", 99.9, 4.8, 8),
                new Product("Google Pixel", 550, 4.4, 15),
                new Product("Xiaomi Redmi 14", 400, 4.5, 9),
                new Product("Apple Iphone 16", 1000, 4.6, 5)
        );

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите режим сортировки: ");
            System.out.println("1. по названию ");
            System.out.println("2. по названию (обратная) ");
            System.out.println("3. по цене ");
            System.out.println("4. по цене (обратная) ");
            System.out.println("5. по рейтингу (обратная) ");
            System.out.println("6. по количеству");

            int select = scanner.nextInt();
            List<Product> sortedList = null;

            switch (select) {
                case 1:
                    System.out.println("--- по названию ---");
                    sortedList = ListUtil.sort(productList, Product.byTitle());
                    break;
                case 2:
                    System.out.println("--- по названию (обратная) ---");
                    sortedList = ListUtil.sort(productList, Product.byTitle().reversed());
                    break;
                case 3:
                    System.out.println("--- по цене ---");
                    sortedList = ListUtil.sort(productList, Product.byPrice());
                    break;
                case 4:
                    System.out.println("--- по цене обратная ---");
                    sortedList = ListUtil.sort(productList, Product.byPrice().reversed());
                    break;
                case 5:
                    System.out.println("--- по рейтингу обратная---");
                    sortedList = ListUtil.sort(productList, Product.byRating().reversed());
                    break;
                case 6:
                    System.out.println("--- по количеству ---");
                    sortedList = ListUtil.sort(productList, Product.byQuantity());
                    break;
            }
            if (sortedList == null) {
                break;
            } else {
                ListUtil.print(sortedList);
            }
        }

        System.out.println("------------- FILTER ------------");
        List<Product> filterList1 = ListUtil.filter(productList, (Product p) -> p.getPrice() > 100);
        ListUtil.print(filterList1);

        System.out.println("------------- FILTER -----------");
        Filter filter2 = (Product p) -> p.getQuantity() < 10;
        List<Product> filterList2 = ListUtil.filter(productList, filter2);
        ListUtil.print(filterList2);
    }
}
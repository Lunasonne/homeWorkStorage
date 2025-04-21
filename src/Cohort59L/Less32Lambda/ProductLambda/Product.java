package Cohort59L.Less32Lambda.ProductLambda;

import java.util.Comparator;

public class Product {
    private String title;
    private double price;
    private double rating;
    private int quantity;

    public Product(String title, double price, double rating, int quantity) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", quantity=" + quantity +
                '}';
    }

    public static Comparator<Product> byTitle() {
        Comparator<Product> comparatorByTitle = (Product o1, Product o2) -> o1.getTitle().compareTo(o2.getTitle());
        return comparatorByTitle;
    }


    public static Comparator<Product> byPrice() {
        Comparator<Product> comparatorByPrice = (Product o1, Product o2) -> Double.compare(o1.getPrice(), o2.getPrice());
        return comparatorByPrice;
    }


    public static Comparator<Product> byRating() {
        Comparator<Product> comparatorByRating = (Product o1, Product o2) -> Double.compare(o1.getRating(), o2.getRating());
        return comparatorByRating;
    }


    public static Comparator<Product> byQuantity() {
        Comparator<Product> comparatorByQuantity = (Product o1, Product o2) -> Integer.compare(o1.getQuantity(), o2.getQuantity());
        return comparatorByQuantity;
    }

}



package Cohort59L.Less22Comporator.DomGoods;
// У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д.
// Программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и,
// в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например, по цене
// по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).
// Для этого можно использовать метод Collection.sort и реализовать несколько Comparator<Person>

public class Good {
    private String name;
    private double price;
    private int rating;
    private int quantity;

    public Good(String name, double price, int quantity, int rating) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return  name +  " цена: " + price +  " рейтинг: " + rating +
                     " количество: " + quantity  ;
    }
}

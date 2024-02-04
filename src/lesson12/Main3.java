package lesson12;


//Создать свой класс для описания заказа.
//Класс должен содержать поля id заказа и стоимость заказа=- обязательные поля.
//Создать несколько заказов и поместить их в коллекцию.
//Вывести коллекцию на экран.
//Отсортировать заказы и вывести отсортированную коллекцию на экран.
//Заказы сортируются по цене по возрастанию.
//Для сортировки заказов следует создать свой компаратор

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Order {
    private int id;
    private int cost;
    private String customer;

    public Order(int id, int cost, String customer) {
        this.id = id;
        this.cost = cost;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public String getcustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return id + ", " + cost + ", " + customer;
    }
}

class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}

public class Main3 {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();


        orders.add(new Order(101, 3000000, "Vasya"));
        orders.add(new Order(2045, 25301, "Petya"));
        orders.add(new Order(36984, 70, "Volodya"));

        System.out.println("Current structure");
        for (Order order : orders) {
            System.out.println(order);
        }

        Collections.sort(orders, new OrderComparator());

        System.out.println("Sorted structure");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
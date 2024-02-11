package lesson12;

import java.time.LocalDate;
import java.util.*;


//Создать класс для описания клиента.
//Поместить в класс поля для описания клиента (дата регистрации(LocalDate), имя, возраст ).
//Класс клиента должен содержеть поле-коллекцию с заказами этого клиента - это, своего рода, корзина заказов клиента.
//Класс заказа должен создежать поля для описания заказ (цена, описание и рейтинг).
//Создать нескольких клиентов.
//Для каждого клиента создать несколько заказов и поместить их в поле-коллекцию для заказов.
//Создать коллекцию типа Мар и заполнить ее парами "номер паспорта клиента" -> "объект класса клиент".
//Номера паспортов можно хранить как константы в созданном для этого интерфейсе.
//Пройти циклом по коллекции и вывести на экран:
//- все пары ключ-значение, использую Map.Entry<K, V> entry : map.entrySet()
//- все пары ключ-значение, использую итератор
//- все ключи, используя map.keySet()
//- все значения, используя map.values()
//пройтись итератором по всем элементам
class ClientOrder {
    double price;
    String description;
    int rating;

    public ClientOrder(double price, String description, int rating) {
        this.price = price;
        this.description = description;
        this.rating = rating;
    }
}

class Client {
    LocalDate registrationDate;
    String name;
    int age;
    String gender;
    String zodiacSign;
    List<ClientOrder> orders;

    public Client(LocalDate registrationDate, String name, int age, String gender, String zodiacSign) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.zodiacSign = zodiacSign;
        this.orders = new ArrayList<>();
    }

    public void addOrder(ClientOrder order) {
        orders.add(order);
    }
}

interface PassportNumbers {
    String PASSPORT_NUMBER_1 = "MP25091991";
    String PASSPORT_NUMBER_2 = "MP05071997";
}

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(LocalDate.now(), "Svyatoslav", 32, "Male", "Libra");
        Client client2 = new Client(LocalDate.now(), "Inna", 27, "Female", "Cancer");

        client1.addOrder(new ClientOrder(100.0, "Xiaomi 7A", 17));
        client1.addOrder(new ClientOrder(2000.0, "iPhone SE", 1));
        client2.addOrder(new ClientOrder(1500.0, "Samsung A52", 3));
        client2.addOrder(new ClientOrder(300.0, "Huawei P9", 1));

        Map<String, Client> clientMap = new HashMap<>();
        clientMap.put(PassportNumbers.PASSPORT_NUMBER_1, client1);
        clientMap.put(PassportNumbers.PASSPORT_NUMBER_2, client2);

        System.out.println("Ключ-значение Map.Entry<K, V>:");
        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            System.out.println("Паспортный номер: " + entry.getKey() + ", Клиент: " + entry.getValue().name);
        }

        System.out.println("Ключ-значение итератор:");
        Iterator<Map.Entry<String, Client>> iterator = clientMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Паспортный номер: " + entry.getKey() + ", Клиент: " + entry.getValue().name);
        }

        System.out.println("Ключ-значение map.keySet():");
        for (String passportNumber : clientMap.keySet()) {
            System.out.println("Паспортный номер: " + passportNumber);
        }

        System.out.println("Ключ-значение map.values():");
        for (Client client : clientMap.values()) {
            System.out.println("Клиент: " + client.name);
        }

        System.out.println("Проход итератора по всем элементам:");
        iterator = clientMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Паспортный номер: " + entry.getKey() + ", Клиент: " + entry.getValue().name);
        }
        System.out.println("Клиенты и их заказы:");
        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            System.out.println("Паспортный номер: " + entry.getKey() + ", Клиент: " + entry.getValue().name);
            System.out.println("Заказы:");
            for (ClientOrder order : entry.getValue().orders) {
                System.out.println("  Описание: " + order.description + ", Цена: " + order.price);
            }
            System.out.println();
        }
    }
}
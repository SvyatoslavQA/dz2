package lesson12;

import java.util.HashSet;
import java.util.Set;

//Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
//Вывести коллекцию на экран.
public class Gruppa {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Стас");
        uniqueNames.add("Святослав");
        uniqueNames.add("Ирина");
        uniqueNames.add("Артём");
        uniqueNames.add("Оля");
        uniqueNames.add("Артём");
        uniqueNames.add("Алеся");
        uniqueNames.add("Евгений");
        uniqueNames.add("Илья");
        uniqueNames.add("Павел");
        uniqueNames.add("Роланд");
        uniqueNames.add("Оля");
        System.out.println("after duplicates remove:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}

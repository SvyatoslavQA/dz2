package lesson12;
//Создать коллекцию целых чисел.
//Заполните коллекцию рандомными числами.
//Пусть размер коллекции задается с консоли.
//Предусмотреть возможно ошибок при получении размера коллекции с консоли.
//Предусмотреть проверку введенного размера коллекции на валидность.
//Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        while (true) {
            System.out.print("please setup array lenght");
            String input = scanner.nextLine();

            try {
                size = Integer.parseInt(input);
                if (size > 0) {
                    break;
                } else {
                    System.out.println("invalid lenght of array");
                }
            } catch (NumberFormatException e) {
                System.out.println("allowed numbers only");
            }
        }

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        System.out.print("array to test:");
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(10);
            numbers.add(num);
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / size;

        System.out.println("average=" + average);
    }
}
package lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Задача 1
//Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
//При заполнении коллекции числами с консоли следует делать приведения типа.
//Код для привдения строки к числу можно использовать следующий:
//int i = Integer.parseInt(str);
//или
//int val = Integer.valueOf(str);
//Для окончания ввода введите слово "exit".
//При приведении строки к числу, следует учитывать возможность исключений.
//Некоторые полезные примеры кода для приведения строки к числу можно найти по ссылке
//https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/
//На экран вывести четные числа из коллекции.



public class ConsoleInput {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("please insert numbers or exit to stop:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("allowed only numbers");
            }
        }

        System.out.println("even numbers:");
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 7, 11, 13, 17};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("input number");
        int number = myScanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("number inside array");
                break;
            } else if (i == array.length - 1) {
                System.out.println("number not inside array");
            }
        }
    }
}
// сами задаем массив
//вводим число со сканнера
//програ опредеялт есть число в массиве или нет
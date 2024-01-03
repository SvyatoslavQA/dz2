package lesson4;

import java.util.Scanner;
import java.util.Arrays;

public class Main18 {
    public static void main(String[] args) {
        String[][] myArray = new String[8][8];
        for (int x = 0; x < myArray.length; x++) {
            for (int y = 0; y < myArray[x].length; y++) {
                if ((x + y) % 2 == 0) {
                    myArray[x][y] = "W";
                } else {
                    myArray[x][y] = "B";
                }
            }
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    System.out.print(myArray[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }}
//Создайте массив из N случайных целых чисел из отрезка [0;99].
//Выведите его на экран в строку.
//Далее определите и выведите на экран сообщение о том, является ли массив строго
// возрастающей последовательностью. (Строго возрастающей последовательсностью
// считается массив у которого каждый следующий элемент больше предыдущего)11111111111
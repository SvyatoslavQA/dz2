package lesson4;

import java.util.Scanner;
import java.util.Arrays;

public class Main16 {
    public static void main(String[] args) {
    int[][][] myArray = {
            {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
            {{13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}}
    };
    Scanner myScanner  = new Scanner(System.in);
    int number = myScanner.nextInt();
    System.out.println("insert int");
        for (int x = 0; x < myArray.length; x++) {
            for (int y = 0; y < myArray[x].length; y++) {
                for (int z = 0; z < myArray[x][y].length; z++) {
                    myArray[x][y][z] += number;
                }
            }
        }

        for (int x = 0; x < myArray.length; x++) {
            for (int y = 0; y < myArray[x].length; y++) {
                for (int z = 0; z < myArray[x][y].length; z++) {
                    System.out.print(myArray[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
//создать массив из целых чисел
//с помощью циклов пройти по всему массиву и увеличить каждый элемент на заданное со сканера число

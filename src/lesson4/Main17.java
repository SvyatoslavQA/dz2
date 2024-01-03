package lesson4;

import java.util.Scanner;
import java.util.Arrays;

public class Main17 {
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
//дан массив стрингов 8x8
//c помощью циклов раскрасить как шахматную доску в значения W B
package lesson3;

import java.util.Arrays;

public class Main15 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 14};
        int[] array2 = {2, 4, 6, 8, 10};
        System.out.println("first array: " + Arrays.toString(array));
        System.out.println("second array: " + Arrays.toString(array2));
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        //System.out.println("first array sum: " + (sum));
        //System.out.println("second array sum: " + (sum2));
        double average = (double) sum / array.length;
        double average2 = (double) sum2 / array2.length;
        //System.out.println("average array first " + (average));
        //System.out.println("average array second " + (average2));
        if (average > average2) {
            System.out.println("array bigger than array2");
        }
        if (average < average2) {
            System.out.println("array smaller than array2");
        }
        if (average == average2) {
            System.out.println("array equals array2");
        }
    }
}

//два массива
//посчитать и сравнить среднее

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main14 {
    public static void main(String[] args) {

        Scanner myScanner  = new Scanner(System.in);
        System.out.println("insert int");
        int length = myScanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10000-1));
        }
        int min = array[0];
        int max = array[0];
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            average += (double) array[i] / array.length;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("max int equals " + max);
        System.out.println("min int equals: " + min);
        System.out.println("average value equals: " + average);
    }
}

//массив длинно со сканера
//наполняем рандомными
//считаем мин макс и среднее
import java.util.Arrays;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 7};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("input number");
        int number = myScanner.nextInt();
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, indexToRemove);
            System.arraycopy(array, indexToRemove + 1, newArray, indexToRemove, array.length - indexToRemove - 1);

            System.out.println("Исходный массив: " + Arrays.toString(array));
            System.out.println("Новый массив после удаления элемента " + number + ": " + Arrays.toString(newArray));
        } else {
            System.out.println("Элемент " + number + " не найден в массиве.");
        }
    }
}
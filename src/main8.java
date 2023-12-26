import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("введи инт");
        int number = myScanner.nextInt();

        for (int i = 1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}





//пользователь вводит число а програ суммирует всё от 1 до числа

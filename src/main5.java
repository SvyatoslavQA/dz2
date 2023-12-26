import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int insertedInt = myScanner.nextInt();

        if (insertedInt == 1) {
            System.out.println("red");
        }
        else if (insertedInt == 2) {
            System.out.println("orange");
        }
        else if (insertedInt == 3) {
            System.out.println("yellow");
        }
        else if (insertedInt == 4) {
            System.out.println("green");
        }


    }
}

//на вход принимаем любое число и на выход выводим какой цвет радуги

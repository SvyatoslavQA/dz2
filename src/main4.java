import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int insertedInt = myScanner.nextInt();

        if (insertedInt > -5) {
            System.out.println("teplo");
        }
        else if (insertedInt < -5 && insertedInt > -20) {
            System.out.println("norm");
        }
        else {
            System.out.println("holodno");
        }


    }
}

//на вход принимаем любое число и на выход выводим какая сейчас погода

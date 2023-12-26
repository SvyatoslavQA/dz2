import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int insertedInt = myScanner.nextInt();

        if (insertedInt %2 ==0) {
            System.out.println("chetnoe");
        }
        else {
            System.out.println("nechetnoe");
        }


    }
}

//на вход принимаем любое число и на выход выводить
// сообщение четное или нет  (юзать `%2`)

public class main2 {
    public static void main(String[] args) {
        int month = 1;
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("winter");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("vesna");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("leto");
        }
        else if (month == 9 || month == 10 || month == 11) {
            System.out.println("osen");
        }
        else {
            System.out.println("fake");
        }
    }
}

//вывод названия поры года по номеру месяца if else

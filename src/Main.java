public class Main {
    public static void main(String[] args) {
        int num = 14;
        switch (num) {
            case 1, 2, 12:
                System.out.println("Its Winter");
                break;
            case 3, 4, 5:
                System.out.println("Its Spring");
                break;
            case 6, 7, 8:
                System.out.println("Its Summer");
                break;
            case 9, 10, 11:
                System.out.println("Its Autumn");
                break;
            default:
                System.out.println("error, non existing monthId inserted");
        }
    }
}

//вывод названия поры года по номеру месяца switch case

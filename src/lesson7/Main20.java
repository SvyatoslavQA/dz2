//создать классы директор рабочий бухгалтер
//реализовать интерфейс с методом который печатает название должности
// и имплементировать этот метод в созданные классы
//не забыть ФОРМАТИРОВАНИЕ


package lesson7;

interface Job {
    void printJobName();
}

class Director implements Job {
    @Override
    public void printJobName() {
        System.out.println("Директор");
    }
}

class Worker implements Job {
    @Override
    public void printJobName() {
        System.out.println("Рабочий");
    }
}

class Accountant implements Job {
    @Override
    public void printJobName() {
        System.out.println("Бухгалтер");
    }
}

public class Main20 {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printJobName();
        worker.printJobName();
        accountant.printJobName();
    }
}
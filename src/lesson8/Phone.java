//создать класс phone который содержит переменные number model weight
//cоздать три экземпляра этого класса
//вывести на консоль значения их переменных
//добавить в класс phone метод receiveCall который имеет один параметр - имя входящего
//выводит в консоль соообщение "звонит {name}".
//getNumber возвращает телефон звонившего
//вызвать эти методы для каждого из объектов\
//добавить конструкт в класс phone который принимает на вход три параметра для инициализации переменных класса number model weight
// добавить конструкт который принимает на вход два  параметра для инициализации переменных класса number model
//добавить конструктор без параметров
//вызвать из конструктора с тремя параметрами конструктор с двумя
//добавить перегруженный метод receiveCall который принимает два параметра - имя звонящего и его номер. вызвать этот метод
//создать метод sendMessage с аргументами переменной длины . Данный метод принимает на вход номера телефонов которым будет отправлено сообщение . метод выводит на консоль номера этих телефонов
//не забыть ФОРМАТИРОВАНИЕ
package lesson8;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this("N/A", "N/A");
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + "Номер телефона: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.print("Отправлено сообщение на номера:");
        for (String number : phoneNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void displayInfo() {
        System.out.println("Телефон:" + number);
        System.out.println("Модель:" + model);
        System.out.println("Вес:" + weight);
    }

    // Пример использования
    public static void main(String[] args) {
        Phone phone1 = new Phone("37529xxxx", "Redmi 4x", 120.0);
        Phone phone2 = new Phone("37529xxxx", "Redmi 7A");
        Phone phone3 = new Phone();

        phone1.displayInfo();
        phone1.receiveCall("Svyat Pril1");
        phone1.sendMessage("37529xxxx", "37529xxxx");

        System.out.println();

        phone2.displayInfo();
        phone2.receiveCall("Svyat Pril2", "37529xxxx");
        phone2.sendMessage("37529xxxx", "37529xxxx", "37529xxxx");

        System.out.println();

        phone3.displayInfo();
        phone3.receiveCall("Svyat Pril3");
        phone3.sendMessage("37529xxxx", "37529xxxx", "37529xxxx");
    }
}
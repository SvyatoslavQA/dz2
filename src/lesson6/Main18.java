package lesson6;

import java.util.Scanner;
import java.util.Random;

class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to account " + accountNumber);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("deleted " + amount + " to account " + accountNumber);
    }


    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);

    }
}

public class Main18 {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("123", 1000.0);
        CreditCard card2 = new CreditCard("456", 2000.0);
        CreditCard card3 = new CreditCard("79", 500.0);

        card1.deposit(500.0);
        card2.deposit(1000.0);
        card3.withdraw(200.0);


        System.out.println("Current balances after changes!!!!:");
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}


//cоздать класс cretidCard (номер счета, текущая сумма)
//метод который добавит нужную сумму на карту
//метод который уберет нужную сумму с карты
//метод который выведет текущую инфу о карте
//напишите прогу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
//тест1 - положить деньги на первые две и снять с третьей
//тест2 - вывести на экран текущие деньги всех карточек!!!
//111


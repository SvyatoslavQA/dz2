package lesson10;

//на вход передается строка номер документа вида "xxxx-yyy-xxxx-yyy-xyxy"  (где x - число а y - буква)
//вывести на экран в одну строку два первых блока по 4 цифры
//вывести на экран номер документа но блоки из трех букв заменить на ***
//вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
//вывести на экран буквы из номер адокумента в формате "Letters: yyy/yyy/y/y" в верхнем регистре реализовать с помощью класса StringBuilder
//проверить содержит ли номер документ последовательность abc и вывести сообщение содержит или нет (abc и ABC считается одинаковой последовательностью)
//проверить начинается ли номер документа с последовательности 555
//проверить заканчивается ли номер документа на последовательности 1a2b
//все методы реализовать в отдельном классе в статических методах ктороые на вход будут принимать строку номера документа

//ФОРМАТИРОВАНИЕ


public class Main {

    public static void main(String[] args) {
        String document = "5554-abc-5678-def-1a2b";

        getFirstEightDigits(document);
        replacedBlocks(document);
        documentLettersToLowerCase(document);
        documentLettersToUpperCase(document);
        documentHas(document, "abc");
        documentStart(document, "555");
        documentEnd(document, "1a2b");
    }

    public static void getFirstEightDigits(String document) {
        StringBuilder result = new StringBuilder();
        for (char c : document.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
                if (result.length() == 8)
                    break;
            }
        }
        System.out.println(result);

    }


    public static void replacedBlocks(String document) {
        String modifiedDocument = document.replaceAll("[A-z]{3}", "***"); //comment from PR - A-z можно так писать
        System.out.println("updated blocked document: " + modifiedDocument);
    }

    public static void documentLettersToLowerCase(String document) {
        StringBuilder result = new StringBuilder();
        for (char c : document.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(Character.toLowerCase(c));
                result.append("/");
            }
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }

    public static void documentLettersToUpperCase(String document) {
        StringBuilder result = new StringBuilder("Letters: ");
        for (char c : document.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
                result.append("/");
            }
        }
        System.out.println(result);
    }

    public static void documentHas(String document, String mask) {
        if (document.toLowerCase().contains(mask.toLowerCase())) {
            System.out.println("Document has " + mask);
        } else {
            System.out.println("Document doesnt have " + mask);
        }
    }

    public static void documentStart(String document, String mask) {
        if (document.startsWith(mask)) {
            System.out.println("Name starts with " + mask);
        } else {
            System.out.println("Name do not start with " + mask);
        }
    }

    public static void documentEnd(String document, String mask) {
        if (document.endsWith(mask)) {
            System.out.println("Finished with " + mask);
        } else {
            System.out.println("Not finished with " + mask);
        }
    }
}
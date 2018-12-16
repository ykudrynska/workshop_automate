package lecrure1;

import java.util.Scanner;

//        Ввести с клавиатуры число и имя, вывести на экран строку:
//        Я "имя” и мне "число” лет! - строка как пример возможно любая строка что вам будет удобно
//
//        Пример:
//        Я “Анатолий” и мне “7” лет!
//
//        Последовательность вводимых данных имеет большое значение.
//        Требования:
//        Программа должна выводить текст.
//        Программа должна считывать данные с клавиатуры.
//        Выведенный текст должен содержать введенное имя.
//        Выведенный текст должен содержать введенное число.

public class Task1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = String.format(scanner.nextLine());
        System.out.println("Enter your age: ");
        String age = String.format(scanner.nextLine());
        System.out.println("My name is " + name + ", I am " + age + " years old.");
    }
}

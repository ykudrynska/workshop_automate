package com.ykudrynska;


// 1. Создать массив на 20 чисел.
// 2. Ввести в него значения с клавиатуры.
// 3. Создать два массива с четными и нечетными числами.
// 4. Вывести оба массива на экран, каждое значение выводить с новой строки.


import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        int[] array = readIntegers(5);
        System.out.println("Array: " + Arrays.toString(array));
        eventOddSort(array);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " numbers:");
        for(int i = 0; i<array.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static void eventOddSort(int[] array) {
        System.out.println("Even numbers are: ");
        for (int i=0; i<array.length; i++){
            if(array[i]%2 == 0){
                System.out.println(array[i]);
            }
        }
        System.out.println("Odd numbers are: ");

        for (int i=0; i<array.length; i++){
            if(array[i]%2 != 0){
                System.out.println(array[i]);
            }
        }
    }
}

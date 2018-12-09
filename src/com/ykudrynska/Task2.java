package com.ykudrynska;

import java.util.Arrays;

// 1. Создать массив на 10 чисел.
// 2. Ввести с клавиатуры 10 чисел и записать их в массив.
// 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

public class Task2 {

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }

    }
}

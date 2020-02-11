package com.company;

public class SimpleBubble {

    private SimpleBubble() {}

    public static int[] sort(int[] array) {
        if (array.length == 0) System.err.println("Ошибка, массив должен содержать хотя бы один элемент");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j])
                    swap(array, j, j + 1);
            }
        }
        return array;
    }

    private static void swap(int[] array, int k, int l) {
        int temp = array[k];
        array[k] = array[l];
        array[l] = temp;
    }
}

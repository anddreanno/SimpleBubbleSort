package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{34, 42, 9, 12, 3, 56, 78, 44, 67, 54, 23, 2, 82, 15, 6, 10};
        print(array);

        var array1 = SimpleBubble.sort(array);
        print(array1);
    }

    public static void print(int[] ar) {
        for (var el : ar)
            System.out.print(el + " ");
        System.out.println();
    }
}

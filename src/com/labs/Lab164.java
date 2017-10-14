package com.labs;

import java.util.Arrays;

public class Lab164 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 14, 15, 8, 5, 7, 25, 3 , 21, 66};
        System.out.println("Начальный порядок чисел в массиве:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Порядок чисел в массиве после пересортировки:");
        System.out.println(Arrays.toString(arr));
        int sNum = 14;
        int indexOfNum = Arrays.binarySearch(arr,sNum);
        System.out.println();
        System.out.println("Индекс числа 14 в пересортированном массиве: " + indexOfNum);
        System.out.println("Позиция числа 14 в пересортированном массиве: " + (indexOfNum + 1));
        System.out.println();
        System.out.println("Выведем число по новому индексу массива \"arr[5]\" : " + arr[5]);
    }
}

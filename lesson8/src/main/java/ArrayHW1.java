package main.java;

import java.util.Random;

// ДЗ 1. Нахождение минимума, максимума и среднего арифметического

public class ArrayHW1 {

    private static int arraySize = 20;
    private static int[] array = new int[arraySize];

    static {
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(1000);
        }

    }

    public static void main(String[] args) {
        printArray();
        findMinMaxAvg();
    }

    private static void findMinMaxAvg() {

        int max, min;
        max = array[0];
        min = array[0];
        double average = 0;

        for (int i = 1; i < arraySize; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
            average += array[i];
        }
        average = average / arraySize;
        System.out.println("Max element = " + max + '\n'
                + "Min element = " + min + '\n'
                + "Avg element = " + average);
    }

    private static void printArray() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}

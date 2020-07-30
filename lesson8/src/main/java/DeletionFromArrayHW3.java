package main.java;

import java.util.Random;

// ДЗ 3. Удаление вхождений заданного элемента из массива

public class DeletionFromArrayHW3 {

    private static int arraySize = 20;
    private static int[] array = new int[arraySize];
    private static int numberToDelete = 5;

    static {
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(6);
        }
    }

    public static void main(String[] args) {
        printArray();
        deleteNumber();
        printArray();
    }

    private static void deleteNumber() {
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == numberToDelete) {
                shiftArray(i);
                i--;
                arraySize--;
            }
        }
    }

    private static void shiftArray(int index) {
        for (int i = index; i < arraySize - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    private static void printArray() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}

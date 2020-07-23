package main.java;

public class PrimeNumbersHW2 {

    private static int leftBound = 2;
    private static int rightBound = 100;

    // ДЗ 2. Нахождение всех простых чисел в заданном промежутке

    public static void main(String[] args) {
        findPrimeNumbers();
    }

    private static void findPrimeNumbers() {
        for (int i = leftBound + 1; i <= rightBound; i++) {
            boolean primeNumber = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber)
                System.out.print(i + " ");
        }
    }

}

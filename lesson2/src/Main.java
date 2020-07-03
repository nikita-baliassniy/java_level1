public class Main {

    public static void main(String[] args) {

        int size = 11;
        int[] bitArray = {0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1};
        int[] eightArray = new int[8];
        int[] currentArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] anotherArray = {0, 5, -2, 15, 240, 9, 0};
        int[][] matrix = new int[size][size];

    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        printArray(array);
    }

    private static void getInverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] + 1) % 2;
        }
        printArray(array);
    }

    private static void multiplyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        printArray(array);
    }

    private static void fillDiagsWith1(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        printMatrix(matrix);
    }

    private static void returnMaxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
    }

    private static boolean getBalance(int[] array) {

        boolean answer = false;
        for (int i = 1; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int j = array.length - 1; j >= i; j--) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    private static void getShiftArray(int[] array, int shift) {

        System.out.println("ARRAY WAS: ");
        printArray(array);

        int realShift = 0;
        if (shift < 0) {
            realShift = array.length + shift;
        } else {
            realShift = shift;
        }
        for (int i = 0; i < realShift; i++) {
            int previous = array[array.length - 1];
            int next;
            for (int j = 0; j < array.length; j++) {
                next = array[j];
                array[j] = previous;
                previous = next;
            }
        }
        System.out.println("ARRAY >> " + shift + ":");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

package main.java.randomByWeightHW4;

public class MainForHW4 {

    private static int[] array = {1, 2, 3, 4, 5};
    private static int[] weightArray = {10, 2, 5, 6, 20};


    public static void main(String[] args) {
        RandomByWeightHW4 randomByWeightHW4 = new RandomByWeightHW4(array, weightArray);

        for (int i = 0; i < 50; i++) {
            System.out.print(randomByWeightHW4.getRandomNumber() + " ");
        }
    }
}

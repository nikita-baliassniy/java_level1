package main.java.randomByWeightHW4;

import java.util.Random;

// ДЗ 4. Выбор случайного числа из массива в зависимости от весов чисел

public class RandomByWeightHW4 {

    private int[] array;
    private int[] weightArray;

    public RandomByWeightHW4(int[] array, int[] weightArray) {
        this.array = array;
        this.weightArray = new int[weightArray.length];
        int partialSum = weightArray[0];
        for (int i = 1; i < weightArray.length; i++) {
            partialSum += weightArray[i];
            this.weightArray[i] = partialSum;
        }
    }

    public int getRandomNumber() {
        int weightSum = weightArray[weightArray.length - 1];
        Random random = new Random();
        int randomNumber = random.nextInt(weightSum + 1);
        for (int i = 0; i < weightArray.length; i++) {
            if (randomNumber <= weightArray[i]) {
                return array[i];
            }
        }
        return -1;
    }
}

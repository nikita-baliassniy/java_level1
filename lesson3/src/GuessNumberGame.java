import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    private static final int numberOfTries = 3;
    private static final int boundForRandom = 10;

    public static void main(String[] args) {
        playNumberGame();
    }

    private static void playNumberGame() {
        Random random = new Random();
        int currentNumber = random.nextInt(boundForRandom);
        System.out.println("Угадайте число от 0 до 9");
        boolean win = false;
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        for (int i = 0; i < numberOfTries; i++) {
            int currentTry = Integer.parseInt(scanner.nextLine());
            if (currentTry > currentNumber) {
                System.out.println("Загаданное число меньше");
            } else if (currentTry < currentNumber) {
                System.out.println("Загаданное число больше");
            } else {
                win = true;
                break;
            }
        }
        if (win) {
            System.out.println("Вы угадали!");
        } else {
            System.out.println("Вы не угадали! Попытки исчерпаны! Загаданное число - " + currentNumber);
        }
        System.out.println("Повторить игру еще раз? 1 - да, 0 - нет");
        int answer = Integer.parseInt(scanner.nextLine());
        if(answer == 1) {
            playNumberGame();
        }
        scanner.close();
    }

}

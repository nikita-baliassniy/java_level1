import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class GuessWordGame {

    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static final int wordLength = 15;

    public static void main(String[] args) {
        playWordGame();
    }

    private static void playWordGame(){

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        Random random = new Random();
        int currentNumber = random.nextInt(words.length);
        String wordToGuess = words[currentNumber];
        System.out.println("Угадайте загаданное мною слово");

        while (true) {
            String currentString = scanner.nextLine();
            if (currentString.equals(wordToGuess)) {
                System.out.println("Вы угадали!");
                break;
            } else {
                int currentLength = Math.min(wordToGuess.length(), currentString.length());
                for (int i = 0; i < wordLength; i++) {
                    if (i < currentLength &&
                            wordToGuess.charAt(i) == currentString.charAt(i))
                        System.out.print(wordToGuess.charAt(i));
                    else
                        System.out.print('#');
                }
                System.out.println();
            }
        }
        scanner.close();
    }

    private static void printStringArray(String[] array){
        for (String currentString : array) {
            System.out.print(currentString + "  ");
        }
        System.out.println();
    }

}

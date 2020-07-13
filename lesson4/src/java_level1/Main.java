package java_level1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int stepCounter = 0;
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char EMPTY_DOT = '_';
    private static final Random random = new Random();
    private static char[][] map;
    private static Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("Please choose map size");
        int size = scanner.nextInt();
        map = new char[size][size];
        initMap();
    }

    public static void main(String[] args) throws InterruptedException {
        humanTurn();
    }

    private static void humanTurn() throws InterruptedException{
        while (true) {
            System.out.println("Please input dot coordinates in format x y");
            printTab();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            x--;
            y--;

            if (isTurnValid(x, y)) {
                map[x][y] = DOT_X;
                if (isWin(DOT_X)) {
                    printTab();
                    System.out.println("YOU WIN");
                    break;
                }
                stepCounter++;
                if (stepCounter == map.length * map.length) {
                    printTab();
                    System.out.println("NOONE WINS");
                    break;
                }
                aITurnIntelligent(DOT_O);
                stepCounter++;
                if (isWin(DOT_O)) {
                    printTab();
                    System.out.println("AI WINS");
                    break;
                }
            }
        }
        scanner.close();
    }

    private static boolean isWin(char ch) {
        boolean win = false;
        for (int i = 0; i < map.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < map.length; j++) {
                sx += map[i][j] == ch ? 1 : 0;
                sy += map[j][i] == ch ? 1 : 0;
                d1 += map[j][j] == ch ? 1 : 0;
                d2 += map[j][map.length - j - 1] == ch ? 1 : 0;
            }
            if (sx == map.length || sy == map.length || d1 == map.length || d2 == map.length) {
                win = true;
                break;
            }
        }
        return win;
    }

    private static void aITurnIntelligent(char symbol) throws InterruptedException {
        System.out.println("AI TURN");
        for (int i = 0; i < 7; i++) {
            System.out.print(" * ");
            Thread.sleep(250);
        }
        System.out.println();
        putASymbol(findALineForSymbol(symbol), symbol);
    }

    private static int[][] findALineForSymbol(char symbol) {
        int[][] otherSymbols = new int[3][map.length*2 + 2];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] != symbol && map[i][j] != EMPTY_DOT)
                    otherSymbols[0][i]++;
                if (map[j][i] != symbol && map[j][i] != EMPTY_DOT)
                    otherSymbols[0][map.length + i]++;
                else {
                    if (map[i][j] == EMPTY_DOT)
                        otherSymbols[1][i] = 1;
                    if (map[j][i] == EMPTY_DOT)
                        otherSymbols[1][map.length + i] = 1;
                    if (map[i][j] == symbol)
                        otherSymbols[2][i] = 1;
                    if (map[j][i] == symbol)
                        otherSymbols[2][map.length + i] = 1;
                }
            }
            if (map[i][i] != symbol && map[i][i] != EMPTY_DOT)
                otherSymbols[0][map.length * 2]++;
            if (map[i][map.length - i - 1] != symbol && map[i][map.length - i - 1] != EMPTY_DOT) {
                otherSymbols[0][map.length * 2 + 1]++;
            } else {
                if (map[i][i] == EMPTY_DOT)
                    otherSymbols[1][map.length * 2] = 1;
                if (map[i][map.length - i - 1] == EMPTY_DOT)
                    otherSymbols[1][map.length * 2 + 1] = 1;
                if (map[i][i] == symbol)
                    otherSymbols[2][map.length * 2] = 1;
                if (map[i][map.length - i - 1] == symbol)
                    otherSymbols[2][map.length * 2 + 1] = 1;
            }
        }
        return otherSymbols;
    }

    private static int findMaxLine(int[][] symbols, boolean isThereAlreadyCompSymbol){
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < symbols[0].length; i++) {
            if (isThereAlreadyCompSymbol) {
                if (max < symbols[0][i] && symbols[1][i] == 1 && symbols[2][i] != 1) {
                    max = symbols[0][i];
                    maxIndex = i;
                }
            } else {
                if (max < symbols[0][i] && symbols[1][i] == 1) {
                    max = symbols[0][i];
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }

    private static void putASymbol(int[][] symbols, char symbol) {
        int maxIndex = findMaxLine(symbols, true);
        if (maxIndex == -1)
            maxIndex = findMaxLine(symbols, false);
        while (true) {
            int randomIndex = random.nextInt(map.length);
            if (maxIndex < map.length) {
                if (isTurnValid(maxIndex, randomIndex)) {
                    map[maxIndex][randomIndex] = symbol;
                    break;
                }
            } else if (maxIndex < (map.length * 2)) {
                if (isTurnValid(randomIndex, maxIndex % map.length)) {
                    map[randomIndex][maxIndex % map.length] = symbol;
                    break;
                }
            } else if (maxIndex == (map.length * 2)) {
                if (isTurnValid(randomIndex, randomIndex)) {
                    map[randomIndex][randomIndex] = symbol;
                    break;
                }
            } else {
                if (isTurnValid(randomIndex, map.length - randomIndex - 1)) {
                    map[randomIndex][map.length - randomIndex - 1] = symbol;
                    break;
                }
            }
        }
    }

    private static boolean isTurnValid(int x, int y) {
        return x < map.length && y < map.length
                && x >= 0 && y >= 0 && map[x][y] == EMPTY_DOT;
    }

    private static void initMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printTab() {
        System.out.print("   ");
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print("|" + map[i][j]);
            }
            System.out.println("|");
        }
    }

}

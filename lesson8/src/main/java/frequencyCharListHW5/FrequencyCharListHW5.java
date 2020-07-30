package main.java.frequencyCharListHW5;

import java.util.HashMap;

// ДЗ 5. Построение словаря частоты символов по заданному тексту

public class FrequencyCharListHW5 {

    private static HashMap<Character, Integer> charList = new HashMap<>();

    public FrequencyCharListHW5(String textForAnalyze){
        textForAnalyze = textForAnalyze.toLowerCase().replaceAll("\n", "");
        for (int i = 0; i < textForAnalyze.length(); i++) {
            charList.put(textForAnalyze.charAt(i),
                    charList.getOrDefault(textForAnalyze.charAt(i),0) + 1);
        }
    }

    public void printCharList() {
        charList.entrySet().forEach(pair -> {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        });
        System.out.println();
    }
}

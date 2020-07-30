package main.java.frequencyCharListHW5;

public class MainForHW5 {

    private static String englishTextForAnalyze = "People in Great Britain like animals. " +
            "There are even special hospitals, which help wild animals. There are " +
            "a lot of television films about wildlife. They are very popular with " +
            "children and grown ups. A lot of British families have ‘bird tables’ " +
            "in their gardens. Birds can eat from them during the winter months. T" +
            "he ‘bird table’ should be high because cats can eat birds.\n" +
            "The British often think their animals are like people. For example in" +
            " Britain animals can have jobs like people. British Rail has cats and" +
            " pays them for their work. Their job is to catch mice. There is usual" +
            "ly one cat per station. They get food and free medical help. The cats" +
            " don’t catch a lot of mice but they are very popular with the British" +
            " Rail staff and travellers.";

    private static String russianTextForAnalyze = "Мир таков, каков он есть. Трудн" +
            "о предположить, чтобы мир был создан единственно для удовлетворения н" +
            "аших потребностей. Это было бы чудом из чудес. Мир нейтрален. Он не д" +
            "ружествен и не враждебен человеку. Вам внушили, что человек рождается" +
            " для того, чтобы умереть, и что вы должны всю жизнь терзаться этой мы" +
            "слью. Чего ради? Смерть - не факт сознания. “Смысл раздумий о смерти " +
            "в том, что они лишены смысла”, - писал Монтерлан. Смерть близких потр" +
            "ясает нас. А наша собственная? Бояться ее - значит представлять себе " +
            "и мир, где мы есть, и мир, где нас нет. Эти два образа несовместимы. " +
            "    Вам внушили, что мы живем на краю пропасти…, но даже если мы идем" +
            " по краю пропасти, ничто не толкает нас вниз.";

    public static void main(String[] args) {
        FrequencyCharListHW5 frequencyCharListEng = new FrequencyCharListHW5(englishTextForAnalyze);
        frequencyCharListEng.printCharList();

        FrequencyCharListHW5 frequencyCharListRus = new FrequencyCharListHW5(russianTextForAnalyze);
        frequencyCharListRus.printCharList();
    }
}

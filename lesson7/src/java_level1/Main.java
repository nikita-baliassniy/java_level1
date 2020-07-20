package java_level1;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(65);
        plate.info();

        int catsSize = 5;
        Cat[] cats = new Cat[catsSize];
        for (int i = 0; i < catsSize; i++) {
            cats[i] = new Cat("Cat" + (i + 1), i * 5 + 10);
            System.out.println(cats[i]);
            cats[i].eat(plate);
            System.out.println("Cat" + (i + 1) + " is eating..." + '\n');
            System.out.println(cats[i]);
            plate.info();
            System.out.println();
        }
    }
}

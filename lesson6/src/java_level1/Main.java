package java_level1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();

        int size = 5;

        for (int i = 0; i < size; i++) {
            if (i != 0) {
                Dog dog = new Dog(i * 100, i * 0.1, i * 2);
                dogs.add(dog);
                Cat cat = new Cat(i * 50, i * 2);
                cats.add(cat);
            } else {
                Dog dog = new Dog();
                dogs.add(dog);
                Cat cat = new Cat();
                cats.add(cat);
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(dogs.get(i));
            System.out.println(dogs.get(i).run(400));
            System.out.println(dogs.get(i).jump(0.25));
            System.out.println(dogs.get(i).swim(8));
            System.out.println();

            System.out.println(cats.get(i));
            System.out.println(cats.get(i).run(200));
            System.out.println(cats.get(i).jump(1.2));
            System.out.println(cats.get(i).swim(1));
            System.out.println();
        }
    }
}

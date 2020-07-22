package java_level1;

public class Cat {

    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    //Этот вариант по образцу, что Вы показывали на лекции (Кот ест столько, сколько может)
    public void eat(Plate plate) {
        int foodCount = Math.min(appetite, plate.getFood());
        plate.decreaseFood(foodCount);
        appetite -= foodCount;
        if (appetite == 0) {
            fullness = true;
        }
    }

    //Этот вариант для пункта 4 дз (Кот не трогает тарелку, если мало еды)
    public void eatElseType(Plate plate) {
        if (appetite <= plate.getFood()) {
            fullness = true;
            plate.decreaseFood(appetite);
            appetite = 0;
        }
    }

    @Override
    public String toString() {
        return "Cat: " + this.name + '\n'
                + "appetite: " + this.appetite + '\n'
                + "fullness: " + this.fullness + '\n'
                + "______________________" + '\n';
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}

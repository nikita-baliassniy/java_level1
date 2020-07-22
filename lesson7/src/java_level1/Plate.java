package java_level1;

public class Plate {

    private int food;

    public Plate(int food) {
        setFood(food);
    }

    public void info() {
        System.out.println("On plate " + food + " food in quantity");
    }

    public void decreaseFood(int appetite) {
        if (appetite > food) {
            food = 0;
        } else {
            food -= appetite;
        }
    }

    public void increaseFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

}

package java_level1;

public class Dog extends Animal {

    public Dog() {
        super(500, 0.5, 10);
    }

    public Dog(double runLimit, double jumpLimit, double swimLimit) {
        super(runLimit, jumpLimit, swimLimit);
    }

    @Override
    protected String run(double distance) {
        return "Dog " + super.run(distance);
    }

    @Override
    protected String swim(double distance) {
        return "Dog " + super.swim(distance);
    }

    @Override
    protected String jump(double distance) {
        return "Dog " + super.jump(distance);
    }
}
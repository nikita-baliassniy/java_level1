package java_level1;

public class Cat extends Animal {

    public Cat() {
        super(200, 2, 0);
    }

    public Cat(double runLimit, double jumpLimit) {
        super(runLimit, jumpLimit, 0);
    }

    @Override
    protected String run(double distance) {
        return "Cat " + super.run(distance);
    }

    @Override
    protected String swim(double distance) {
        return "Cat swim " + distance + ": " + false;
    }

    @Override
    protected String jump(double distance) {
        return "Cat " + super.jump(distance);
    }
}

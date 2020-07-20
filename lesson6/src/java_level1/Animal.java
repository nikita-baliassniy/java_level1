package java_level1;

public abstract class Animal {

    protected double runLimit;
    protected double swimLimit;
    private double jumpLimit;

    public void setRunLimit(double runLimit) {
        this.runLimit = runLimit;
    }

    public void setSwimLimit(double swimLimit) {
        this.swimLimit = swimLimit;
    }

    public void setJumpLimit(double jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    public Animal(double runLimit, double jumpLimit, double swimLimit) {
        this.setRunLimit(runLimit);
        this.setJumpLimit(jumpLimit);
        this.setSwimLimit(swimLimit);
    }

    protected String run(double distance) {
        return "run " + distance + ": " + (runLimit >= distance);
    }

    protected String swim(double distance) {
        return "swim " + distance + ": " + (swimLimit >= distance);
    }

    protected String jump(double distance) {
        return "jump " + distance + ": " + (jumpLimit >= distance);
    }

    @Override
    public String toString() {
        return "Animal: " + this.getClass().getSimpleName() + '\n' +
                "runLimit: " + this.runLimit + '\n' +
                "jumpLimit: " + this.jumpLimit + '\n' +
                "swimLimit: " + this.swimLimit + '\n' +
                "______________________" + '\n';
    }


}

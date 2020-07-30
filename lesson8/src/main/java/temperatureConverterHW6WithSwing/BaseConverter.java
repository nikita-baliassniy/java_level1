package main.java.temperatureConverterHW6WithSwing;

public class BaseConverter {

    private double kelvinDegrees;
    private double fahrenheitDegrees;
    private double reaumurDegrees;
    private double romerDegrees;
    private double newtonDegrees;
    private double celsiusDegrees;

    public BaseConverter(double celsiusDegrees) {
        this.celsiusDegrees = celsiusDegrees;
        convert();
    }

    private void convert() {
        kelvinDegrees = celsiusDegrees + 273.15;
        fahrenheitDegrees = ((celsiusDegrees * 9) / 5.0) + 32;
        reaumurDegrees = celsiusDegrees * 1.25;
        romerDegrees = ((celsiusDegrees * 21) / 40.0) + 7.5;
        newtonDegrees = (celsiusDegrees * 33) / 100.0;
    }

    @Override
    public String toString() {
        return "Degrees in Kelvin = " + kelvinDegrees + '\n'
                + "Degrees in Fahrenheit = " + fahrenheitDegrees + '\n'
                + "Degrees in Reaumur = " + reaumurDegrees + '\n'
                + "Degrees in Romer = " + romerDegrees + '\n'
                + "Degrees in Newton = " + newtonDegrees;
    }

    public double getKelvinDegrees() {
        return kelvinDegrees;
    }

    public double getFahrenheitDegrees() {
        return fahrenheitDegrees;
    }

    public double getReaumurDegrees() {
        return reaumurDegrees;
    }

    public double getRomerDegrees() {
        return romerDegrees;
    }

    public double getNewtonDegrees() {
        return newtonDegrees;
    }

    public double getCelsiusDegrees() {
        return celsiusDegrees;
    }

}

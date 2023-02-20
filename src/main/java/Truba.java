public class Truba implements Instruments{
    private double diameter;

    public Truba(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Truba is playin: " + getDiameter() + " diameter");
    }
}

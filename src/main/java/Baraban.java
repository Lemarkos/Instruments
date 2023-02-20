public class Baraban implements Instruments{
    private double size;

    public Baraban(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public void play() {
        System.out.println("Baraban is playing: " + getSize() + " sm");
    }
}

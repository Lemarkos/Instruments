public class Main {
    public static void main(String[] args) {
        Instruments[] instruments = {new Baraban(20.5),new Guitar(4), new Truba(5.5)};

        for (Instruments p : instruments){
            p.play();
        }
    }
}

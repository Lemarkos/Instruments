import java.util.logging.SocketHandler;

public class Guitar implements Instruments{
    private int stringQ;

    public Guitar(int stringQ) {
        this.stringQ = stringQ;
    }

    public int getStringQ() {
        return stringQ;
    }

    @Override
    public void play() {
        System.out.println("Guitar is playing with: " + getStringQ() + " strings");
    }
}

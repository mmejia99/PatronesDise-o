import java.io.ByteArrayOutputStream;

public class FlyWithWings implements IFly {

    public FlyWithWings() {

    }

    private ByteArrayOutputStream out;

    @Override
    public void fly() {
        System.out.println("Estoy volando...");
    }
    @Override
    public String toString() {
        return "FlyWithWings{}";
    }
}

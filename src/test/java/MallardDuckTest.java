import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MallardDuckTest {
    private Duck d;
    private ByteArrayOutputStream out;
    public MallardDuckTest(){}

    @Before
    public void before(){
        d= new MallarDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testToString(){
        String esperado = "mallardduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals( esperado, obtenido );
    }

    @Test //se llama anotacion, osea java inyecta independencias automatica para agregar funcionales que desconosco a un metodo
    public void testSwim(){
        d.swim();

        assertTrue(out.toString().toLowerCase().contains("estoy nadando") );

    }

    @Test
    public void testFly(){
        d.fly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando") );
        /*String obtenido = out.toString().toLowerCase();
        String esperado = "estoy volando";

        assertEquals(obtenido, esperado);*/
    }

    @Test
    public void testQuack(){
        d.quack();
        //assertEquals(out.toString().toLowerCase().contains("quack") );
        assertEquals(out.toString(),"quack");
    }

    @Test
    public void testDisplay(){
        d.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato") );
    }
}

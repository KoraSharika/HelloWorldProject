import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testMain() {
        String expectedOutput = "Hello, World!";
        String actualOutput = HelloWorld.getHelloWorldMessage();
        assertEquals(expectedOutput, actualOutput);
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void testGetGreeting() {
        assertEquals("Hello world!", HelloWorld.getGreeting());
    }
} 

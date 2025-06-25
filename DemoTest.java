import static org.junit.Assert.*;
import org.junit.Test;

public class DemoTest {

    @Test
    public void testValidTriangle() {
        // 3 + 4 > 5, 3 + 5 > 4, 4 + 5 > 3 → should return true
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void testInvalidTriangle() {
        // 1 + 2 = 3, which is not greater than 3 → should return false
        assertFalse(Demo.isTriangle(1, 2, 3));
    }
}

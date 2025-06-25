import static org.junit.Assert.*;
import org.junit.Test;

public class DemoTest {

    @Test
    public void testValidTriangles() {
        assertTrue(Demo.isTriangle(3, 4, 5));
        assertTrue(Demo.isTriangle(5, 5, 5));
        assertTrue(Demo.isTriangle(5, 5, 3));
        assertTrue(Demo.isTriangle(2.5, 3.5, 4.0));
    }

    @Test
    public void testInvalidTriangles() {
        assertFalse(Demo.isTriangle(0, 3, 4));
        assertFalse(Demo.isTriangle(-1, 2, 3));
        assertFalse(Demo.isTriangle(1, 2, 3));
        assertFalse(Demo.isTriangle(5, 1, 1));
    }

    @Test
    public void testEdgeCases() {
        assertTrue(Demo.isTriangle(1000000, 1000000, 1000000));
        assertTrue(Demo.isTriangle(5, 4, 8.9));
        assertFalse(Demo.isTriangle(5, 4, 9));
    }
}

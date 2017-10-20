import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class TriangleTest {

    @Test
    public void testConstructor() {

        Triangle t = new Triangle(3,5,7);

        assertTrue(t.getA() == 3);
        assertTrue(t.getB() == 5);
        assertTrue(t.getC() == 7);
    }

    @Test
    public void testIsValid() {

        Triangle t = null;
        t = new Triangle(-3,5,7);
        assertFalse(t.isValid());

        t = new Triangle(3,5, 7);
        assertTrue(t.isValid());
    }



}
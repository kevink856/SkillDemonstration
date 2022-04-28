import static org.junit.Assert.*;
import org.junit.*;

public class TestingClass {
 
    @Test
    public void testCube() {

        assertEquals(63, MyFunction.cube(4));

    }

}
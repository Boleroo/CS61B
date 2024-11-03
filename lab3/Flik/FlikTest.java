import static org.junit.Assert.*;

import org.junit.Test;

public class FlikTest {
    @Test
    public void testSameNumber(){
        int a1 = 1;
        int a2 = 2;
        int b1 = 3;
        int b2 = 3;
        // Error: using type of Integer
        int c1 = 128;
        int c2 = 128;
        assertFalse(Flik.isSameNumber(a1, a2));
        assertTrue(Flik.isSameNumber(b1, b2));
        assertFalse(Flik.isSameNumber(c1, c2));
    }
}

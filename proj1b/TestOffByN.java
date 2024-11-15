import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {
    OffByN offByN = new OffByN(4);

    @Test
    public void testOffByN() {
        assertTrue(offByN.equalChars('a', 'e'));
        assertTrue(offByN.equalChars('e', 'a'));
        assertFalse(offByN.equalChars('b', 'e'));
    }
}

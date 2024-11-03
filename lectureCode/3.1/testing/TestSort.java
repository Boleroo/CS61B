import org.junit.Test;
import static org.junit.Assert.*;
public class TestSort {
    /** Test the Sort.sort method. */
    @Test
    public void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        assertArrayEquals(expected, input);

    }

    /** Test the Sort.findSmallest method. */
    @Test
    public void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};

        int actual = Sort.findSmallest(input,0);
        int expected = 2;
        assertEquals(expected, actual);

        int actual2 = Sort.findSmallest(input,2);
        int expected2 = 2;
        assertEquals(expected2, actual2);
    }

    /** Test the Sort.swap method. */
    @Test
    public void testSwap(){
        String[] input = {"i", "have", "an", "egg"};
        Sort.swap(input, 1,2);
        String[] expected = {"i", "an", "have", "egg"};
        assertArrayEquals(expected, input);
    }
}

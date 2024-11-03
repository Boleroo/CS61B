public class TestSort {
    /** Test the Sort.sort method. */
    public static void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);

    }

    /** Test the Sort.findSmallest method. */
    public static void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};

        int actual = Sort.findSmallest(input,0);
        int expected = 2;
        org.junit.Assert.assertEquals(expected, actual);

        int actual2 = Sort.findSmallest(input,2);
        int expected2 = 2;
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    /** Test the Sort.swap method. */
    public static void testSwap(){
        String[] input = {"i", "have", "an", "egg"};
        Sort.swap(input, 1,2);
        String[] expected = {"i", "an", "have", "egg"};
        org.junit.Assert.assertArrayEquals(expected, input);
    }
    public static void main(String[] args) {
        //testFindSmallest();
        testSort();
    }
}

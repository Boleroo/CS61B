import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindromeCorner() {
        String zeroLength = "";
        assertTrue(palindrome.isPalindromeRecursive(zeroLength));

        String oneLength = "a";
        assertTrue(palindrome.isPalindromeRecursive(oneLength));
    }


    @Test
    public void testIsPalindromeEven() {
        String even = "aabbaa";
        assertTrue(palindrome.isPalindromeRecursive(even));
    }

    @Test
    public void testIsPalindromeOdd() {
        String odd = "aba";
        assertTrue(palindrome.isPalindromeRecursive(odd));
    }

    @Test
    public void testIsPalindromeNot() {
        String s = "abcde";
        assertFalse(palindrome.isPalindromeRecursive(s));
    }

    @Test
    /** Test code for the overloaded isPalindrome(offbyone) method. */
    public void testIsPalindromeOne() {
        /** Odd String. */
        String s1 = "flake";
        CharacterComparator offbyone = new OffByOne();
        assertTrue(palindrome.isPalindrome(s1, offbyone));

        /** Even String. */
        String s2 = "adcb";
        assertTrue(palindrome.isPalindrome(s2, offbyone));

        String s3 = "c&ax%d";
        assertFalse(palindrome.isPalindrome(s3, offbyone));
    }

    @Test
    /** Corner Condition Test for the overloaded isPalindrome(offbyone) method. */
    public void testIsPalindromeOneCorner() {
        CharacterComparator offbyone = new OffByOne();
        String s1 = "a";
        assertTrue(palindrome.isPalindrome(s1, offbyone));

        String s2 = "";
        assertTrue(palindrome.isPalindrome(s2, offbyone));
    }
}

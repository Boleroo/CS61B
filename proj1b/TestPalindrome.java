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
        assertTrue(palindrome.isPalindrome(zeroLength));

        String oneLength = "a";
        assertTrue(palindrome.isPalindrome(oneLength));

        assertFalse(palindrome.isPalindrome(null));
    }


    @Test
    public void testIsPalindromeEven() {
        String even = "aabbaa";
        assertTrue(palindrome.isPalindrome(even));
    }

    @Test
    public void testIsPalindromeOdd() {
        String odd = "aba";
        assertTrue(palindrome.isPalindrome(odd));
    }

    @Test
    public void testIsPalindromeNot() {
        String s = "abcde";
        assertFalse(palindrome.isPalindrome(s));
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

        assertFalse(palindrome.isPalindrome(null, offbyone));
    }

    @Test
    /** Test isPalindrome(offByN). */
    public void testIsPalindromeN() {
        CharacterComparator offbyn = new OffByN(6);
        String s1 = "abcihg";
        assertTrue(palindrome.isPalindrome(s1, offbyn));
        String s2 = "bugs";
        assertFalse(palindrome.isPalindrome(s2, offbyn));
        String s3 = "12587";
        assertTrue(palindrome.isPalindrome(s3, offbyn));
    }

    @Test
    /** Corner Condition test for isPalindrome(offByN). */
    public void testIsPalindromeNCorner() {
        CharacterComparator offbyn = new OffByN(6);
        String s1 = "";
        assertTrue(palindrome.isPalindrome(s1, offbyn));
        String s2 = "1";
        assertTrue(palindrome.isPalindrome(s2, offbyn));
    }
}

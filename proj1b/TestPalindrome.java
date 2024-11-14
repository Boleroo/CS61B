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
    public void testIsPalindromeZeroLength() {
        String zeroLength = "";
        assertTrue(palindrome.isPalindrome(zeroLength));
    }

    @Test
    public void testIsPalindromeOneLength() {
        String oneLength = "a";
        assertTrue(palindrome.isPalindrome(oneLength));
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
}

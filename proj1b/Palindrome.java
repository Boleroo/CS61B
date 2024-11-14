import java.util.LinkedList;

public class Palindrome {
    /** Turn String into Deque. */
    public Deque<Character> wordToDeque(String word) {
        Deque<Character> dq = new LinkedListDeque<>();
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            dq.addLast(c);
        }
        return dq;
    }

    /** Check if the word is a palindrome. */
    public boolean isPalindrome(String word) {
        return true;
    }
}

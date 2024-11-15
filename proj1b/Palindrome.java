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

    /** Check if the word is a palindrome. (Using interation) */
    public boolean isPalindrome(String word) {
        Deque<Character> dq = wordToDeque(word);
        if (dq.isEmpty() || dq.size() == 1) {
            return true;
        }
        while(dq.size() > 1) {
            char first = dq.removeFirst();
            char last = dq.removeLast();
            if(first != last) {
                return false;
            }
        }
        return true;
    }

    /** Check if the word is a palindrome. (Using recursion) */
    public boolean isPalindromeRecursive(String word) {
        Deque<Character> dq = wordToDeque(word);
        return isPalindromeHepler(dq);
    }

    /** Helper method. */
    private boolean isPalindromeHepler(Deque<Character> dq) {
        if (dq.size() <= 1) {
            return true;
        } else if (dq.removeFirst() != dq.removeLast()){
            return false;
        } else {
            return isPalindromeHepler(dq);
        }
    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        return true;
    }
}
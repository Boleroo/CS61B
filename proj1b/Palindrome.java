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
        Deque<Character> dq = wordToDeque(word);
        int size = dq.size();
        int p = 0;
        int q = size - 1;
        while (p < q) {
            if(dq.get(p) != dq.get(q)) {
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}

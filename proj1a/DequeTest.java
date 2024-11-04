import org.junit.Test;

import java.util.Deque;

import static org.junit.Assert.*;
public class DequeTest {
    public static void main(String[] args) {
        LinkedListDeque<Integer> dq = new LinkedListDeque<>();
        dq.addFirst(1);
        dq.removeLast();
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addLast(0);
        dq.removeLast();
        dq.addLast(1);
        dq.addLast(0);
        int res = dq.get(3);
        System.out.println(res);
        dq.printDeque();
    }
}

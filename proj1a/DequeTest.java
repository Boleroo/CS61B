import org.junit.Test;

import java.util.Deque;

import static org.junit.Assert.*;
public class DequeTest {
    public static void main(String[] args) {
        /** Test LinkedListDeque. */
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
        int res1 = dq.getRecursive(3);
        System.out.println(res1);
        dq.printDeque();

        /** Test ArrayDeque. */
        ArrayDeque<Integer> array = new ArrayDeque<>();
        array.addFirst(1);
        array.addFirst(2);
        array.addFirst(3);
        array.addFirst(4);
        array.addFirst(5);
        array.addLast(0);
        array.addLast(-1);
        array.addLast(-2);
        array.addLast(-3);
    }
}

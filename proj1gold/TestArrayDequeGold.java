import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDequeGold {
    @Test
    public void randomizedTest() {
        StudentArrayDeque<Integer> sad = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> ads = new ArrayDequeSolution<>();
        String msg = "";
        while (true) {
            double seed = StdRandom.uniform();
            Integer num = (int) (10 * seed);
            if (seed <= 0.25) {
                sad.addFirst(num);
                ads.addFirst(num);
                Integer actual = sad.get(0);
                Integer expected = ads.get(0);
                msg = msg + "addFirst(" + num + ")\n";
                assertEquals(msg, expected, actual);
            } else if (seed > 0.25 && seed < 0.5) {
                sad.addLast(num);
                ads.addLast(num);
                int actualIndex = sad.size() - 1;
                int expectedIndex = ads.size() - 1;
                Integer actual = sad.get(actualIndex);
                Integer expected = ads.get(expectedIndex);
                msg = msg + "addLast(" + num + ")\n";
                assertEquals(msg, expected, actual);
            } else if (seed >= 0.5 && seed <= 0.75 && !ads.isEmpty()) {
                Integer actual = sad.removeFirst();
                Integer expected = ads.removeFirst();
                msg = msg + "removeFirst()\n";
                assertEquals(msg, expected, actual);
            } else if (seed > 0.75 && !ads.isEmpty()) {
                Integer actual = sad.removeLast();
                Integer expected = ads.removeLast();
                msg = msg + "removeLast()\n";
                assertEquals(msg, expected, actual);
            }
        }
    }
}

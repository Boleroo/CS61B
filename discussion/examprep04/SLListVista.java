import java.util.NoSuchElementException;
public class SLListVista {
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }
    private IntNode first;
    private int size;

    public SLListVista() {
        first = null;
        size = 0;
    }

    public void insertFront(int x) {
        first = new IntNode(x, first);
        size++;
    }

    public int indexOf(int x) {
        IntNode cur = first;
        for (int i = 0; i < size; i++) {
            if(cur.item == x) {
                return i;
            }
            cur = cur.next;
        }
        throw new NoSuchElementException();
    }

    public static void main(String[] args) {
        SLListVista list = new SLListVista();
        list.insertFront(0);
        list.insertFront(2);
        list.insertFront(4);
        System.out.println(list.indexOf(2));
    }
}

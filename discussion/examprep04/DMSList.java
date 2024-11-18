public class DMSList {
    private IntNode sentinel;

    public DMSList() {
        sentinel = new IntNode(-1000, new endNode());
    }

    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode h) {
            item = i;
            next = h;
        }
        public int max() {
            return Math.max(item, next.max());
        }
    }

    public class endNode extends IntNode {
        public endNode() {
            super(0, null);
        }
        @Override
        public int max() {
            return item;
        }
    }

    public void insertFront(int i) {
        sentinel.next = new IntNode(i, sentinel.next);
    }
    public int max() {
        return sentinel.next.max();
    }

    public static void main(String[] args) {
        DMSList list = new DMSList();
        list.insertFront(2);
        list.insertFront(1);
        list.insertFront(3);
        list.insertFront(4);
        System.out.println(list.max());
    }

}

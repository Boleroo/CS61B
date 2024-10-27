public class SLListTest {
    public static void main(String[] args) {
        SLList list = new SLList();
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.print();

        System.out.println();
        list.insert(4,3);
        list.print();

        System.out.println();
        list.reverse();
        list.print();

        System.out.println();
        list.reverseRecursive();
        list.print();

    }
}

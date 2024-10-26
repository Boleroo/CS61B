public class GenAList<item> {
    private item[] items;
    private int size;

    /** Creates an empty list. */
    public GenAList() {
        //Java does not allow to create arrays of generic objects.
        items =(item[]) new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity */
    public void resize(int capacity){
        item[] a =(item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }
    /** Inserts X into the back of the list and resize array. */
    public void addLast(item x) {
        if(size == items.length){
            resize(size+1);
        }
        items[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the list. */
    public item getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public item removeLast() {
        item x = getLast();
        size = size - 1;
        return x;
    }
}
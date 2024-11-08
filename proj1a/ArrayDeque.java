public class ArrayDeque<T> {
    private T[] array;
    private int size;
    private int nextFirst;
    private int nextLast;
    private final int usglen = 16;
    /** Create an empty array deque. */
    public ArrayDeque() {
        array = (T[]) new Object[8];
        size = 0;
        nextFirst = 0;
        nextLast = 1;
    }

    /** Resize method. */
    private void resize(int newLen) {
        T[] newArray = (T[]) new Object[newLen];
        int cur = (nextFirst + 1) % array.length;
        for (int i = 0; i < size; i++) {
            cur = (cur + 1) % array.length;
            newArray[i] = array[cur];
        }
        array = newArray;
        nextFirst = newArray.length - 1;
        nextLast = size;
    }

    /** Add item to head of the array. */
    public void addFirst(T item) {
        if (size == array.length) {
            resize(array, array.length * 2);
        }
        array[nextFirst] = item;
        nextFirst = (array.length + nextFirst - 1) % array.length;
        size++;
    }

    /** Add item to back of the array. */
    public void addLast(T item) {
        if (size == array.length) {
            resize(array, array.length * 2);
        }
        array[nextLast] = item;
        nextLast = (nextLast + 1) % array.length;
        size++;
    }

    /** Check if is empty. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Return number of items. */
    public int size() {
        return size;
    }

    /** Print items in the deque. */
    public void printDeque() {
        int len = array.length;
        int cur = nextFirst;
        for (int i = 1; i <= size; i++) {
            cur = (cur + 1) % len;
            System.out.println(array[cur] + " ");
        }
    }

    /** Removes and returns the 1st item. */
    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        int len = array.length;
        int removeIndex = (nextFirst + 1) % len;
        T res = array[removeIndex];
        array[removeIndex] = null;
        double usage = (size - 1) / (double) len;
        if (len >= usglen && usage < 0.25) {
            resize(array, len / 2);
        }
        nextFirst = (nextFirst + 1) % len;
        size--;
        return res;
    }

    /** Removes and returns the last item. */
    public T removeLast() {
        if (size == 0) {
            return null;
        }
        int len = array.length;
        int removeIndex = (nextLast - 1 + len) % len;
        T res = array[removeIndex];
        array[removeIndex] = null;
        nextLast = (nextLast - 1 + len) % len;
        size--;
        double usage = size / (double) len;
        if (len >= usglen && usage < 0.25) {
            resize(array, len / 2);
        }
        return res;
    }

    /** Return ith item, starts from 0. */
    public T get(int index) {
        if (index >= size) {
            return null;
        }
        return array[(nextFirst + index + 1) % array.length];
    }
}

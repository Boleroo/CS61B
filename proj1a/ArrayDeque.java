public class ArrayDeque<T> {
    T[] array;
    int size;
    int nextFirst;
    int nextLast;
    final int usglen = 16;
    /** Create an empty array deque. */
    public ArrayDeque() {
        array = (T[]) new Object[3];
        size = 0;
        nextFirst = 0;
        nextLast = 1;
    }

    /** Resize method. */
    private void resize(T[] oldArray, int newLen) {
        int len = oldArray.length;
        T[] newArray = (T[]) new Object[newLen];
        int cur = nextFirst;
        for (int i = 0; i < len; i++) {
            cur = (cur + 1 + len) % len;
            newArray[i] = oldArray[cur];
        }
        this.array = newArray;
        nextFirst = newArray.length - 1;
        nextLast = len;
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
        nextFirst = (nextFirst + 1) % len;
        size--;
        double usage = size / (double) len;
        if (len >= usglen && usage < 0.25) {
            resize(array, len / 2);
        }
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
        return array[nextFirst + index + 1];
    }
}

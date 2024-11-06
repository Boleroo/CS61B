public class ArrayDeque<T> {
    T[] array;
    int size;
    int nextFirst;
    int nextLast;

    /** Create an empty array deque. */
    public ArrayDeque(){
        array = (T[]) new Object[3];
        size = 0;
        nextFirst = 0;
        nextLast = 1;
    }

    /** Resize method. */
    private void resize(T[] array) {
        int len = array.length;
        T[] newArray = (T[]) new Object[len * 2];
        int cur = nextFirst;
        for (int i = 0; i < len; i++) {
            cur = (cur + 1 + len) % len;
            newArray[i] = array[cur];
        }
        this.array = newArray;
        nextFirst = newArray.length - 1;
        nextLast = len - 1;
    }

    /** Add item to head of the array. */
    public void addFirst(T item){
        if(size == array.length){
            resize(array);
        }
        array[nextFirst] = item;
        nextFirst = (array.length + nextFirst -1)%array.length;
        size++;
    }
}

package Map61B;

import org.hamcrest.internal.ArrayIterator;
import org.junit.Test;


import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * An array based implementation of the Map61B class.
 */
public class  ArrayMap<K, V> implements Map61B<K, V>, Iterable<K>{
    private K[] keys;
    private V[] values;
    int size;

    public ArrayMap() {
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    public Iterator<K> iterator() {
        return new KeyIterator();
    }

    public class KeyIterator implements Iterator<K>{
        private int wizardPosition;

        public KeyIterator() {
            wizardPosition = 0;
        }

        public boolean hasNext() {
            return wizardPosition < size;
        }
        public K next() {
            K res = keys[wizardPosition];
            wizardPosition++;
            return res;
        }
    }

    /** Returns the index of the given key if it exists, -1 otherwise. */
    private int keyIndex(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public boolean containsKey(K key) {
        int index = keyIndex(key);
        return index > -1;
    }

    public void put(K key, V value) {
        int index = keyIndex(key);
        if (index == -1) {
            keys[size] = key;
            values[size] = value;
            size++;
        } else {
            values[index] = value;
        }
    }

    public V get(K key) {
        int index = keyIndex(key);
        if (index == -1) {
            throw new IllegalArgumentException("The key provided " + key + "was not in the ArrayMap");
        }
        return values[index];
    }

    public int size() {
        return size;
    }

    public List<K> keys() {
        List<K> keylist = new ArrayList<K>();
        for (int i = 0; i < size; i++) {
            keylist.add(keys[i]);
        }
        return keylist;
    }

    @Test
    public void test() {
        ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
        am.put(2, 5);
        int expected = 5;
        assertEquals((Integer) expected, am.get(2));
    }

    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
    }
}
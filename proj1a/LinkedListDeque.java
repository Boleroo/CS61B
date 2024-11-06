public class LinkedListDeque<T> {
    private class Node<T>{
        T item;
        Node<T> next;
        Node<T> prev;

        private Node(T item){
            this.item = item;
        }
    }

    int size;
    Node<T> sentinel;

    /** Creates an empty deque. */
    public LinkedListDeque(){
        sentinel = null;
        size = 0;
    }
    /** Adds an item T to the front of the queue. */
    public void addFirst(T item){
        if(size == 0){
            sentinel = new Node<>(item);
            Node<T> first = new Node<>(item);
            first.next = sentinel;
            first.prev = sentinel;
            sentinel.next = first;
            sentinel.prev = first;
        }
        else{
            Node<T> newNode = new Node<>(item);
            newNode.next = sentinel.next;
            newNode.prev = sentinel;
            sentinel.next.prev = newNode;
            sentinel.next = newNode;
        }
        size++;
    }

    /** Adds an item T to the back of the queue. */
    public void addLast(T item){
        if(size == 0){
            sentinel = new Node<>(item);
            Node<T> first = new Node<>(item);
            first.next = sentinel;
            first.prev = sentinel;
            sentinel.next = first;
            sentinel.prev = first;
        }
        else{
            Node<T> newNode = new Node<>(item);
            newNode.next = sentinel;
            newNode.prev = sentinel.prev;
            sentinel.prev.next = newNode;
            sentinel.prev = newNode;
        }
        size++;
    }

    /** Check if is empty. */
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        return false;
    }

    /** Get size of the list. */
    public int size(){
        return size;
    }

    /** Print items, separated by a space. */
    public void printDeque(){
        Node<T> cur = sentinel.next;
        for(int i = 1;i<=size; i++){
            System.out.print(cur.item + " ");
            cur = cur.next;
        }
    }

    /** Removes and returns the item at the front of the queue. */
    public T removeFirst(){
        if(size == 0){
            return null;
        }
        T res = sentinel.next.item;
        Node<T> newHead = sentinel.next.next;
        Node<T> removed = sentinel.next;
        removed.next = null;
        removed.prev = null;
        sentinel.next = newHead;
        newHead.prev = sentinel;
        size--;
        return res;
    }

    /** Removes and returns the last item. */
    public T removeLast(){
        if(size == 0){
            return null;
        }
        T res = sentinel.prev.item;
        Node<T> removed = sentinel.prev;
        Node<T> newRear = sentinel.prev.prev;
        removed.prev = null;
        removed.next = null;
        sentinel.prev = newRear;
        newRear.next = sentinel;
        size--;
        return res;
    }

    /** Gets ith item, starts from index 0. */
    public T get(int index){
        if(size == 0){
            return null;
        }
        Node<T> cur = sentinel.next;
        for(int i = 0; i<index; i++){
            cur = cur.next;
        }
        return cur.item;
    }

    /** Get ith item, using recursion. */
    public T getRecursive(int index){
        return getRecursive(sentinel.next, index);
    }

    /** A helper method. */
    private T getRecursive(Node<T> node, int index){
        if(index == 0){
            return node.item;
        }
        return getRecursive(node.next, index-1);
    }
}

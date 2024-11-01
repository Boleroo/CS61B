public class SLList {
    private class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int item, IntNode next){
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;

    public void addFirst(int x){
        first = new IntNode(x, first);
    }

    /** Insert item into position(starts from 0). */
    public void insert(int item, int position){
        if(position == 0){
            addFirst(item);
        }
        else{
            IntNode prev = first;
            for(int i =0 ; i<position-1;i++){
                prev = prev.next;
            }
            IntNode cur = prev.next;
            IntNode in = new IntNode(item, cur);
            prev.next = in;
        }
    }

    /** Reverse existing SLList. */
    public void reverse(){
        if(first.next != null){
            IntNode cur = first.next;
            first.next = null;
            while(cur !=null){
                addFirst(cur.item);
                cur = cur.next;
            }
        }
    }

    /** A helper method. */
    private static IntNode reverse(IntNode first){
//        if(first.next == null){
//            return first;
//        }
//        IntNode newNode = reverse(first.next);
//        first.next = null;
//        IntNode cur = newNode;
//        while(cur.next != null){
//            cur = cur.next;
//        }
//        cur.next = first;
//        return newNode;

        /** A better recusive helper: */
        if(first == null || first.next == null){
            return first;
        }
        else{
            IntNode reserved = reverse(first.next);
            first.next.next = first;
            first.next = null;
            return reserved;
        }
    }

    /** Recursively reverse the existing SLList. */
    public void reverseRecursive(){
        first = reverse(first);
    }

    /** Print SLList. */
    public void print(){
        IntNode cur = first;
        while(cur!= null){
            System.out.print(cur.item + " ");
            cur = cur.next;
        }
    }
}

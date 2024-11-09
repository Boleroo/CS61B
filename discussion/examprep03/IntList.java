public class IntList {
    public int first;
    public IntList rest;

    public IntList(int x, IntList next) {
        first = x;
        rest = next;
    }

    public void skippify(){
        IntList p = this;
        int n = 1;
        while (p != null) {
            IntList next = p.rest;
            for (int i = 1; i < n; i++) {
                if (next == null) {
                    return;
                }
                next = next.rest;
            }
            n++;
            p.rest = next.rest;
            next.rest = null;
            p = p.rest;
        }
    }

    public static void removeDuplicates(IntList p){
        if(p == null){
            return;
        }
        IntList current = p.rest;
        IntList previous = p;
        while(current != null) {
            if(current.first == previous.first) {
                previous.rest = current.rest;
            } else {
                previous = previous.rest;
            }
            current = previous.rest;
        }
    }

    public static void main(String[] args) {
        IntList A = new IntList(4, null);
        A = new IntList(4, A);
        A = new IntList(4, A);
        A = new IntList(3, A);
        A = new IntList(3, A);
        A = new IntList(2, A);
        A = new IntList(2, A);
        A = new IntList(2, A);
        A = new IntList(1, A);
        A = new IntList(1, A);
        removeDuplicates(A);
    }
}

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

    public static void main(String[] args) {
        IntList A = new IntList(10, null);
        A = new IntList(9, A);
        A = new IntList(8, A);
        A = new IntList(7, A);
        A = new IntList(6, A);
        A = new IntList(5, A);
        A = new IntList(4, A);
        A = new IntList(3, A);
        A = new IntList(2, A);
        A = new IntList(1, A);
        A.skippify();
    }
}

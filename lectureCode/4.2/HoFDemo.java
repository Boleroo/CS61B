/** Demonstrates higher order functions. */
public class HoFDemo {
    public static int do_twice(IntUnaryFunctions f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        IntUnaryFunctions tenX = new TenX();
        int x = 2;
        System.out.println(do_twice(tenX, x));
    }
}

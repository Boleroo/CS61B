package Map61B;

public class ExceptionDemo {
    public static void main(String[] args) {
        ArrayMap<String, Integer> am = new ArrayMap<String, Integer>();
        am.put("hello", 5);
        System.out.println(am.get("yep"));
    }
}

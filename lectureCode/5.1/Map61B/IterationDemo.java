package Map61B;

public class IterationDemo {
    public static void main(String[] args) {
        ArrayMap<String, Integer> am = new ArrayMap<String, Integer>();
        am.put("hello", 5);
        am.put("syrups", 10);
        am.put("kingdom", 10);

        for (String s: am) {
            System.out.println(s);
        }

    }
}

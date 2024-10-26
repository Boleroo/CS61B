public class SpeedTestAList {
    public static void main(String[] args) {
        AList L = new AList();
        int i = 0;
        while (i < 1000) {
            L.addLast(i);
            i = i + 1;
        }
    }
}
public class Flatten {
    /** Concatenate 2D arrays into 1D array. */
    public static int[] flatten(int[][] x) {
        int totalLength = 0;
        for (int[] cur : x) {
            totalLength += cur.length;
        }
        int[] a = new int[totalLength];
        int aIndex = 0;
        for (int[] cur : x) {
            for (int i : cur) {
                a[aIndex] = i;
                aIndex++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {}, {7, 8}};
        int[] result = flatten(array);
        for (int x: result) {
            System.out.print(x + " ");
        }
    }
}

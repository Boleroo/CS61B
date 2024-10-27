public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int[] newArr = Arrays.insert(arr, 6, 5);
        int[] arr1 = {3,2,1};
        Arrays.print(newArr);
        System.out.println();
        Arrays.reverse(newArr);
        System.out.println();
        Arrays.print(newArr);
        System.out.println();
        Arrays.print(Arrays.replicate(arr1));



    }
}

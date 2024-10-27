public class Arrays {
    /** Insert item into array and changes array in place. */
    public static int[] insert(int[] arr, int item, int position){
        int[] newArr = new int[arr.length +1];
        System.arraycopy(arr, 0,newArr,0,position);
        newArr[position] = item;
        System.arraycopy(arr, position, newArr, position+1, arr.length-position);
        return newArr;
    }

    /** Reverse items in arr. */
    public static void reverse(int[] arr){
        int len = arr.length;
        int p = 0;
        int q = len-1;
        while(p<q){
            int tmp = arr[p];
            arr[p] = arr[q];
            arr[q] = tmp;
            p++;
            q--;
        }
    }

    /** Replicate the array by replacing the i-th number arr[i] times */
    public static int[] replicate(int[] arr){
        int num = 0;
        for(int i = 0; i<arr.length; i++){
            num += arr[i];
        }
        int[] newArr = new int[num];
        int cur = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 1;j<=arr[i];j++){
                newArr[cur] = arr[i];
                cur++;
            }
        }
        return newArr;
    }

    /** Print items in arrays. */
    public static void print(int[] arr){
        for(int item: arr){
            System.out.print(item+" ");
        }
    }
}

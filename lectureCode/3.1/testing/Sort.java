public class Sort {
    /** Use selection sort(1st version). */
    public static void sort1(String[] x){
        for(int i = 0;i<x.length;i++){
            int indexOfMin = i;
            for(int j = i+1;j<x.length;j++){
                char min = x[indexOfMin].charAt(0);
                char cur = x[j].charAt(0);
                if(min>cur){
                    indexOfMin = j;
                }
            }
            String tmp = x[i];
            x[i] = x[indexOfMin];
            x[indexOfMin] = tmp;
        }
    }

    public static void sort(String[] x){
        // Find smallest item.
        // Move to the front.
        // Selection sort the rest.
        sort(0,x);

    }

    /** Sorts x starting at position start */
    private static void sort(int startIndex, String[] x){
        if(startIndex>x.length-1){
            return;
        }
        int smallestIndex = findSmallest(x, startIndex);
        swap(x, startIndex, smallestIndex);
        sort(startIndex+1, x);
    }

    /** Return index of the smallest String in x. */
    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for(int i = start;i<x.length;i++){
            int cmp = x[i].compareTo(x[smallestIndex]);
            if(cmp<0){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /** Swap item a with b. */
    public static void swap(String[] x, int a, int b){
        String tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }
}

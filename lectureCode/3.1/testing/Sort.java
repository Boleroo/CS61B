public class Sort {
    /** Use selection sort. */
    public static void sort(String[] x){
        // Find smallest item.
        // Move to the front.
        // Selection sort the rest.
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
}

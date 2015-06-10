import java.util.*;

/**
 * Created by Nazli on 2015-06-08.
 */
public class QuickSort {
    ArrayList<Integer> myQuickArray = new ArrayList<Integer>();
    int pivot;

    public void swapValue(int first, int second){

    }
    public QuickSort(int[] input, int i, int r) {

    }

    /**
     * using last element as pivot creates mixture of good and and
     * bad splits at the same time which will be run at O(nlgn)
     */
    public void partitioning(int[] input , int begin, int end){
        int j = 1; //j traverses from right to left
        Random random = new Random();
        // pivot is chosen randomly therefore it is balanced partitioning
        //Faster O(n)
        int r = random.nextInt(input.length);
        int p = 0;
        int i = p-1; //i is traversing from left to right
        int pivotValue = input[r];
        while (i < j){
            if (input[p] > pivotValue){
                i++;
                swapValue(input[i], input[j]);
            }
            j++;

        }

    }
    public QuickSort(ArrayList<Integer> input,  int initial, int last){
        partitioning(input, initial, last,);
        Collections.addAll(Arrays.asList(input));


    }
}

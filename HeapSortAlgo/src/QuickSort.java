import java.util.*;

/**
 * Created by Nazli on 2015-06-08.
 */
public class QuickSort {
    ArrayList<Integer> myQuickArray = new ArrayList<Integer>();
//    int pivot;

    public void swapValue(int first, int second){

    }
    public QuickSort(ArrayList<Integer> input, int i, int r) {

    }

    /**
     * using last element as pivot creates mixture of good and and
     * bad splits at the same time which will be run at O(nlgn)
     */
    public int partitioning(int begin, int end){
//        Random random = new Random();
        // pivot is chosen randomly therefore it is balanced partitioning
        //Faster O(n)
//        int r = random.nextInt(myQuickArray.size());
        int r = end;
        int p = begin;
        int j; //righ-hand side of splitter
        int i = p-1; //i left-hand side of splitter
        int pivotValue = myQuickArray.get(r);
        for (j = 0; j<end -1; j++){
            if (myQuickArray.get(j) < pivotValue){
                swapValue(myQuickArray.get(++i), myQuickArray.get(j));
            }
        }
        swapValue(myQuickArray.get(i+1), pivotValue);
        return i+1;
    }
    public QuickSort(int[] input,  int initial, int last){
        for (int itr : input){
            myQuickArray.add(itr, input[itr]);
        }
        int pivotIndex = partitioning(initial, last);
//        Collections.addAll(Arrays.asList(input));
        new QuickSort(input, initial, pivotIndex);
        new QuickSort(input, pivotIndex, last);

    }
}

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Nazli on 2015-07-02.
 */
public class Quick {
    ArrayList<Integer> myQuickArray = new ArrayList<Integer>();
    public Quick (int[] input){
        for (Integer value : input){
            myQuickArray.add(value);
        }
    }

    //hoarePartition
    private int hoarePartition(int begin, int end){
        int left = begin;
        int right = end-1;
        Integer pivot = myQuickArray.get(end);
        while (begin < end){
            while (myQuickArray.get(left) < pivot){
                left++;
            }
            while (myQuickArray.get(right) > pivot){
                right--;
            }
            Collections.swap(myQuickArray, left, right);
        }
        return right;
    }
    //QuickSort
    public void quickSort (int initial, int last){
        int pIndex = hoarePartition(initial, last);
        while (initial <= pIndex){
            quickSort(initial, pIndex-1);
            quickSort(pIndex, last);
        }
    }
}

/**
 * Created by Nazli on 2015-06-08.
 */
/**
 * Splitter is between i and j
 * Which at the end of algorithm splitter is at right-hand side of pivot
 * All  values at left-hand side of splitter have less value than pivot
 * Right-hand side, all are greater vlaues
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quick {
    ArrayList<Integer> myQuickArray = new ArrayList<Integer>();
    private void swapValue(int source, int destination){
        Collections.swap(myQuickArray, source, destination);
    }

//Recursion Hoar QuickSort Algorithm --- In-place
    public int hoarPartition(int initial, int end) {
        int left = initial - 1;
        int right = end-1;
//        int mid = (end = initial)/2;
        int pivot = myQuickArray.get(end);
        if (left < right) {
            while (myQuickArray.get(left + 1) <= pivot) {
                left++;
            }
            while (myQuickArray.get(right) > pivot) {
                right--;
            }
        }
        else if (left == right) {
            Collections.swap(myQuickArray, left, end);
        }
        return right;
    }
    public void recurseHoarQuick(int begin, int end){
        int pIndex = hoarPartition(begin, end);
        recurseHoarQuick(begin, pIndex);
        recurseHoarQuick(pIndex+1, end);
    }
    public Quick(int[] input){
        for (int itr : input){
            myQuickArray.add(itr);
        }
        recurseHoarQuick(0, myQuickArray.size()- 1); //switch input.length to myQuickArray.size
//     Arrays.asList(myQuickArray);
    }
}

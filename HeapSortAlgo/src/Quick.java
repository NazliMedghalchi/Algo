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
    public Quick(int[] input){
        for (Integer itr : input){
            myQuickArray.add(itr);
        }
        recurseHoarQuick(0, myQuickArray.size() - 1); //switch input.length to myQuickArray.size
        Arrays.asList(myQuickArray);
    }
//Recursion Hoar QuickSort Algorithm --- In-place
    public int hoarPartition(int initial, int end) {
        int left = initial-1;
        int right = end;
        int pivot = myQuickArray.get(end);
        while (left <= right){
            do {
                left++;
            }while ((myQuickArray.get(left) < pivot));
            do{
                right--;
            }while (myQuickArray.get(right) >= pivot);
            if (left < right){
                Collections.swap(myQuickArray, left, right);
            }
        }
        System.out.println("PARTITONED!!");
        return right;
    }
    public void recurseHoarQuick(int begin, int end){
        int pIndex = hoarPartition(begin, end);
        if (begin <= pIndex -1){
            recurseHoarQuick(begin, pIndex);
        }
        if (end > pIndex) {
            recurseHoarQuick(pIndex+1, end);
        }
    }

}

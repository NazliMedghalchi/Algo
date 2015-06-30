/**
 * Created by Nazli on 2015-06-08.
 */
/**
 * Splitter is between i and j (left and right)
 * Which at the end of algorithm splitter is at right-hand side of pivot
 * All  values at left-hand side of splitter have less value than pivot
 * Right-hand side, all are greater vlaues
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Quick {
    ArrayList<Integer> myQuickArray = new ArrayList<Integer>();
    public Quick(int[] input){
        for (Integer itr : input){
            myQuickArray.add(itr);
        }
    }
    private void swapValue (int src, int des){
        int temp;
        temp = myQuickArray.get(src);
        myQuickArray.set(src, myQuickArray.get(des));
        myQuickArray.set(des, temp);
    }
//Recursion Hoar QuickSort Algorithm --- In-place
    private int hoarPartition(int initial, int end) {
        int left = initial-1;
        int right = +1;
//        Random rand = new Random();
//        int pIndex  = rand.nextInt((end - initial)+1) + initial;
        Integer pivot = myQuickArray.get(end);
        while (left <= right){
            while (myQuickArray.get(left) < pivot) {
                left++;
            }
            if (myQuickArray.get(right) > pivot){
                right--;
            }
            if (left <= right){
                Collections.swap(myQuickArray, left, right);
//                swapValue(left, right);
                left++;
                right--;
            }
        }
        System.out.println("PARTITONED!!");
        return left;
    }
    //recurseHoarQuick
    public void quickSort(int begin, int end){
        int pIndex = hoarPartition(begin, end);
        if (begin < end){
            quickSort(begin, pIndex);
            quickSort(pIndex+1, end);
        }
        System.out.println(Arrays.asList(myQuickArray));
    }
}

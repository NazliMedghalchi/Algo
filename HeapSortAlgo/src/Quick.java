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
//    int pivot;

//    private void swapValue(int source, int destination){
////        int temp = source;
//        Collections.swap(myQuickArray, source, destination);
////        myQuickArray.set(source, myQuickArray.get(destination));
////        myQuickArray.set(destination, myQuickArray.get(source));
//    }

    private int partitioning(int begin, int end){
//     pivot is chosen randomly therefore it is balanced partitioning
//        Random random = new Random();
//        Faster O(n)
//        int r = random.nextInt(myQuickArray.size());
        int j; //right-hand side of splitter
        int i = begin-1; //i left-hand side of splitter
        int pivotValue = myQuickArray.get(end); //Take last element as pivot
        for (j = begin; j<end ; j++){ //Travers array till find the right position for pivot
            if (myQuickArray.get(j) <= pivotValue){
                Collections.swap(myQuickArray, ++i, j);
            }
        }
        myQuickArray.set(++i, pivotValue);
        return i;
    }

//    public void QuickSort(int initial, int last) {
//        if (initial < last) {
//            int pivotIndex = partitioning(initial, last);
//            QuickSort(initial, pivotIndex-1);
//            QuickSort(pivotIndex, last);
//        }
//    }

//Recursion Hoar QuickSort Algorithm --- In-place
    public int hoarPartition(int initial, int end){
        int left = initial-1;
        int right = end +1;
        Integer pivot = myQuickArray.get(initial);
        if (myQuickArray.get(left) < pivot ){
            left++;
        }
        if (myQuickArray.get(right) >= pivot){
            right--;
        }
        if (left < right){
            Collections.swap(myQuickArray, left , right);
        }
        return right;
    }

    public void recurseHoareQuick(int begin, int end){
        Integer pivot = hoarPartition(begin, end);
        if (pivot -1 > begin){
            recurseHoareQuick(begin, pivot - 1);
        }
        else if (pivot < end){
            recurseHoareQuick(pivot, end);
        }
    }
    public Quick(int[] input){
        for (int itr : input){
            myQuickArray.add(itr);
        }
        Arrays.asList(myQuickArray);
    }
}

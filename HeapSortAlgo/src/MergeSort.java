import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.lang.Comparable;
import java.lang.*;
/**
 * Created by Nazli on 2015-07-05.
 */
/**
 * MergeSort:
 * Use an auxiliray array to merge elements
 * Divide the main array into two
 * Continue till there are two elements to be compared
 * Merge all smaller arrays into main array
 * */
public class mergeSort {
    private ArrayList<Integer> mergeArray = new ArrayList<>();
    private ArrayList<Integer> aux = new ArrayList<>();

    public mergeSort(Integer[] input){
        for (int value: input){
            mergeArray.add(value);
        }
        for (int val : input)
            aux.add(val);

    }
/*
    private static <T extends Comparable>  boolean  isSorted (T[] array, int f, int l){
        for (int i=f; i < l; i++){
            if (array[i].compareTo(array[i+1]) > 0)
                return false;
        }
        return true;
    }
    private static <T extends Comparable> void merge (T[] aux, T[] mergeArrays, int first, int mid, int last){
        assert  isSorted(mergeArrays, first, mid); //Check if left side sorted
        assert isSorted (mergeArrays, mid+1, last); //Check if right part is sorted
        int i = first; // left division iterator
        int j = mid+1; // right division iterator
        int k = first; // main mergeArray iterator
        while (i < mid && j < last){
            if (aux[i].compareTo(aux[j]) < 0 ){
                mergeArrays[k++] = aux[i++];
            }
            else
                mergeArrays[k++] = aux[j++];
        }
        while (i > mid && j < last)
            mergeArrays[k++] = aux[j++];
        while (j > last && i < mid)
            mergeArrays[k++] = aux[i++];
    }
*/

    //Divide and conquer
    private void merge(int first,int middle, int last){
        int left_itr = first;
        int right_itr = middle+1;
        int merge_itr  = first;
        while(left_itr <= middle && right_itr <= last){
            if (aux.get(left_itr) <= aux.get(right_itr)) {
                mergeArray.set(merge_itr++, aux.get(left_itr++));
                right_itr++;
            }
            else {
                mergeArray.set(merge_itr++, aux.get(right_itr++));
                left_itr++;
            }
        }
        while ( (left_itr > middle) && (right_itr <= last)){
            mergeArray.set(merge_itr++, aux.get(left_itr++));
        }
        //copy remained element of left half
        while ((right_itr > last) && (left_itr < middle)) {
            mergeArray.set(merge_itr++, aux.get(right_itr++));
        }
    }
    public void display(){
        System.out.println("MergeSort:" + mergeArray.toString());
    }

    // Top-down mergeSort
    public void sortTD(int begin , int end){
        int mid = (end + begin)/2;
        if (begin < end){
            sortTD(begin, mid);
            sortTD(mid + 1, end);
            merge(begin, mid, end);
//            merge(aux, mergeArray, begin, end);
        }
    }
}

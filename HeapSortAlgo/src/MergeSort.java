import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.lang.Comparable;

/**
 * Created by Nazli on 2015-07-05.
 */
public class mergeSort {
    private ArrayList<Integer> mergeArray = new ArrayList<Integer>();

    public mergeSort(int[] input){
        for (int value: input){
            mergeArray.add(value);
        }
    }
    private static <T extends Comparable>  boolean  isSorted (T[] array, int f, int l){
        for (int i=f; i < l; i++){
            if (array[i].compareTo(array[i+1]) > 0)
                return false;
        }
        return true;
    }
    private static <T extends Comparable> void merge (T[] aux, T[] mergeArrays, int first, int mid, int last){
        assert  isSorted(mergeArrays, first, mid): true; //Check if left side sorted
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
    //Divide and conquer
    private void merge(int first,int middle, int last){
        int i = first;
        int j = middle+1;
        int k  = first;
        ArrayList<Integer> aux = new ArrayList<Integer>();
        for (int val : mergeArray)
            aux.add(val);

        while(i < middle && j < last){
            if (aux.get(i) <= aux.get(j)) {
                mergeArray.set(k++, aux.get(i++));
            }
            else {
                mergeArray.set(k++, aux.get(j++));
            }

        }
        if (i > middle && j < last) {
            mergeArray.set(k++, aux.get(j++));
        }
        if (j > last && i < middle){
            mergeArray.set(k++, aux.get(i++));
        }

    }
    public void display(){

        System.out.println("MergeSort:" + mergeArray.toString());
    }
    // Top-down mergeSort
    public void sortTD(int begin , int end){
        if (begin < end){
            int mid = (begin + end)/2;
            sortTD(begin, mid);
            sortTD(mid + 1, end);
            merge(begin, mid, end);
            mergeSort.<int> merge(mergeArray, mergeArray, begin, end);
        }
    }

}

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
        while(i > middle && j < last) {
            mergeArray.set(k++, aux.get(j++));
        }
        while (j > last && i < middle){
            mergeArray.set(k++, aux.get(i++));
        }
    }
    public void display(){

        System.out.print("MergeSort:" + mergeArray.toString());
    }
    // Top-down mergeSort
    public void sortTD(int begin , int end){
        if (begin < end){
            int mid = (begin + end)/2;
            sortTD(begin, mid);
            sortTD(mid + 1, end);
            merge(begin, mid, end);
        }
    }

}

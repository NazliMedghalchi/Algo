import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Nazli on 2015-07-05.
 */
public class MergeSort<T> {
    private ArrayList<T> mergeArray = new ArrayList<T>();
    private ArrayList<T> aux = new ArrayList<T>();

    public MergeSort(T [] input){
        for (T value: input)
            mergeArray.add(value);
    }
    private void copyAux(){
        for (T val : mergeArray) {
            aux.add(val);
        }
    }
    private void merge(int first, int last){
        int i = first;
        int mid = (first + last)/2;
        int j = mid+1;
        int k  = first;
        copyAux();
        while(i <= j && j <= last){
            if (aux.get(i) >= aux.get(j)) {
                mergeArray.set(k++, aux.get(i++));
            }
            else {
                mergeArray.set(k++, aux.get(j++));
            }
        }
        while(i >= mid) {
            mergeArray.set(k++, aux.get(j++));
        }
        while (j > last){
            mergeArray.set(k++, aux.get(i++));
        }
    }
    public void sortTD(int begin , int end){
        while (begin <= end){
            int mid = (begin + end)/2;
            sortTD(begin, mid - 1);
            sortTD(mid + 1, end);
            merge(begin, end);
        }
    }

}

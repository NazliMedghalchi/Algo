import java.util.ArrayList;
import java.util.Arrays;
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
        int left = begin-1;
        int right = end+1;
        Integer pivot = myQuickArray.get(end);
            while (true){
                do {
                    left++;
                }while (myQuickArray.get(left) < pivot);
                do{
                    right--;
                }while (myQuickArray.get(right) > pivot);
                if (left < right)
                    Collections.swap(myQuickArray, left, right);
                else
                    return right;
            }
    }
    public void display (){
            for (Integer element : myQuickArray){
                System.out.print(" "+ element);
            }
    }
    //QuickSort
    public void quickSort (int initial, int last){
        if (initial < last){
            int pIndex = hoarePartition(initial, last);
            quickSort(initial, pIndex-1);
            quickSort(pIndex+1, last);
        }
    }
}

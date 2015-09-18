import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Nazli on 2015-07-02.
 */
/**
 * QuickSort:
 * Pick an element as pivot
 * Find right place for pivot
 * Left hand side no element is greater than pivot
 * Right hand side no element is less than pivot
 * */
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
            while (true){ //Continue till left is less than right
                do {
                    left++;
                }while (myQuickArray.get(left) <= pivot);
                do{
                    right--;
                }while (myQuickArray.get(right) > pivot);
                if (left < right)
                    Collections.swap(myQuickArray, left, right);
                else
                    return right;
            }
    }
    //Display sorted array
    public void display (){
            for (Integer element : myQuickArray){
                System.out.print(" "+ element);
            }
        System.out.print("\n");
    }
    //QuickSort - recurse till there is an element in the array
    public void quickSort (int initial, int last){
        if (initial < last){
            int pIndex = hoarePartition(initial, last); //find position for pivot
            quickSort(initial, pIndex-1); //left-hand side of pivot
            quickSort(pIndex+1, last); //right-hand side of pivot
        }
    }
}

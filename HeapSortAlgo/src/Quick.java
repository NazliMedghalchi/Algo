/**
 * Created by Nazli on 2015-06-08.
 */

import java.util.*;

public class Quick {
    ArrayList<Integer> myQuickArray = new ArrayList<Integer>();
//    int pivot;

    private void swapValue(int source, int destination){
        myQuickArray.set(source, myQuickArray.get(destination));
        myQuickArray.set(destination, myQuickArray.get(source));
    }

    private int partitioning(int begin, int end){
//        Random random = new Random();
        // pivot is chosen randomly therefore it is balanced partitioning
        //Faster O(n)
//        int r = random.nextInt(myQuickArray.size());
        int r = end;
        int p = begin;
        int j; //right-hand side of splitter
        int i = p-1; //i left-hand side of splitter
        int pivotValue = myQuickArray.get(r);
        for (j = 0; j<end -2; j++){
            if (myQuickArray.get(j) < pivotValue){
                swapValue(myQuickArray.get(++i), myQuickArray.get(j));
//                Collections.swap(myQuickArray, ++i, j);
            }
        }
        swapValue(myQuickArray.get(i+1), pivotValue);
        return i+1;
    }

    public void QuickSort(int initial, int last){
        int pivotIndex = partitioning(initial, last);
        QuickSort(initial, pivotIndex);
        QuickSort(pivotIndex, last);
    }
    public Quick(int[] input){
        for (int itr : input){
            myQuickArray.add(itr);
        }
    }
}

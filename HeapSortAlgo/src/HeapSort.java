import java.util.*;

/**
 * Created by Nazli on 2015-06-03.
 */
public class HeapSort{
    private int[] sortedInput; //added code
    private int[] sort(int[] input) {
        int[] myReturnArray = new int[input.length];
        MinHeap myHeap = new MinHeap(input);

        for (int i = 0; i < input.length; i++) {
            myReturnArray[i] = myHeap.pop();
        }
        System.out.println(myReturnArray);
        return myReturnArray;
    }
    public int[] HeapSort(int[] input){
        sortedInput = sort(input);
        return sortedInput;
    }
}

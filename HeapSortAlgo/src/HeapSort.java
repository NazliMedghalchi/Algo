import com.intellij.openapi.vfs.newvfs.persistent.ContentHashesUtil;

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
        System.out.println("Passed"); //testing loop
        System.out.println(myReturnArray);
        return myReturnArray;
    }
    //added constructor
    public HeapSort(int[] input){
        sortedInput = sort(input);
    }
}

/**
 * Created by Nazli on 2015-05-13.
 */
/**
 * Get the array
 * use heap data structure to find min values
 * print sorted array
 */
import io.netty.handler.codec.haproxy.HAProxyCommand;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Driver {

        public static void main(String[] args) {
            System.out.println("hello world");
            int[] input = new int[]{14,15,12,13,20,17,16,11};
            int[] input2 = {11,4,2,14,21,18,32,1};

            //Using MinHeap Class pop all elements
            //Use non static method w/defined obj of the class Driver
            MinHeap myHeap = new MinHeap(input);
            myHeap.insertToHeap(30);
            myHeap.insertToHeap(21);
            myHeap.insertToHeap(9);
            myHeap.pick(30);
            myHeap.pick(9);
//            myHeap.pickBST(0, 14));
            
//            Driver myDriver = new Driver();
            int[] result  = myHeap.HeapSort(input);
            System.out.println("Sorted array:");
            for (int i : result){
                System.out.println(i);
            }

           //Convert array of int to String
            System.out.println(Arrays.toString(result));

            //Try Pick

            System.out.println("1st Minimum value:" + myHeap.pop());
            System.out.println("2nd Minimum value:" + myHeap.pop());
            System.out.println("3rd Minimum value:" + myHeap.pop());
            System.out.println("4th Minimum value:" + myHeap.pop());
            System.out.println("5th Minimum value:" + myHeap.pop());
            System.out.println("6th Minimum value:" + myHeap.pop());
            System.out.println("7th Minimum value:" + myHeap.pop());
            System.out.println("8th Minimum value:" + myHeap.pop());
            System.out.println("8th Minimum value:" + myHeap.pop());

            System.out.println(Arrays.toString(input));

        // Quick Sort
//            ArrayList<Integer> quickSorted = new ArrayList<Integer>();
//            System.out.println(Arrays.toString(input2));
//            List<Integer> myQuickList = new ArrayList<Integer>();


//            quickSorted.set(myQuickList.QuickSort(0, input2.length));
//            System.out.println((result));

         // Merge Sort

    }

}

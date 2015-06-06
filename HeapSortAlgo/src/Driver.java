/**
 * Created by Nazli on 2015-05-13.
 */
import io.netty.handler.codec.haproxy.HAProxyCommand;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Driver {

        //Get the array
        //use heap data structure to find min values
        //print sorted array
        public int[] HeapSort(int[] input){
            int[] sortedArray = new int[input.length];
            MinHeap myMinHeap = new MinHeap(input);
            int itr =0;
            while (itr < input.length) {
                sortedArray[itr] = myMinHeap.pop();
                itr++;
            }
            return sortedArray;
        }

        public static void main(String[] args) {
            System.out.println("hello world");
            int[] input = {14,15,12,13,20,17,16,11};
//          HeapSort sortME = new HeapSort(input);
            //Using MinHeap Class pop all elements
            //Use non static method w/defined obj of the class Driver
            Driver myDriver = new Driver();
            int[] result  = myDriver.HeapSort(input);
            System.out.println("Sorted array:");
            for (int i : result){
                System.out.println(i);
            }

           //Convert array of int to String
            System.out.println(Arrays.toString(result));

            //Try Pick
            MinHeap myHeap = new MinHeap(result);
//     (

            myHeap.insertToHeap(30);

            System.out.println("First Minimum value:" + myHeap.pop());
            System.out.println("2nd Minimum value:" + myHeap.pop());
            System.out.println("3rd Minimum value:" + myHeap.pop());
            System.out.println("4th Minimum value:" + myHeap.pop());
            System.out.println("5th Minimum value:" + myHeap.pop());
            System.out.println("6th Minimum value:" + myHeap.pop());
            System.out.println("7th Minimum value:" + myHeap.pop());
            System.out.println("8th Minimum value:" + myHeap.pop());



//            System.out.println(input);


        // Quick Sort
         // Merge Sort
    }

}

/**
 * Created by Nazli on 2015-05-13.
 */
/**
 * Get the array
 * use heap data structure to find min values
 * print sorted array
 */

import java.util.*;

public class Driver {

        public static void main(String[] args) {
            System.out.println("hello world");
            int[] input = new int[]{14,15,12,13,20,17,16,11};
            int[] input2 = new int[]{11,4,2,14,21,32,18,11};
            int[] input3 = new int[]{12,8,4,2,5,4,10,21};

            // HeapSort
            // Using MinHeap Class pop all elements
            // Use non static method w/defined obj of the class Driver
            MinHeap myHeap = new MinHeap(input);
            myHeap.insertToHeap(30);
            myHeap.insertToHeap(21);
            myHeap.insertToHeap(9);
            System.out.println("Heap after sorting:");
            myHeap.displayHeap();
            //Try Pick --- Iteration
            myHeap.pick(30);
            myHeap.pick(9);
            myHeap.pick(100);
//            myHeap.pickBST(0, 14));

            int[] result  = myHeap.HeapSort(input);
            System.out.print("Sorted array:");
            for (int i : result){
                System.out.print(" " + i);
            }
           //Convert array of int to String
            System.out.println("\n" +Arrays.toString(result));

            System.out.println(myHeap.minimum());
            System.out.println("1st Minimum value:" + myHeap.pop());
            System.out.println("2nd Minimum value:" + myHeap.pop());
            System.out.println("3rd Minimum value:" + myHeap.pop());
            System.out.println("4th Minimum value:" + myHeap.pop());
            System.out.println("5th Minimum value:" + myHeap.pop());
            System.out.println("6th Minimum value:" + myHeap.pop());
            System.out.println("7th Minimum value:" + myHeap.pop());
            System.out.println("8th Minimum value:" + myHeap.pop());
            System.out.println("9th Minimum value:" + myHeap.pop());
            System.out.println("10th Minimum value:" + myHeap.pop());
            System.out.println("11th Minimum value:" + myHeap.pop());
            System.out.println(Arrays.toString(input));

        // Quick Sort
            System.out.println("Before Quick Sort: " + Arrays.toString(input2));
            System.out.println("After Quick Sort:");
            Quick myQuick = new Quick(input2);
            myQuick.quickSort(0, input2.length - 1);
            myQuick.display();

         // Merge Sort
            mergeSort myMerge = new mergeSort(input3);
            myMerge.sortTD(0,input3.length);
            //Check result
            System.out.println("Input to mergeSort: "+ Arrays.toString(input3));
            myMerge.display();

    }
}

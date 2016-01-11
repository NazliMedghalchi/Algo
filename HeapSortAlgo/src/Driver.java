/**
 * Created by Nazli on 2015-05-13.
 */
/**
 * HeapSort ALgo:
 * Get the array
 * use heap data structure to find min values
 * print sorted array
 * QuickSort:
 * Pick an element as pivot
 * Find right place for pivot
 * Left hand side no element is greater than pivot
 * Right hand side no element is less than pivot
 * MergeSort:
 * Use an auxiliary array to merge elements
 * Divide the main array into two
 * Continue till there are two elements to be compared
 * Merge all smaller arrays into main array
 * */
/**
 * This [Driver] is Client Code
 * */

import java.util.*;

public class Driver {

        public static void main(String[] args) {
            System.out.println("hello world");
            int[] input = new int[]{14,15,12,13,20,17,16,11};
            int[] input2 = {11,4,2,14,21,32,18,11};
            Integer[] input3 = {7,6,5,4,3,2,1};
            ArrayList<Integer> input4 = new ArrayList<Integer>(Arrays.asList(14, 21, 3, 12, 28, 9, 6, 22, 15, 17, 13, 23));

            // HeapSort
            // Using MinHeap Class pop all elements
            // Use non static method w/defined obj of the class Driver
            MinHeap myHeap = new MinHeap(input);
//            System.out.println(HeapSort.sort(input2));
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
            myMerge.sortTD(0, input3.length-1);
            //Check result
            System.out.println("Input to mergeSort: "+ Arrays.toString(input3));
            myMerge.display();

            //BucketSort

//            //StableMarriage
//            ArrayList<Integer> applicant = new ArrayList<Integer>(4, 5, 3, 9, 1, 10);
//            Integer company = {10, 1, 5, 4, 9, 3};
//            StableMarriage makeStable = new StableMarriage(applicant, company);
//            makeStable(applicant, company);

            // Binary tree
//            int[] inTree = new int[]{4,3,10,2,11,1,8};
//            BinaryTree binaryTree = new BinaryTree(inTree);
//            binaryTree.binarySearch();

            CrackingHashTable crack = new CrackingHashTable();
            String[] words = new String[]{"Cracking ", "Coding ", "Interview ", "questions "};
            System.out.println(crack.makeSentence(words));

            String findUniques = "!@#$%^&*";
            String noUnique = "ASDADASDA";
            System.out.println(crack.uniqueChars2(findUniques));
            System.out.println(crack.uniqueChars2(noUnique));

        }
}

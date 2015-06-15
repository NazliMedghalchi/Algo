/**
 * Created by Nazli on 2015-05-13.
 * MinHeap data structure
 * will be used for HeapSort
 */

import javax.management.ValueExp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinHeap {
        private ArrayList<Integer> myArrayList = new ArrayList<Integer>(Arrays.asList());
//        private int maxSize;
//        private int currentSize;

        // Method HeapSort works --- sort an given array using Heap data structure
        public int[] HeapSort(int[] input) {
                int[] sortedArray = new int[input.length];
                MinHeap myMinHeap = new MinHeap(input);
                int itr = 0;
                while (itr < input.length) {
                        sortedArray[itr] = myMinHeap.pop();
                        itr++;
                }
                return sortedArray;
        }

        public void displayHeap (){
                for (Integer element : myArrayList) {
                        System.out.println(element);
                }
        }
        public ArrayList<Integer> insertToHeap( int input){ //adding works, bubbleUp is working
                myArrayList.add(input);
                bubbleUp(myArrayList.size() - 1);
                return myArrayList;
        }

        //Look for a Value --- Recursive method
        public int pickBST(int pos, int value) {
                if (myArrayList.get(pos) == value) {
                        System.out.println(pos);
                        return pos;
                }
                pickBST(leftChild(pos), value);
                pickBST(rightChild(pos), value);
                return myArrayList.size();
        }
        //Look for value --- Iteration method
        public int pick(int value){
                int root;
                for (root =0; root < myArrayList.size(); ++root){
                        if (value == myArrayList.get(root)){ //Found the value in Heap?
                                System.out.println("Founded at:"+ root);
                                return root;
                        }
                }
                //Couldn't find it?
                System.out.println("Doesn't exist!" + value);
                return value;
        }

        //bubbleDown ArrayList
        public void bubbleDown(int index){
        // given index, bubble down the value to its correct place below

                // check to see if there is left child and right child
                int leftChild = leftChild(index);
                int rightChild = rightChild(index);
                int minimumIndex = index;

                // check to see if left child is less than the size of myArrayList
                if (leftChild >= myArrayList.size()) return;

                // compare parent with left child
                if (myArrayList.get(minimumIndex) > myArrayList.get(leftChild)) {
                        minimumIndex = leftChild;
                }

                if (rightChild < myArrayList.size() && myArrayList.get(minimumIndex) > myArrayList.get(rightChild)) {
                        minimumIndex = rightChild;
                }

                // check to see if minimumIndex actually changed?
                if (minimumIndex != index) {
                        swapValue(index, minimumIndex);
                        bubbleDown(minimumIndex);
                }

                // otherwise done
        }
        //HeapifyUp heapStructure for Insertion
        public void bubbleUp(int index){
                int parent = parentNode(index);
                //base
                if (index == 0) {
                        return;
                }
                else if (myArrayList.get(index)>= myArrayList.get(parent)){
                        // do nothing
                }
                else if (myArrayList.get(index) < myArrayList.get(parent)){
                        swapValue(index, parent);
                        bubbleUp(parent);

                }
                //bubbleUp(parent);
        }

        //swap
        private void swapValue (int indexS, int indexD) { //swapValue() is working Correctly
                int tempValue;
                tempValue = myArrayList.get(indexS);
                myArrayList.set(indexS, myArrayList.get(indexD))  ;
                myArrayList.set(indexD, tempValue);
        }
        //Finding parent, leftChild and rightChild
        private int parentNode(int index){
                int parent = (index-1) /2;
                return parent;
        }

        private int leftChild(int parent){
                int _left = (2 * parent) + 1;
                return _left;
        }
        private int rightChild(int parent) {
                int _right = (2 * parent) + 2;
                return _right;
        }

        //Delete Min value from root
        public int pop(){ //Extract min value from Heap
                int minimum = myArrayList.get(0);
                myArrayList.set(0, myArrayList.get(myArrayList.size()-1));
                myArrayList.set(myArrayList.size() - 1, myArrayList.get(0));
                myArrayList.remove(myArrayList.size() - 1);
                bubbleDown(0);
                return minimum;
        }

        //return minimum value
        public int minimum(){
                return myArrayList.get(0);
        }
        //Construct MinHeap
        public MinHeap(int[] input) {
                // constructor for arrayList
                //Using Arrays.asList()
//                myArrayList = new ArrayList(Arrays.asList(input));

                //Using Collections.addAll()
//                myArrayList.addAll(Arrays.asList(input));

                // run time is slow.
                // Manual Way of doing
                for (int itrArray = 0; itrArray < input.length; itrArray++){
                      myArrayList.add(itrArray, input[itrArray]);
                        bubbleUp(itrArray);
                }
        }
}
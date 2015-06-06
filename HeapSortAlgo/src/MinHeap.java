/**
 * Created by Nazli on 2015-05-13.
 * MinHeap data structure
 * will be used for HeapSort
 */

import javax.management.ValueExp;
import java.util.ArrayList;
import java.util.Arrays;

public class MinHeap{
        private ArrayList<Integer> myArrayList = new ArrayList<Integer>(Arrays.asList());
//        private int maxSize;
//        private int currentSize;

        public void insertToHeap(int input) { //adding works, bubbleUp is working
                myArrayList.add(input);
                bubbleUp(myArrayList.size()-1);
                for (int element : myArrayList){
                        System.out.println(element);
                }
        }
        //bubbleDown ArrayList

        public int pick(int root, int value){
                if (myArrayList.get(root) == value) {
                       return root; //couldn't find
                }
                else if (root > myArrayList.size()){
                        //&& myArrayList.get(root) != value
                        System.out.println("Not Found!");
                        return myArrayList.size();
                }
                return pick(++root, value);

        }
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
        public int pop(){ //pop() is working correctly
                int minimum = myArrayList.get(0);
                myArrayList.set(0, myArrayList.get(myArrayList.size()-1));
                myArrayList.set(myArrayList.size() - 1, myArrayList.get(0));
                myArrayList.remove(myArrayList.size() - 1);
                bubbleDown(0);
                return minimum;
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
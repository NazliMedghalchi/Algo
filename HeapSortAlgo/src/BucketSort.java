import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by Nazli on 2015-09-15.
 * Pseudocode:
 * BuchetSort (Data : Value[])
 *  //Make buckets
 *  //Sort the Buckets
 *  //Gather the bucket values back into the original array.
 * End BucketSort
 */
public class BucketSort {
    private int bucketSize;
    private ArrayList<Integer> arrayOfBuckets;
    private int[] bucket;
    private int min=0;
    private int max=0;
    private  ArrayList<Integer> inputArray = new ArrayList<Integer>();

    //Recursion on BucketSort

    //non recursion on BucketSort
    public void sort(int start){
        for (int j=0; j<= arrayOfBuckets.size(); j++){
            MinHeap heapBucket  = new MinHeap(bucket);
            heapBucket.HeapSort(bucket);
        }
    }
    //display results of Bucket Sort
    public void display(){

        System.out.println("Sorted Bucket:");
        for (Integer num : inputArray)
            System.out.println(num);
    }
    public BucketSort(int[] input, int BNumber){
        //Make buckets
        for (int value : input){
            if (value > max) max = input[value];
            else if (value < min) min = input[value];
        }
        int bucketRange = (max-min)+1;
        bucketSize = bucketRange/BNumber;
        for (int i = 0; i <=input.length; i++) {
            arrayOfBuckets = new ArrayList<Integer>(bucketSize);
        }
        for (Integer val : inputArray)
            arrayOfBuckets[(input[val]-min)/bucketRange].add(input[val]);
    }
}

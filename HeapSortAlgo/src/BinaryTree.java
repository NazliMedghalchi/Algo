import java.util.*;

/**
 * Created by nazlimedghalchi on 15-10-08.
 */
public class BinaryTree {
    private ArrayList<Integer> vertices = new ArrayList<Integer>();
    int root = 1;

    int leftChild = 2 * root;
    int rightChild = 2 * root + 1;
    int height = vertices.size() - 1;

    public BinaryTree (int[] input) {
        for (int i : input) {
            if (input[i] > vertices.get(root)) {
                if (vertices.get(rightChild) != null && rightChild < input.length) {
                    vertices.set(rightChild, input[i]);
                } else if (vertices.get(leftChild) == null) {
                    vertices.set(leftChild, input[i]);
                }
            }
            if (vertices.get(rightChild) < vertices.get(leftChild)) {
                Integer temp = vertices.get(rightChild);
                vertices.set(rightChild, vertices.get(leftChild));
                vertices.set(leftChild, temp);
            }
        }
    }

    public void binarySearch(){

    }
}

import java.util.*;
public class PriorityQueue {
    ArrayList<Integer> l = new ArrayList<>();  // ArrayList to store heap elements (min-heap)
    // Adds an element to the heap and maintains the heap property
    public void add(int val) {  // O(log n)
        l.add(val);             // Add the new value at the end of the list (as a leaf)
        upheaplify(l.size() - 1);  // Restore heap property by comparing with parent
    }

    // Restores the heap property by moving the newly added element up the heap
    private void upheaplify(int child) {
        if (child == 0) return;  // If the element is the root, no need to heapify
        int parent = (child - 1) / 2;  // Calculate the parent index of the current node
        
        // If the parent is greater than the child, swap them to maintain min-heap property
        if (l.get(parent) > l.get(child)) {
            swap(parent, child);       // Swap the values at parent and child indices
            upheaplify(parent);        // Recursively call upheaplify on the parent to continue restoring
        }
    }

    // Swap two elements in the heap (used in heapify operations)
    private void swap(int parent, int child) {
        int temp = l.get(parent);       // Store the parent value temporarily
        l.set(parent, l.get(child));    // Set parent value to child's value
        l.set(child, temp);             // Set child value to the stored parent value
    }

    // Returns the size of the priority queue
    public int size() {
        return l.size();  // Return the number of elements in the heap
    }

    // Returns the minimum element (the root of the heap) without removing it
    public int getMin() {
        return l.get(0);  // Root of the heap (smallest element in min-heap)
    }

    // Removes and returns the minimum element (the root), and maintains the heap property
    public int remove() {  // O(log n)
        swap(0, l.size() - 1);  // Swap the root with the last element in the heap
        int rv = l.remove(l.size() - 1);  // Remove and store the last element (the minimum value)
        downheaplify(0);  // Restore the heap property by heapifying from the root
        return rv;        // Return the removed element
    }

    // Restores the heap property by moving the element at the given index down the heap
    private void downheaplify(int parent) {
        int child1 = parent * 2 + 1;  // Left child index
        int child2 = parent * 2 + 2;  // Right child index
        int min = parent;             // Assume the parent is the smallest initially

        // If the left child exists and is smaller than the current smallest, update the min index
        if (child1 < l.size() && l.get(child1) < l.get(min)) {
            min = child1;
        }

        // If the right child exists and is smaller than the current smallest, update the min index
        if (child2 < l.size() && l.get(child2) < l.get(min)) {
            min = child2;
        }

        // If the smallest element is not the parent, swap it with the smallest child and heapify further
        if (min != parent) {
            swap(parent, min);     // Swap the parent with the smallest child
            downheaplify(min);     // Recursively call downheaplify on the new child
        }
    }
}

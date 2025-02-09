package HashMap;
public class HashMap {
    public class Node {
        String key;
        Integer value;
        Node next;
    }

    private Node[] bucket;

    public HashMap(int n) {
        bucket = new Node[n];
    }

    public HashMap() {
        bucket = new Node[4];
    }

    public int hasFunc(String key) {
        int idx = key.hashCode() % bucket.length;
        if (idx < 0) {
            idx += bucket.length;
        }
        return idx;
    }

    public void put(String key, Integer value) {
        int bn = hasFunc(key); // Step 1: Compute the hash index
        Node temp = bucket[bn]; // Step 2: Get the head node of the linked list at the computed index
        while (temp != null) { // Step 3: Traverse the linked list at that index
            if (temp.key.equals(key)) { // Step 4: Check if the key already exists
                temp.value = value; // Step 5: If key exists, update the value
                return; // Step 6: Exit the function after updating
            }
            temp = temp.next; // Step 7: Move to the next node in the linked list
        }
        Node nn = new Node(); // Step 8: If key does not exist, create a new node
        nn.value = value; // Step 9: Set the value for the new node
        nn.key = key; // Step 10: Set the key for the new node
        nn.next = bucket[bn]; // Step 11: Point the new node to the current head of the linked list
        bucket[bn] = nn; // Step 12: Insert the new node at the head of the list (rehashing/collision
                         // handling)
    }

    public Integer get(String key) {
        int bn = hasFunc(key);
        Node current = bucket[bn];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public boolean contains(String key) {
        int bn = hasFunc(key);
        Node current = bucket[bn];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("apple", 10);
        map.put("banana", 20);
        System.out.println(map.get("apple"));
        map.put("apple", 15); // Outputs old value (10)
        System.out.println(map.get("banana")); // Outputs 20
        System.out.println(map.get("apple")); // Outputs updated value (15)
    }

}
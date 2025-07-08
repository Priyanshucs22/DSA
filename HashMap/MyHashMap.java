package HashMap;

public class MyHashMap {
    public class Node {
        String key;
        Integer value;
        Node next;

        Node(String key, Integer value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] bucket;
    private int size;
    private final double LOAD_FACTOR_THRESHOLD = 0.75;

    public MyHashMap(int n) {
        bucket = new Node[n];
        size = 0;
    }

    public MyHashMap() {
        bucket = new Node[4];
        size = 0;
    }

    public int hasFunc(String key) {
        int idx = key.hashCode() % bucket.length;
        if (idx < 0) idx += bucket.length;
        return idx;
    }

    public void put(String key, Integer value) {
        int bn = hasFunc(key);
        Node temp = bucket[bn];
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node(key, value);
        nn.next = bucket[bn];
        bucket[bn] = nn;
        size++;

        if ((double) size / bucket.length > LOAD_FACTOR_THRESHOLD) {
            rehash();
        }
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

    public void remove(String key) {
        int bn = hasFunc(key);
        Node current = bucket[bn];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    bucket[bn] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    private void rehash() {
        Node[] oldBucket = bucket;
        bucket = new Node[oldBucket.length * 2];
        size = 0; // Reset and re-insert to maintain count

        for (Node head : oldBucket) {
            Node temp = head;
            while (temp != null) {
                put(temp.key, temp.value); // Will re-calculate new index
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);
        map.put("date", 40);

        System.out.println(map.get("apple"));   // 10
        map.put("apple", 15);
        System.out.println(map.get("apple"));   // 15
        System.out.println(map.contains("banana")); // true
        map.remove("banana");
        System.out.println(map.contains("banana")); // false

        System.out.println("Size: " + map.size()); // 3

        // Test rehashing by adding more keys
        map.put("grape", 50);
        map.put("kiwi", 60);
        map.put("lemon", 70);
        map.put("mango", 80);
        System.out.println("Size after rehash: " + map.size()); // 7
    }
}

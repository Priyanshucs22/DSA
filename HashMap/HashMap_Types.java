package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
public class HashMap_Types {
     public static void main(String[] args) {
        // 1️⃣ HashMap (Unordered)
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        System.out.println("HashMap (Unordered): " + hashMap);

        // 2️⃣ LinkedHashMap (Maintains Insertion Order)
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);

        // 3️⃣ TreeMap (Sorted Order)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        System.out.println("TreeMap (Sorted): " + treeMap);

        // 4️⃣ Hashtable (Thread-Safe, Legacy)
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "C");
        hashtable.put(1, "A");
        hashtable.put(2, "B");
        System.out.println("Hashtable (Thread-Safe): " + hashtable);

        // 5️⃣ ConcurrentHashMap (Thread-Safe, Modern)
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(3, "C");
        concurrentHashMap.put(1, "A");
        concurrentHashMap.put(2, "B");
        System.out.println("ConcurrentHashMap (Thread-Safe): " + concurrentHashMap);

    }
}

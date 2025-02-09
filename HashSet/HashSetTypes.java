package HashSet;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
public class HashSetTypes {
    public static void main(String[] args) {
        // 1️⃣ HashSet (Unordered, No Duplicates)
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(30, 10, 20, 10));
        System.out.println("HashSet (Unordered): " + hashSet); // Duplicates removed

        // 2️⃣ LinkedHashSet (Maintains Insertion Order)
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(30, 10, 20, 10));
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);

        // 3️⃣ TreeSet (Sorted Order, No Duplicates)
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(30, 10, 20, 10));
        System.out.println("TreeSet (Sorted): " + treeSet);

        // 4️⃣ ConcurrentSkipListSet (Thread-safe & Sorted)
        ConcurrentSkipListSet<Integer> skipListSet = new ConcurrentSkipListSet<>(Arrays.asList(30, 10, 20, 10));
        System.out.println("ConcurrentSkipListSet (Sorted & Thread-Safe): " + skipListSet);

        // 5️⃣ CopyOnWriteArraySet (Thread-safe, Better for Read-heavy Operations)
        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>(Arrays.asList(30, 10, 20, 10));
        System.out.println("CopyOnWriteArraySet (Thread-Safe): " + copyOnWriteSet);

    }
}

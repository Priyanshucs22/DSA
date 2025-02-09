package Graph;
import java.util.HashMap;

public class DisjointSet {
    class Node {
        int val;
        int rank;
        Node parent;
        
        Node(int v) {
            val = v;
            rank = 0;
            parent = this; // initially, the parent is the node itself
        }
    }

    HashMap<Integer, Node> map = new HashMap<>();

    // Create a new set with a single element v
    public void createSet(int v) {
        Node nn = new Node(v);
        map.put(v, nn);
    }

    // Find the representative of the set containing v, with path compression
    public Node find(int v) {
        Node node = map.get(v);
        if (node == null) return null; // added null check for safety
        return find(node.parent);
    }

    private Node find(Node node) {
        if (node == node.parent) {
            return node; 
        }
        Node n = find(node.parent);
        node.parent  = n;    //Path compression
        return n;
    }

    // Union by rank of the sets containing e1 and e2
    public void union(int e1, int e2) {
        Node n1 = map.get(e1);
        Node n2 = map.get(e2);

        if (n1 == null || n2 == null) return; // added null check for safety

        Node root1 = find(n1);
        Node root2 = find(n2);

        if (root1 == root2) return; // they are already in the same set

        // Union by rank
        if (root1.rank == root2.rank) {
            root1.parent = root2;
            root2.rank++;
        } else if (root1.rank > root2.rank) {
            root2.parent = root1;
        } else {
            root1.parent = root2;
        }
    }
}

package Graph;
import java.util.*;
import java.util.HashMap;
public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map;
    // Constructor to initialize graph with 'v' vertices
    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    // Add an edge between ,m vertices v1 and v2 with the given cost
    public void addEdge(int v1, int v2, int cost) {
        if (!map.containsKey(v1) || !map.containsKey(v2)) return;
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost); // For undirected graph
    }

    // Check if an edge exists between v1 and v2
    public boolean containsEdge(int v1, int v2) {
        return map.containsKey(v1) && map.get(v1).containsKey(v2);
    }

    // Check if a vertex exists in the graph
    public boolean containsVertex(int v1) {
        return map.containsKey(v1);
    }

    // Get the total number of edges in the graph
    public int noOfEdge() {
        int edgeCount = 0;
        for (HashMap<Integer, Integer> neighbors : map.values()) {  // we also use var in place of HashMap<Integer, Integer> becz var is determined by its own about datatype
            edgeCount += neighbors.size();
        }
        return edgeCount / 2; // Each edge is counted twice in an undirected graph
    }

    // Remove the edge between v1 and v2
    public void removeEdge(int v1, int v2) {
        if (containsEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1); // For undirected graph
        }
    }

    // Remove a vertex and its associated edges
    public void removeVertex(int v1) {
        if (containsVertex(v1)) {
            for (int neighbor : map.get(v1).keySet()) {
                map.get(neighbor).remove(v1); // Remove v1 from its neighbors
            }
            map.remove(v1); // Finally, remove the vertex itself
        } 
    }
 
    // Display the graph's adjacency list representation
    public void display() {
        for (Map.Entry<Integer, HashMap<Integer, Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Check if a path exists between src and dest using DFS
    public boolean hasPath(int src, int dest, HashSet<Integer> vis) {
        if (src == dest) return true;
        vis.add(src);
        for (int nbr : map.get(src).keySet()) {
            if (!vis.contains(nbr)) {
                boolean ans = hasPath(nbr, dest, vis);
                if (ans) return true;
            }
        }
        vis.remove(src);
        return false;
    }

    // Print all paths from src to dest using DFS
    public void printPath(int src, int dest, HashSet<Integer> vis, String ans) {
        if (src == dest) {
            System.out.println(ans + dest);
            return;
        }
        vis.add(src);
        for (int nbr : map.get(src).keySet()) {
            if (!vis.contains(nbr)) {
                printPath(nbr, dest, vis, ans + src + "->");
            }
        }
        vis.remove(src);
    }

    // Perform BFS to check if there is a  path from src to dest
    public boolean bfs(int src, int dest) {
        if (src == dest) return true; // Base case for src == dest
        HashSet<Integer> vis = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            // Remove
            int rv = q.poll();
            // Ignore if already visited
            if (vis.contains(rv)) continue; // If we want to check cycle, we would return true here
            // Add to visited
            vis.add(rv);
            // Check if we reached the destination
            if (rv == dest) return true;
            // Add neighbors to the queue b
            for (int nbr : map.get(rv).keySet()) {
                if (!vis.contains(nbr)) {
                    q.add(nbr);
                }
            }
        }
        return false; // If BFS completes without finding the destination
    }

    public boolean dfs(int src,int dest){
        HashSet<Integer> vis = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.push(src);
        while(!st.isEmpty()){
            int rv = st.pop();
            if(vis.contains(rv)) continue;
            vis.add(rv);
            if(rv==dest) return true;
            for (int nbr : map.get(rv).keySet()) {
                if (!vis.contains(nbr)) {
                    st.push(nbr);
                }
            }
        }
        return false;
    }

    public void bft() {
        HashSet<Integer> vis = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(int src:map.keySet()) {
            if(vis.contains(src)) continue;
            q.add(src);
            while (!q.isEmpty()) {
                int rv = q.poll();
                if (vis.contains(rv)) continue;
                System.out.print(rv+" "); 
                vis.add(rv);
                for (int nbr : map.get(rv).keySet()) {
                    if (!vis.contains(nbr)) {
                        q.add(nbr);
                    }
                }
            }
            System.out.println();
        }
    }

    public void dft(){
        HashSet<Integer> vis = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int src:map.keySet()){
            if(vis.contains(src)) continue;
            st.push(src);
            while(!st.isEmpty()){
                int rv = st.pop();
                if(vis.contains(rv)) continue;
                System.out.print(rv+" ");
                vis.add(rv);
                for (int nbr : map.get(rv).keySet()) {
                    if (!vis.contains(nbr)) {
                        st.push(nbr);
                    }
                }
            }
            System.out.println(); 
        }
    }
     // Cycle detection in the graph using DFS
    public boolean isCycle() {
        HashSet<Integer> vis = new HashSet<>();
        for (int src : map.keySet()) {
            if (!vis.contains(src)) {
                if (hasCycle(src, vis, -1)) {
                    return true;
                }
            }
        }
        return false; // No cycle found
    }

    // Helper function to detect a cycle during DFS traversal
    private boolean hasCycle(int src, HashSet<Integer> vis, int parent) {
        vis.add(src);
        for (int nbr : map.get(src).keySet()) {
            // If the neighbor is already visited and not the parent, it's a cycle
            if (vis.contains(nbr) && nbr != parent) {
                return true;
            }
            // Recur for the unvisited neighbors
            if (!vis.contains(nbr)) {
                if (hasCycle(nbr, vis, src)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Count the number of connected components in the graph
    public int component() {
        HashSet<Integer> vis = new HashSet<>();
        int count = 0;
        for (int src : map.keySet()) {
            if (!vis.contains(src)) {
                dfsComponent(src, vis);
                count++; // Increment component count for each new DFS
            }
        }
        return count;
    }

    // Helper function to perform DFS and mark all nodes in the component
    private void dfsComponent(int src, HashSet<Integer> vis) {
        vis.add(src);
        for (int nbr : map.get(src).keySet()) {
            if (!vis.contains(nbr)) {
                dfsComponent(nbr, vis);
            }
        }
    }
}
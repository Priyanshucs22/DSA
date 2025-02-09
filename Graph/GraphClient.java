package Graph;
// import java.util.*;

public class GraphClient {
    public static void main(String[] args){
        Graph g = new Graph(7);
        g.addEdge(1,2,3);
        g.addEdge(1,4,2);
        g.addEdge(2,3,4);
        g.addEdge(3,4,10);
        g.addEdge(4,5,5);
        g.addEdge(5,6,9);
        g.addEdge(5,7,12);
        g.addEdge(6,7,6);
        g.display();
        // boolean b = g.hasPath(1, 6, new HashSet<>());
        // System.out.println(b);
        // g.printPath(1, 6, new HashSet<>(),"");
        // System.out.println(g.bfs(1,6));
        // System.out.println(g.dfs(1,6));
        g.bft();
        // g.dft();
    }
}

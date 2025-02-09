package Graph;
import java.util.*;
import java.util.HashMap;
public class Garpg_Valid_Tree {
    public static boolean validTree(int n,int [][] edges){
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        return BFT(map);
    }
    public static boolean BFT(HashMap<Integer,ArrayList<Integer>> map){
        int c=0;
        var visited = new HashSet<Integer>();
        Queue<Integer> q =new LinkedList<>();
        for(int key:map.keySet()){
            if(!visited.contains(key)){
                q.add(key);
                c++;
                while (!q.isEmpty()) {
                    int rv=q.poll();
                    if(visited.contains(rv)){
                        return false;
                    }
                    visited.add(rv);
                    for(int j:map.get(rv)){
                        if(!visited.contains(j)){
                            q.add(j);
                        }
                    }
                }
            }
        }
        return c==1;
    }
    public static void main(String[] args) {
        int [][] a= {{0,1},{0,2},{0,3},{1,4}};
        System.out.println(validTree(5,a));
    }
}




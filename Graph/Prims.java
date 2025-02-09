package Graph;
import java.util.*;
public class Prims {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Prims(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int e1, int e2, int cost) {
        map.get(e1).put(e2, cost);
        map.get(e2).put(e1, cost);
    }

    class PrimsPair{
        int vtx;
        int acqvtx;
        int cost;
        PrimsPair(int vtx, int acqvtx, int cost){
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }

        public String toString(){
            return this.vtx + " " + this.acqvtx + " " + this.cost;
        }
    }
    public void primsAlgo(){
        HashSet<Integer> vis = new HashSet<Integer>();
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new PrimsPair(7,7,0));
        int ans = 0;
        while(!pq.isEmpty()){
            PrimsPair rp = pq.poll();
            if(vis.contains(rp.vtx)) continue;
            vis.add(rp.vtx);
            ans+=rp.cost;
            System.out.println(rp);
            for(int nbr:map.get(rp.vtx).keySet()){
                if(!vis.contains(nbr)){
                    pq.add(new PrimsPair(nbr,rp.vtx,map.get(rp.vtx).get(nbr)));
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Prims k = new Prims(7);
        k.addEdge(1, 2, 1);
        k.addEdge(1, 4, 2);
        k.addEdge(2, 3, 4);
        k.addEdge(3, 4, 9);
        k.addEdge(4, 5, 6);
        k.addEdge(5, 7, 2);
        k.addEdge(5, 6, 5);
        k.addEdge(6, 7, 3);
        k.primsAlgo();
    }
}
package Queue;
public class P_client {
    public static void main(String[] args) {
        PriorityQueue p_q=new PriorityQueue();
        p_q.add(10);
        p_q.add(20);
        p_q.add(30);
        p_q.add(5);
        p_q.add(3);
        p_q.add(40);
        p_q.add(-10);
        System.out.println(p_q.getMin());
        p_q.remove();
        System.out.println(p_q.getMin());
    }
}
package Tree;

public class TreeClient {
    
    public static void main(String[] args) {
        
        Tree bt=new Tree();
        bt.BinaryTree();
        bt.Display();
        System.out.println(bt.find(70));
        System.out.println(bt.max());
        System.out.println(bt.height());
        System.out.println(bt.pre());
        System.out.println(bt.level());
        System.out.println(bt.post());
        System.out.println(bt.in());
        //10 true 20 false true 30 false false true 40 false true 50 false false

    }
}
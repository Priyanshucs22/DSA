package Tree;

import java.util.*;
import java.util.Stack;
public class Tree {
    class Node {
        int val;
        Node left;
        Node right;
        Node() {
        }
        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    };

    private Node root;

    public void BinaryTree() {

        root = CreateTree();
    }

    Scanner sc = new Scanner(System.in);

    public Node CreateTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        Boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = CreateTree();
        }
        Boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = CreateTree();
        }

        return nn;
    }

    public void Display() {
        Display(root);
    }

    private void Display(Node node) {
        if (node == null) {
            return;
        }

        String s = "";
        s = s + node.val;
        s = "<-" + s + "->";

        if (node.left != null) {
            s = node.left.val + s;
        } else {
            s = "." + s;
        }
        if (node.right != null) {
            s = s + node.right.val;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);

    }

    public boolean find(int item) {
        return find(this.root, item);
    }

    private boolean find(Node node, int item) {

        if (node == null) {
            return false;
        }
        if (node.val == item) {
            return true;
        }

        boolean lf = find(node.left, item);
        boolean rf = find(node.right, item);

        return lf || rf;
    }

    public int max() {
        return max(root);
    }

    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int Left = max(node.left);
        int Right = max(node.right);

        return Math.max(node.val, Math.max(Left, Right));
    }

    public int height() {
        return height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh, rh) + 1;

    }

    public List<Integer> pre() {
        return preOrder(this.root);
    }

    private List<Integer> preOrder(Node root) {
        List<Integer> ll = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if (root == null) {
            return ll;
        }
        st.push(root);
        while (!st.isEmpty()) {
            Node rv = st.pop();
            ll.add(rv.val);
            if (rv.right != null) {
                st.push(rv.right);
            }
            if (rv.left != null) {
                st.push(rv.left);
            }
        }
        return ll;
    }

    public List<Integer> level() {
        return levelOrder(root);
    }

    private List<Integer> levelOrder(Node root) {
        List<Integer> l = new ArrayList<>();
        if (root == null)
            return l;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            l.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        return l;
    }

    public List<Integer> post(){
        return postOrder(root);
    }
    private List<Integer> postOrder(Node root) {
        Stack<Node> st = new Stack<>();
        Stack<Node> result = new Stack<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        
        if (root == null) return l1;

        st.push(root);
        while (!st.isEmpty()) {
            Node cur = st.pop();
            result.push(cur);

            if (cur.left != null) {
                st.push(cur.left);
            }
            if (cur.right != null) {
                st.push(cur.right);
            }
        }

        while (!result.isEmpty()) {
            l1.add(result.pop().val);
        }

        return l1;
    }

    public List<Integer> in(){
        return inOrder(root);
    }
    private List<Integer> inOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;
        
        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Current must be null at this point
            current = stack.pop();
            result.add(current.val); // Visit the node
            
            // We have visited the node, now visit its right subtree
            current = current.right;
        }
        
        return result;
    }
}
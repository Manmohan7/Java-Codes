import java.util.*;

class tree2
{
    private Node root;

    class Node
    {
        int key;
        int size;
        Node left;
        Node right;
        public Node(int key)
        {
            this.key = key;
            this.size = 1;
        }
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public int size()
    {
        return sizeof(root);
    }

    public int sizeof(Node x)
    {
        return x == null ? 0 : x.size;
    }

    public void insert(int key)
    {
        root = insert(root, key);
    }

    private Node insert(Node x, int key)
    {
        if(x == null)
            return new Node(key);
        if(x.key > key)
            x.left = insert(x.left, key);
        else if(x.key < key)
            x.right = insert(x.right, key);
        x.size = 1 + sizeof(x.left) + sizeof(x.right);
        return x;
    }

    public boolean contains(int key)
    {
        Node x = contains(root, key);
        return x != null;
    }

    private Node contains(Node x, int key)
    {
        if(x == null)
            return null;
        if(x.key > key)
            return contains(x.left, key);
        else if(x.key < key)
            return contains(x.right, key);
        else
            return x;
    }

    public void inOrder()
    {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node x)
    {
        if(x == null)
            return;
        inOrder(x.left);
        System.out.print(x.key + " ");
        inOrder(x.right);
    }

    public void preOrder()
    {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node x)
    {
        if(x == null)
            return;
        System.out.print(x.key + " ");
        preOrder(x.left);
        preOrder(x.right);
    }

    public void postOrder()
    {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node x)
    {
        if(x == null) return;
        postOrder(x.left);
        postOrder(x.right);
        System.out.print(x.key + " ");
    }

    public void levelOrder()
    {
        levelOrder(root);
        System.out.println();
    }

    private void levelOrder(Node x)
    {
        if(x == null) return;
        LinkedList<Node> q = new LinkedList<Node>();
        q.add(x);
        while(!q.isEmpty())
        {
            Node p = (Node)q.poll();
            System.out.print(p.key + " ");
            if(p.left != null)
                q.add(p.left);
            if(p.right != null)
                q.add(p.right);
        }
    }

    public void topView()
    {
        topView(root.left, true);
        System.out.print(root.key + " ");
        topView(root.right, false);
        System.out.println();
    }

    private void topView(Node x, boolean val)
    {
        if(x == null) return;
        if(val)
        {
            topView(x.left, val);
            System.out.print(x.key + " ");
        }
        if(!val)
        {
            System.out.print(x.key + " ");
            topView(x.right, val);
        }
    }

    public int getMin()
    {
        return getMin(root).key;
    }

    private Node getMin(Node x)
    {
        if(x.left == null)
            return x;
        return getMin(x.left);
    }

    public int getMax()
    {
        return getMax(root).key;
    }

    private Node getMax(Node x)
    {
        if(x.right == null)
            return x;
        return getMax(x.right);
    }

    public void delMin()
    {
        root = delMin(root);
    }

    private Node delMin(Node x)
    {
        if(x.left == null)
            return x.right;
        x.left = delMin(x.left);
        x.size = 1 + sizeof(x.right) + sizeof(x.left);
        return x;
    }

    public void delMax()
    {
        root = delMax(root);
    }

    private Node delMax(Node x)
    {
        if(x.right == null)
            return x.left;
        x.right = delMax(x.right);
        x.size = 1 + sizeof(x.left) + sizeof(x.right);
        return x;
    }

    private int getRank(int key)
    {
        return getRank(root, key);
    }

    private int getRank(Node x, int key)
    {
        if(x == null)
            return -1;
        if(x.key == key)
            return sizeof(x.left);
        if(x.key > key)
            return getRank(x.left, key);
        else
            return 1 + sizeof(x.left) + getRank(x.right, key);
    }

    public int height()
    {
        return height(root);
    }

    private int height(Node x)
    {
        if(x == null)
            return 0;
        return 1 + Integer.max(height(x.left), height(x.right));
    }

    public int lca(int k1, int k2)
    {
        Node x = lca(root, k1, k2, null);
        return x.key;
    }

    private Node lca(Node x, int k1, int k2, Node parent)
    {
        if(k1 < x.key && k2 < x.key)
            return lca(x.left, k1, k2, x);
        if(k1 > x.key && k2 > x.key)
            return lca(x.right, k1, k2, x);
        if(k1 == x.key && k2 == x.key)
            return parent;
        return x;
    }

    public void leaf()
    {
        leaf(root);
        System.out.println();
    }

    private void leaf(Node x)
    {
        if(x == null) return;
        if(x.left == null && x.right == null)
        {
            System.out.print(x.key + " ");
            return;
        }
        leaf(x.left);
        leaf(x.right);
    }

    public static void main(String[] args)
    {
        tree2 t = new tree2();
        t.insert(2);
        t.insert(3);
        t.insert(1);
        t.insert(4);
        t.inOrder();
        t.topView();
        t.leaf();
        t.levelOrder();
        System.out.println(t.getMin());
        t.delMin();
        System.out.println(t.getMin());
        System.out.println(t.contains(2));
    }
}

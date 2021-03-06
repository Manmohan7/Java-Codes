import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class tree
{
    Node root;
    Queue q = new LinkedList();

    class Node
    {
        int key;
        int size;
        Node left;
        Node right;
        Node(int x)
        {
            key = x;
        }
    }

    void insert(int val)
    {
        root = insert(root, val);
    }

    Node insert(Node x, int val)
    {
        if(x == null)
            return new Node(val);
        if(val < x.key)
            x.left = insert(x.left, val);
        else if(val > x.key)
            x.right = insert(x.right, val);
        x.size = 1 + sizeof(x.left) + sizeof(x.right);
        return x;
    }

    void display()
    {
        display(root);
    }

    void display(Node x)
    {
        if(x == null)
            return;
        display(x.left);
        display(x.right);
        System.out.println(x.key);
    }

    int size()
    {
        return sizeOf(root);
    }

    int sizeOf(Node x)
    {
        if(x == null)
            return 0;
        return 1 + sizeOf(x.left) + sizeOf(x.right);
    }

    int getmin()
    {
        return getmin(root).key;
    }

    Node getmin(Node x)
    {
        if(x.left == null)
            return x;
        return getmin(x.left);
    }

    int getmax()
    {
        return getmax(root).key;
    }

    Node getmax(Node x)
    {
        if(x.right == null)
            return x;
        return getmax(x.right);
    }

    boolean search(int val)
    {
        return search(root, val);
    }

    boolean search(Node root, int val)
    {
        if(root == null)
            return false;
        if(root.key == val)
            return true;
        if(root.key < val)
            return search(root.right, val);
        else
            return search(root.left, val);
    }

    int ancestor(int a, int b)
    {
        return ancestor(root, a, b, null).key;
    }

    Node ancestor(Node root, int a, int b, Node parent)
    {
        if(root.key < a && root.key < b)
            return ancestor(root.right, a, b, root);
        if(root.key > a && root.key > b)
            return ancestor(root.left, a, b, root);
        if(root.key == a && root.key == b)
            return parent;
        return root;
    }

    public void levelOrder()
    {
        levelOrder(root);
    }

    public void levelOrder(Node root)
    {
        if(root == null)
            return;
        q.add(root.key);
        while( !q.isEmpty() )
        {
            System.out.println( q.poll() );
            levelOrder(root.left);
            levelOrder(root.right);
        }
    }

    public static void main(String[] args)
    {
        tree t = new tree();
        t.insert(50);
        t.insert(30);
        t.insert(70);
        t.insert(40);
        t.insert(10);
        t.insert(60);
        System.out.println(t.size());
        //t.display();
        System.out.println(t.getmax());
        System.out.println(t.search(40));
        System.out.println(t.ancestor(60, 40));
        t.levelOrder();
    }
}

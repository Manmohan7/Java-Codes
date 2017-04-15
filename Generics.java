import java.util.Comparator;
//import java.util.Comparable;

class Priority // implements Comparable    //if we use comparable then we have to implement compareTo function
{
    private int avgTime;
    private int medianTime;

    Priority(int avg, int median)
    {
	this.avgTime = avg;
	this.medianTime = median;
    }

    /*    public int compareTo(Object o)    // if we use this function we can either compare using avgTime or medianTime
    {                                       // and if we want to change it on a later time we will have to edit this function
	Priority p = (Priority)o;           
	if(this.avgTime < p.avgTime) return -1;
	if(this.avgTime > p.avgTime) return 1;
	return 0;
    }
    */

    public int getAvgTime()    //avgTime is private
    {
	return this.avgTime;
    }

    public int getMedianTime()    //medianTime is private
    {
	return this.medianTime;
    }
}

class ByMedian implements Comparator    // we implement this class to compare using medianTime
{
    public int compare(Object o1, Object o2)
    {
	Priority p1 = (Priority)o1;
	Priority p2 = (Priority)o2;
	if(p1.getMedianTime() < p2.getMedianTime())
	    return -1;
	if(p1.getMedianTime() > p2.getMedianTime())
	    return 1;
	return 0;
    }
}

class ByAvg implements Comparator    // we implement this class to compare using avgTime
{
    public int compare(Object o1, Object o2)
    {
	Priority p1 = (Priority)o1;
	Priority p2 = (Priority)o2;
	if(p1.getAvgTime() < p2.getAvgTime())
	    return -1;
	if(p1.getAvgTime() > p2.getAvgTime())
	    return 1;
	return 0;
    }
}

class Process
{
    private String pName;
    private int pId;

    Process(String name, int id)
    {
	this.pName = name;
	this.pId = id;
    }

    public String toString()
    {
	return this.pName;
    }
}

class Tree <Key, Value>
{
    private Node root = null;

    class Node
    {
	Key key;
	Node left;
	Node right;
	Value value;

	Node(Key key, Value  value)
	{
	    this.key = key;
	    this.value = value;
	}
    }

    public void insert(Key key, Value value, Comparator c)
    {
	//root = insert(root, key, value);
	root = insert(root, key, value, c);
    }

    /*
    private Node insert(Node x, Priority key, Process value)
    {
	if(x == null)
	    return new Node(key, value);
	if(key.compareTo(x.key) < 0)
	    x.left = insert(x.left, key, value);
	else if(key.compareTo(x.key) > 0)
	    x.right = insert(x.right, key, value);
	else
	    x.value = value;
	return x;
    }
    */

    private Node insert(Node x, Key key, Value value, Comparator c)
    {
	if(x == null)
	    return new Node(key, value);
	if(c.compare(key, x.key) < 0)
	    x.left = insert(x.left, key, value, c);
	else if(c.compare(key, x.key) > 0)
	    x.right = insert(x.right, key, value, c);
	else
	    x.value = value;
	return x;
    }

    public void inorder()
    {
	inorder(root);
    }

    private void inorder(Node x)
    {
	if(x == null)
	    return;
	inorder(x.left);
	System.out.println(x.value);
	inorder(x.right);
    }
}

public class Generics
{
    public static void main(String[] args)
    {
	Process p1 = new Process("Process 1", 1);
	Process p2 = new Process("Process 2", 2);
	Process p3 = new Process("Process 3", 3);

	Priority pt1 = new Priority(5, 6);
	Priority pt2 = new Priority(3, 4);
	Priority pt3 = new Priority(7, 3);

	Tree tree = new Tree();

	//Comparator c = new ByMedian();    
	Comparator c = new ByAvg();

	tree.insert(pt1, p1, c);
	tree.insert(pt2, p2, c);
	tree.insert(pt3, p3, c);

	tree.inorder();
    }
}

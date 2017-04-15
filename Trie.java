import java.util.Scanner;

public class Trie
{
    Node root;
    public Trie()
    {
        root = new Node();
    }
    
    class Node
    {
	int val;
	Node[] nodes = new Node[26];
    }
    
    public void insert(String word, int value)
    {
	Node p = root;
	for(int i = 0; i < word.length(); i++)
	{
	    int index = word.charAt(i) - 'a';
	    if( p.nodes[index] == null)
		p.nodes[index] = new Node();
	    p = p.nodes[index];
	}
	p.val = value;
    }

    public Node search(String word)
    {
	Node p = root;
	for(int i = 0; i < word.length(); i++)
	{
	    int index = word.charAt(i) - 'a';
	    if( p.nodes[index] == null )
		return null;
	    p = p.nodes[index];
	}
	return p;
    }

    public boolean startWith(String word)
    {
	Node p = search(word);
	return p!=null;
    }

    public Integer getVal(String word)
    {
	Node p = search(word);
	if(p == null)
	    return null;
	return p.val;
    }

    public void softDel(String word)
    {
	Node p = search(word);
	if(p == null)
	    return;
        p.val = 0;
	return;
    }
			
    public static void main(String[] args)
    {
	Trie t = new Trie();
	t.insert("manmohan", 21);
	
	System.out.println( t.startWith("manu") );
	System.out.println( t.getVal("manmohan") );
	t.softDel("manmohan");
	System.out.println( t.getVal("manmohan") );
    }
}

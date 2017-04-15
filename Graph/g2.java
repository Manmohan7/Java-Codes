import java.util.*;

class g2
{
    private LinkedList<Integer>[] adj;
    private int v;
    private int e;

    public g2(int v)
    {
	this.v = v;
	this.adj = new LinkedList[v];
	for(int i = 0; i < v; i++)
	    adj[i] = new LinkedList();
	this.e = 0;
    }

    public void addEdge(int x, int y)
    {
	this.adj[x].add(y);
	this.adj[y].add(x);
	this.e++;
    }

    public int V()
    {
	return this.v;
    }

    public int E()
    {
	return this.e;
    }
}

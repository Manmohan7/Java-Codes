import java.util.*;

class DGraph
{
    int v;
    int e;
    LinkedList<Integer>[] adj;

    public DGraph(int v)
    {
	this.v = v;
	this.e = 0;
	this.adj = new LinkedList[this.v];
	for(int i = 0; i < v; i++)
	    this.adj[i] = new LinkedList();
    }
	
    public void addEdge(int x, int y)
    {
	this.adj[x].add(new Integer(y));
	this.e++;
    }

    public int getV()
    {
	return this.v;
    }

    public Iterable<Integer> get(int x)
    {
	return this.adj[x];
    }
}

class DFS
{
    boolean[] marked;
    int[] edgeTo;

    public DFS(DGraph g, int s)
    {
	this.marked = new boolean[g.getV()];
	this.edgeTo = new int[g.getV()];
	dfs(g,s);
    }

    private void dfs(DGraph g, int s)
    {
	marked[s] = true;
	for(Integer w : g.get(s))
	{
	    if(!marked[w])
	    {
		edgeTo[w] = s;
		dfs(g,w);
	    }
	}
    }

}

class Solution
{
    public static void main()
    {
	Scanner s = new Scanner(System.in);
	DGraph g = new DGraph(s.nextInt());
	g.addEdge(s.nextInt(), s.nextInt());
	
    }
}

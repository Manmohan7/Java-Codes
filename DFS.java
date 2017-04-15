public class DFS
{
    private boolean[] marked;
    private int[] edgeTo;
    
    public DFS(Graph G, int s)
    {
	this.marked = new boolean[G.V()];
	this.edgeTo = new int[G.V()];
	for(int i = 0; i < G.V(); i++)
	    this.edgeTo[i] = Integer.MAX_VALUE;
	dfs(G, s);
    }

    private void dfs(Graph G, int v)
    {
	marked[v] = true;
	for(Integer w : G.adj(v))
	{
	    if(!marked[w])
	    {
		edgeTo[w] = v;
		dfs(G, w);
	    }
	}
    }

    public boolean hasPathTo(int w)
    {
	return marked[w];
    }
}

// This below code is only to check if two vertices are connected or not
// The above code will also tell you through which path they are connected
/*
public class DFS
{
    private boolean[] marked;
    
    public DFS(Graph G, int s)
    {
	this.marked = new boolean[G.V()];
	dfs(G, s);
    }

    private void dfs(Graph G, int v)
    {
	marked[v] = true;
	for(Integer w : G.adj(v))
	{
	    if(!marked[w])
		dfs(G, w);
	}
    }

    public boolean hasPathTo(int w)
    {
	return marked[w];
    }
}

*/

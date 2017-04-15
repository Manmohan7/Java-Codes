public class apnaDFS
{
    private boolean[] marked;
    
    public boolean hasPath(Graph G, int s, int d)
    {
	boolean[] marked = new boolean[G.V()];
	Path(G, s, d);
	return marked[d];
    }

    private void Path(Graph G, int s, int d)
    {
	marked[s] = true;
	if(s == d)
	    return;
	for(Integer x : G.adj(s))
	{
	    
	    if(!marked[x])
	    {
		Path(G, x, d);
	    }
	}
    }

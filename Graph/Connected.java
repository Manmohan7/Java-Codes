import java.util.*;

public class Connected
{
    private int[] id;
    private int count;
    private boolean[] marked;

    public Connected(Graph g)
    {
        this.id = new int[g.V()];
        this.count = 0;
        this.marked = new boolean[g.V()];
        for(int i = 0; i < g.V(); i++)
        {
            if(!marked[i])
            {
                dfs(g,i);
                count++;
            }
        }
    }

    private void dfs(Graph g, int x)
    {
        this.id[x] = this.count;
        this.marked[x] = true;
        for(Integer w : g.adj(x))
        {
            if(!marked[w])
                dfs(g,w);
        }
    }

    public boolean isConnected(int x, int y)
    {
        return (id[x] == id[y]);
    }

    public int totalGraphs()
    {
        return this.count;    // returns the no of graphs
    }
}

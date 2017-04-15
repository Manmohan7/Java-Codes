import java.util.LinkedList;

public class Graph
{
    private LinkedList<Integer>[] adj;
    private int v;    // no of vertices
    private int e;    // no of edges

    public Graph(int v)
    {
        this.v = v;
        this.adj = new LinkedList[v];
        for(int i = 0; i < v; i++)
        {
            this.adj[i] = new LinkedList();
        }
        this.e = 0;
    }
    public void addEdge(int v, int w)
    {
        this.adj[v].add(new Integer(w));
        this.adj[w].add(new Integer(v));
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

    public Iterable<Integer> adj(int v)
    {
        return this.adj[v];
    }

    public int degree(int x)
    {
        return adj[x].size();
    }

    public void adjList(int x)
    {
        for(Integer w : adj[x])
            System.out.print(w + " ");
        System.out.println();
    }
}

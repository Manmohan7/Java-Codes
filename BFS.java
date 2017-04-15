import java.util.*;

public class BFS 
{
    private boolean[] marked;
    private int[] edgeTo;
    BFS(Graph G,int s)
    {
	this.marked = new boolean[G.V()];
	this.edgeTo = new int[G.V()];
	for(int i = 0; i < G.V(); i++)
	{
	    this.edgeTo[i] = Integer.MAX_VALUE;	
	}
	bfs(G,s);		
    }
    
    private void bfs(Graph G,int s)
    {
	this.marked[s] = true;
	Queue q = new LinkedList();
	q.add(s);
	while(!q.isEmpty())
	{
	    int w;
	    w = (int)q.poll();	
	    for(Integer v: G.adj(w))
	    {
		if(!(this.marked[v]))
		{
		    this.marked[v] = true;
		    this.edgeTo[v] = w;
		    q.add(v);
		}
	    }
	}	
    }
	
    void path(int destination)
    {
	if(marked[destination] == false)
	{
	    System.out.println("path not exit");
	}
	else if(edgeTo[destination] == Integer.MAX_VALUE)
	{
	    System.out.println(destination);
	    return;
	}
	else
	{		
	    path(edgeTo[destination]);
	    System.out.println(destination+" ");
	}
    }
    public static void main(String[] args)
    {
	Graph G=new Graph(6);
	G.addEdge(0,2);
	G.addEdge(0,4);
	G.addEdge(0,5);
	G.addEdge(2,3);
	
	DFS d1=new DFS(G,0);
	d1.path(3);
	
    }
}


import java.util.*;

public class test
{
    public static void main(String[] args)
    {
	Graph g = new Graph(6);
	g.addEdge(1,2);
	g.addEdge(1,4);
	g.addEdge(2,4);
	g.addEdge(1,5);
	g.addEdge(5,3);
	g.addEdge(0,3);
	Connected cc = new Connected(g);
	System.out.println(cc.isConnected(4,3));
	System.out.println(cc.totalGraphs());
	System.out.println(g.degree(3));
	g.adjList(4);
    }
}

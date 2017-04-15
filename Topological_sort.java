import java.util.*;

class Topological
{
    void sort(Graph g)
    {
	for(int i = 0; i < g.V(); i++)
	{
	    if(!marked[i])
	    {
		dfs(g,i);
	    }
	}	
    }

    

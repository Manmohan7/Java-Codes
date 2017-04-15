import java.util.*;

class Treeset
{
    public static void main(String[] args)
    {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(4);
	ts.add(6);
	ts.add(2);
	ts.add(1);
	for(Integer w : ts)
	    System.out.println(w);
    }
}

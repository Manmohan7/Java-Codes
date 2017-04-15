public class Selection extends MySort
{
    public Selection(int[] arr)
    {
	super.a = arr;
    }
    public void sort()
    {
	for(int i = 0; i < a.length; i++)
	{
	    for(int j = 0; j < a.length - 1; j++)
	    {
		if(a[j] > a[j+1])
		{
		    swap(a, j, j+1);
		}
	    }
	}
    }
}

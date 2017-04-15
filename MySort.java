public abstract class MySort
{
    protected int[] a;
    /*public MySort(int[] a)
    {
	this.a = a;
    }*/
    protected void swap(int[] a, int i, int j)
    {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }
    protected void print()
    {
	for(int i = 0; i < a.length; i++)
	    System.out.print(a[i] + " ");
    }
    abstract void sort();
}

class Sort
{
    public static void main(String[] args)
    {
	int[] arr = {8, 2, 6, 4, 9};
	MySort s = new Selection(arr);
	s.sort();
	s.print();
	System.out.println("");
    }
}

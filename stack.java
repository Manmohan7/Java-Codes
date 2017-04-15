import java.util.Scanner;
class abc
{
    private int top = -1;
    private int arr[] = new int[5];
    Scanner s = new Scanner(System.in);
    public void push()
    {
	top++;
	if(top == 5)
	{
	    System.out.println("Overflow");
	    top--;
	}
	else
	    arr[top] = s.nextInt();
    }
    
    public void pop()
    {
	if(top == -1)
	    System.out.println("Underflow");
	else
	    System.out.println(arr[top--]);
    }
    
};

class stack
{
    public static void main(String[] args)
    {
	abc st = new abc();
	Scanner s = new Scanner(System.in);
        System.out.println("1. Push\n2. Pop");
	int op = s.nextInt();
	while(op == 1 || op == 2)
	{
	    if(op == 1)
	    {
		st.push();
	    }
	    else if(op == 2)
		st.pop();
	    System.out.println("1. Push\n2. Pop");
	    op = s.nextInt();
	}
    }
};
    

import java.util.Stack;

class stack
{
    public static void main(String[] args)
    {
        Stack s = new Stack();

        // empty() - returns boolean
        System.out.println(s.empty());

        // push(element) - returns the element entered
        s.push(1);
        s.push(5);
        s.push(9);
        s.push(4);
        s.push(7);
        System.out.println(s.push(2));

        // peek() - returns object on top of stack
        System.out.println(s.peek());

        // pop() - returns object on top of stack
        System.out.println(s.pop());

        // search(element) - returns int counting from 1 and top of stack
        System.out.println(s.search(2));    // if not found returns -1
    }	
}

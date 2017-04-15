import java.util.*;

class test
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        PriorityQueue<int> pq = new PriorityQueue<>( Collections.reverseOrder());
        int n = s.nextInt();
        while(n != -1)
        {
            pq.add(n);
            n = s.nextInt();
        }
        while(pq.size() != 0)
        {
            System.out.println(pq.remove());
        }
    }
}

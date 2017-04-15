class Process
{
    private String pName;
    private int pid;
    Process(String name, int pid)
    {
        this.pName = name;
        this.pid = pid;
    }
    //without toString() function this code will print name of class with its memory reference
    public String toString()    
    {
        return this.pName;
    }
    public static void main(String[] args)
    {
        Process p = new Process("Process", 1);
       System.out.println(p);
    }
}

class Priority implements Comparable
{
    private int avgTime;
    private int totalTime;

    Priority(int avg, int total)
    {
	this.avgTime = avg;
	this.totalTime = total;
    }
    public int compareTo(Object o)
    {
	Priority p = (Priority)o;
	if(this.avgTime > p.avgTime) return 1;
	if(this.avgTime < p.avgTime) return -1;
	return 0;
    }
}

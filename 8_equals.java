class A
{
}

A a1 = new A();
A a2 = new A();
A a3 = a2;

a1 == a2 -> false
a2 == a3 -> true

it is same as - 
a1.equals(a2); -> false
a2.equals(a3); -> true


Integer i1 = new Integer(5);
Integer i2 = new Integer(5);

i1 == i2 -> false
i1.equals(i2) -> true

== it compares the reference of the objects

final class Integer
{
    private int x;
    public boolean equals(Object o)
    {
	if( (o instance of Integer) && (Integer(o).x == this.x) )
	    return true;
	retur false;
    }
}

while making this equals function, we should be careful
    and follow some properties
1.    x.equals(x) -> true
2.    if x.equals(y) is true then y.equals(x) should be true
3.    if x.equals(y) and y.equals(z) is true then x.equals(z) should be true



in a red black tree, 3 nodes are possible
    

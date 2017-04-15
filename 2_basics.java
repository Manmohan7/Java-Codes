Variable name
can contain letters, _, $, digits
variable name cannot start with digits

class name should start with a capital letter
use camel casing

class Stack
object - Stack stackClient

there cannot be multiple public classes nd its name should match the name of file

there are only 2 class access specifier in java
1. public
2. default - it means within the package

in java there is no protected or private specifier

java is strongly typed language
that is it checks for many errors during compilation

package pkg1
class A
{
    void foo()
    {
        System.out.print("Hello");
    }
}

package pkg2
import pkg1;
class B
{
    p s v m(String args[])
    {
        foo();
    }
}

the above code will produce error unless and until
1. make the class A as public
    OR
2. place both the files in same package

package pkg1
public class A
{
    int x;
    private int y;
    protected int z;
    public int w;
}

class B
{
    A a = new A();
    a.x = 5;    
    a.y = 6;    //this will give an error as its scope is only within the class A
    a.z = 7;
    a.w = 8;
}

Q. if we inherit class B from A then
    only Private element will give an error

Q. if we place them in diff packages then
    only public will work fine rest will give an error

Q. if we place them in diff packages and inherit B from A then
    public and protected will work fine

Keywords that work fine with classes
1. absract - cannot create an object of this class
    we can have function declaration as well as function definition
    eg abstract class A
    an abstract class can have non abstract functions
    a class which inherits an abstract class may or may not implement the methods of abstract class

2. interface

java has three types of class loader
1. application
2. extension
3. root

method to implement inheritance
class A extends B
{
    |
    |
};

declaring an object of class is a costly operation
eg.
A a = new A();

Instead we can create an object pool, so that whenever we need to make an object it will fetch it from the pool


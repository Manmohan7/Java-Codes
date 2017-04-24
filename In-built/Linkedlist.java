import java.util.*;

// Doubly LinkedList is created. Implements List and Deque
class Linkedlist
{
    public static void main(String[] args)
    {
        // constructor
        LinkedList l = new LinkedList();    // LinkedList<String> l = new LinkedList<String>();

        // constructor
        LinkedList ll = new LinkedList(Collection l);    // creates a list containing elements of collection in the order they are returned by Collection's iterator

        // boolean add(element)
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        System.out.println(l.add("e"));
        System.out.println(l);

        // add(index, element) - returns void
        // if index is out of bounds throws IndexOutOfBoundsException
        l.add(0,"0");    // add at specified position
        l.add(1,"1");
        System.out.println(l);

        // addFirst(element) - returns void
        l.addFirst("f");    // add at first position

        // addLast(element) - returns void
        l.addLast("l");    // add at last position
        System.out.println(l);

        // addAll(Collection c) - returns boolean
        // throws NullPointerException is collection is empty
        Collection col = new ArrayList();
        col.add("arr");
        col.add(1);
        l.addAll(col);    // add a list at back
        System.out.println(l);

        // addAll(Collection c) - returns boolean
        LinkedList col3 = new LinkedList();
        col3.add("A");
        col3.add("B");
        col3.add("C");
        col3.add("D");
        l.addAll(col3);
        System.out.println(l);

        // addAll(index, collection) - returns boolean
        // throws IndexOutOfBoundsException and NUllPointerException
        ArrayList col2 = new ArrayList();
        col2.add("arr");
        col2.add(2);
        l.addAll(0,col2);    // add a list at a particular index
        System.out.println(l);

        // Copy Constructor
        Collection col5 = new LinkedList(col3);
        System.out.println(col5);

        // clone() - returns Object
        Collection col4 = new LinkedList();
        col4 = (LinkedList) col3.clone();    // make a clone a list col3
        System.out.println(col4);

        // size() - returns int
        System.out.println(col3.size());    // returns the number of elements

        // contains(element) - returns boolean
        System.out.println(col3.contains("A"));

        // get(index) - returns Object of element where index starts from 0
        System.out.println(col3.get(1));    // returns the element at given index

        // getFirst() - returns object of element
        System.out.println(col3.getFirst());    // returns the first element

        // getLast() - returns object of element
        System.out.println(col3.getLast());    // returns the element at last position

        // indexOf(element) - returns int
        System.out.println(l.indexOf("arr"));    // returns the index of element if found else -1

        // lastIndexOf(element) - returns int
        System.out.println(l.lastIndexOf("arr"));    // returns the last index of element if found else -1

        // set(index, element) - returns old element
        col3.set(3, "E");
        System.out.println(col3);
        col3.set(3, "D");

        // If the list is altered(not using the iterator) after the iterator is created then it will throw an exception ConcurrenytModificationException
        // listIterator(index) - returns iterator starting from index
        Iterator itr = col3.listIterator(2);
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();

        // toArray() - returns array of Object
        Object[] s = new Object[col3.size()];
        s = col3.toArray();
        //Object[] s = col3.toArray();
        for(int i = 0; i < col3.size(); i++)
            System.out.print(s[i] + " ");
        System.out.println();

        // toArray(variable) - returns array of datatype specified by the variable
        Object[] s2 = new Object[col3.size()];
        s2 = col3.toArray(s2);
        //Object[] s = col3.toArray(s2);
        for(int i = 0; i < col3.size(); i++)
            System.out.print(s2[i] + " ");
        System.out.println();

        // remove(index) - returns object of element
        col3.remove(2);    // removes the element at index
        System.out.println(col3);
        col3.add(2,"C");

        // remove(element) - returns boolean
        col3.remove("B");
        System.out.println(col3);
        col3.add(1,"B");

        // removeFirst() - returns object of element
        col3.removeFirst();    // remove from first position    
        System.out.println(col3);
        col3.add(0,"A");

        // removeLast() - returns object of element
        col3.removeLast();    // remove from last position
        System.out.println(col3);
        col3.add(3,"D");

        // clear()
        col3.clear();    // removes all the elements
        System.out.println(col3);

    }
}

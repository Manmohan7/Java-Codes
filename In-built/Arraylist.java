import java.util.*;

class Arraylist extends ArrayList    // extends is used because removeRange function is protected
{
    public static void main(String[] args)
    {
        // constructor 
        ArrayList arr = new ArrayList();  // creates an empty list with default size 10
        ArrayList<Integer> arrx = new ArrayList<Integer>();  // this defines it will contain integer only
        // By specifying the data type of the arraylist we can also use Collections.sort(arraylist) to sort it

        // copy constructor
        ArrayList<Integer> arr2 = new ArrayList<Integer>(arr);    // this specifies that it contains integers
        // arr2.add("a");    // this will return an error
        System.out.println(arr2);

        // specified Capacity constructor
        ArrayList arr3 = new ArrayList(3);    // it can store 3 elements but capacity increases as we add elements

        // add(element) - returns boolean
        // adds element at the end of list
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        System.out.println(arr);

        // add(index, element) - returns void
        // adds the element at the specified index and shifts the rest of the list to right
        // throws IndexOutOfBoundsException
        arr.add(4,"e");    // index is 0 based
        arr.add(5,"f");
        System.out.println(arr);

        // addAll(collection) - returns boolean
        // adds the Collection at the end of the list
        // throws NullPointerException if Collection is null
        Collection col = new ArrayList();
        col.add(1);
        col.add(2);
        arr.addAll(col);
        System.out.println(arr);

        // addAll(index, collection) - returns boolean
        // adds the Collection starting from the index specified
        // throws NullPointerException if Collection is null
        // throws IndexOutOfBounds
        Collection col2 = new ArrayList();
        col2.add(3);
        col2.add(4);
        arr.addAll(8, col2);
        System.out.println(arr);

        // clear() - returns void
        // removes all the elements
        arr.clear();
        System.out.println(arr);

        // clone() - returns Object
        // creates a shallow copy any change in arr will be reflected in arr4
        ArrayList arr4 = (ArrayList) arr.clone();
        System.out.println(arr4);    // any change in arr4 will not be reflected in arr

        // contains(element) - return boolean
        // checks if element is present in list
        System.out.println(arr.contains(1));
        
        // ensureCapacity(minCapacity) - returns void
        // increases the capacity of arraylist to minimum of minCapacity given
        arr.ensureCapacity(12);    
        System.out.println(arr.size());

        // get(index) - returns element
        // fetch data from given index
        // throws IndexOutOfBoundsException
        System.out.println(arr.get(1));  

        // indexOf(element) - returns index of first occurence of element else -1
        System.out.println(arr.indexOf("e"));

        // isEmpty() - returns boolean
        // checks if list is empty
        arr.isEmpty();

        // iterator() - returns Iterator<E>
        // throws ConcurrentModificationException if list is modified
        Iterator<>

        // lastIndexOf(element) - returns last index of element
        System.out.println(arr.lastIndexOf("c"));

        // size() - returns number of elements
        System.out.println(arr.size());

        // set(index, element) - returns old element
        System.out.println(arr.set(5,"x"));  // change the value at given index


        // toArray() - returns Object[]
        Object[] arr5 = arr.toArray();
        for(int i = 0; i < arr.size(); i++)
            System.out.print(arr5[i] + " ");
        System.out.println();

        // toArray(Object) - returns Object[]
        Object[] arr6 = new Object[arr.size()];
        arr6 = arr.toArray(arr6);
        for(int i = 0; i < arr.size(); i++)
            System.out.print(arr6[i] + " ");
        System.out.println();

        // trimToSize() - returns void
        arr.trimToSize();    // reduces the size of the arraylist to accomodate the current elements

        // remove(index) - returns element
        System.out.println(arr.remove(5));

        // removeRange(from index, to index) - returns void
        // arr.removeRange(5,8);    // this will not work if ArrayList is not extended as it is protected
        System.out.println(arr);    // removes the elements including from-index and excluding to-index

    }
}

import java.lang.String;

class string
{
    public static void main(String[] args)
    {
        String s = new String();

        String s1 = s;

        // new String(char[] char)
        char[] hello = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(hello);  // s2 = Hello

        // new String(char[] char, startIndex, numOfChars)
        String s3 = new String(hello, 1, 3);  // s3 = ell
        
        // new String(String)
        String s4 = new String(s3);  // s4 = ell

        // new String(byte[] ascii)
        byte[] ascii = {65, 66, 67, 68};
        String s5 = new String(ascii);  // s5 = ABCD

        // new String(byte[] ascii, startIndex, numOfChars)
        String s6 = new String(ascii, 1, 2);  //s6 = BC

        // char charAt(index)
        s2.charAt(1);

        // int compareTo(Object o)
        s2.compareTo(s3);  //  - if s2 < s3
                           //  0 if s3 = s2
                           //  + if s2 > s3

        // int compareTo(String)
        // same as above

        // int compareToIgnoreCase(String)
        s2.compareToIgnoreCase(s4);  // ignores case differences

        // String concat(String str)
        s2.concat(s4);
        "My name is ".concat("Manmohan");

        // boolean contentEquals(StringBuffer sb)
        // returns s3 == s4
        s3.contentEquals(new StringBuffer(s4));  //true
        
        // static String copyValueOf(char[] data)
        // replaces the current string with new value
        s4.copyValueOf(hello);  // Hello

        // boolean endsWith(String)
        s5.endsWith("D");  // true

        // boolean equals(Object o)
        s3.equals(s4);  // true

        // boolean equalsIgnoreCase(String)
        s3.equals(s4); // true

        // byte[] getBytes()
        byte[] arr = s5.getBytes();  // arr = {65, 66, 67, 68}

        // void getChars(int srcBegin, int srcEnd, char[] str, int destBegin)
        char[] str = new char[7];
        s2.getChars(0, 4, str, 0);  // str = {'h', 'e', 'l', 'l', 'o'}

        // int indexOf(char ch)
        // if not found returns -1
        s3.indexOf('e');  // returns 0

        // int indexOf(char ch, int fromIndex)
        // searching starts from fromIndex (inclusive)
        s2.indexOf('l', 3);  // returns 3

        // int indexOf(String str)
        s2.indexOf("lo");  // returns 3

        // int indexOf(String str, int fromIndex)
        s2.indexOf("llo", 1);  // returns 1

        // int lastIndexOf(char ch)
        s2.lastIndexOf('l');  // returns 3

        // int lastIndexOf(char ch, int fromIndex)
        s2.lastIndexOf('l', 2);  // returns 3

        // int lastIndexOf(String str)
        s2.lastIndexOf("ll");  // returns 2

        // int lastIndexOf(String str, int fromIndex)
        s2.lastIndexOf("ll", 3);  // returns -1

        // int length()
        System.out.println(s3.length());


    }
}

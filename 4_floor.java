floor
Largest value that is smaller than the given value

Node floor(Node x, int val)
{
    if(x == null)
        return null;
    if(x.val == val)
        return x;
    else if(val < x.val)
        return florr(x.left, val);
    else
    {
        Node t = floor(x.right, val);
        if(t != null)
        return t;
        return x;
    }
}

Depth First Search
going all the way down from root on one path
this is done using stack

Breadth First search
going level by level
this is done using queue



class BST {

    private Node root;
    private static final boolean Red = true;
    private static final boolean Black = false;

    private class Node {
	private final int key;
	private Node right;
	private Node left;
        private int N;
        private boolean color;

	public Node(int key, boolean color) {
	    this.key = key;
            N = 1;
            this.color = color;
        }
    }

    private boolean isRed(Node x)
    {
	if(x == null) return false;
	return x.color == Red;
    }

    private void flipColor(Node x)
    {
	x.left.color = Black;
	x.right.color = Black;
	x.color = Red;
    }

    private Node rotateLeft(Node x)

    {
	Node h = x.right;
	x.right = h.left;
	h.left = x;
	h.color = x.color;
	x.color = Red;
	return h;
    }


    private Node rotateRight(Node x)
    {
	Node h = x.left;
	x.left = h.right;
	h.right = x;
	h.color = x.color;
	x.color = Red;
	return h;
    }

    public void insert(int key) {
	root = insert(root, key);
    }

    private Node insert(Node x, int key) {
        if (x == null)
	    return new Node(key, Red);
	if (key < x.key)
	    x.left = insert(x.left, key);
	else if (key > x.key)
	    x.right = insert(x.right, key);
	
	if(isRed(x.right) && !isRed(x.left))
	    x = rotateLeft(x);
	if(isRed(x.left) && isRed(x.left.left))
	    x = rotateRight(x);
	if(isRed(x.left) && isRed(x.right))
	    flipColor(x);
	
	x.N = 1 + sizeOf(x.left) + sizeOf(x.right);
	return x;
    }
    public void inOrder() {
	inOrder(root);
	System.out.println("");
    }

    private void inOrder(Node x) {
	if (x == null) return;
	inOrder(x.left);
	System.out.print(x.key + " ");
	inOrder(x.right);
    }

    public int height()
    {
	return height(root);
    }

    private int height(Node x)
    {
	if(x == null) return 0;
	return 1 + (height(x.left) > height(x.right) ? height(x.left) : height(x.right)) ;
    }

    public static void main(String[] args) {
	BST bst = new BST();
	bst.insert(5);
	bst.insert(4);
	bst.insert(3);
	bst.insert(2);
	bst.insert(1);
	bst.inOrder();
	System.out.println(bst.height());
    }
}

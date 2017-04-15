// tree inorder
void inOrder(Node n)
{
    if (n == null)
        return;
    inOrder(.left);
    print n.key;
    inOrder(n.right);
}

// tree preorder
void preOrder(Node n)
{
    if (n == null)
	return;
    print n.key;
    preOrder(n.left);
    preOrder(n.right);
}

//tree postorder
void postOrder(Node N)
{
    if (n == null)
	return;
    postOrder(n.left);
    postOrder(n.right);
    print n.key;
}

//level order
void levelOrder(Node n)
{
    Queue q = new Queue();
    q.push_back(root);
    while( !q.isEmpty() )
    {
	Node x = q.pop();
	print x.key;
	if(x.left != null)
	    q.push_back( x.left );
	if(x.right != null)
	    q.push_back(x.right);
    }
}

import org.w3c.dom.Node;

public class BST {
    private int info;
    private Node left;
    private Node right;

    public static class Binary {
        int info;
        Node left;
        Node right;
    }

    public void Binary(int info){
        this.info = info;
        this.left = null;
        this.right = null;
    }

    public Node root;

    public BST(){
        root = null;
    }

    public void inserted(int info){
        root = insertRec(root, info);
    }

    private Node insertRec(Node root, int info) {
        if (root == null)
        {
            root = new Node(info);
            return root;
        }
        if (info < root.info)
            this.left = insertRec(root.left, info);
        else if (info > root.info)
            this.right = insertRec(root.right, info);

        return root;
    }
    public void inOrder()
    {
        inOrderRec(root);
    }
    private void inOrderRec(Node root)
    {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.info);
            inOrderRec(root.right);
        }
    }

}

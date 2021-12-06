public class BSTdriver {
    public static void main(String[] args){
        BST tree = new BST();
        tree.inserted(5);
        tree.inserted(3);
        tree.inserted(2);
        tree.inserted(4);
        tree.inserted(7);
        tree.inserted(6);
        tree.inserted(8);
        tree.inOrder();
    }
}

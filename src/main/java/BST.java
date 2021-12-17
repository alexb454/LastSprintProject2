//public class BST {
//
//    public static class Node {
//        int info;
//        Node left;
//        Node right;
//
//        public Node(int info) {
//            this.info = info;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public Node root;
//
//    public BST() {
//        root = null;
//    }
//
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (root == null) {
//            root = newNode;
//            return;
//        } else {
//            Node current = root, parent = null;
//
//            while (true) {
//                parent = current;
//                if (data < current.info) {
//                    current = current.left;
//                    if (current == null) {
//                        parent.left = newNode;
//                        return;
//                    }
//                }
//                else {
//                    current = current.right;
//                    if (current == null) {
//                        parent.right = newNode;
//                        return;
//                    }
//                }
//            }
//        }
//    }
//    public Node minNode(Node root) {
//        if (root.left != null)
//            return minNode(root.left);
//        else
//            return root;
//    }
//    public Node deleteNode(Node node, int value) {
//        if (node == null) {
//            return null;
//        } else {
//            if (value < node.info)
//                node.left = deleteNode(node.left, value);
//            else if (value > node.info)
//                node.right = deleteNode(node.right, value);
//            else {
//                if (node.left == null && node.right == null)
//                    node = null;
//                else if (node.left == null) {
//                    node = node.right;
//                }
//                else if (node.right == null) {
//                    node = node.left;
//                }
//                else {
//                    Node temp = minNode(node.right);
//                    node.info = temp.info;
//                    node.right = deleteNode(node.right, temp.info);
//                }
//            }
//            return node;
//        }
//    }
//    public void inorderTraversal(Node node) {
//        if (root == null) {
//            System.out.println("The Tree is empty, my dude");
//            return;
//        } else {
//            if (node.left != null)
//                inorderTraversal(node.left);
//            System.out.print(node.info + " ");
//            if (node.right != null)
//                inorderTraversal(node.right);
//
//        }
//    }
//}

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class BSTtest {
}

class BSTTest {
    @Test
    void testConstructor() {
        assertNull((new BST()).root);
    }

    @Test
    void testInsert() {
        BST bst = new BST();
        bst.insert(1);
        BST.Node node = bst.root;
        assertEquals(1, node.info);
        assertNull(node.right);
        assertNull(node.left);
    }

    @Test
    void testInsert2() {
        BST bst = new BST();
        bst.insert(0);
        bst.insert(1);
        BST.Node node = bst.root.right;
        assertNull(node.right);
        assertNull(node.left);
        assertEquals(1, node.info);
    }

    @Test
    void testInsert3() {
        BST bst = new BST();
        bst.insert(0);
        bst.insert(0);
        bst.insert(1);
        BST.Node node = bst.root.right.right;
        assertNull(node.left);
        assertEquals(1, node.info);
        assertNull(node.right);
    }

    @Test
    void testInsert4() {
        BST bst = new BST();
        bst.insert(0);
        bst.insert(-1);
        BST.Node node = bst.root.left;
        assertEquals(-1, node.info);
        assertNull(node.right);
        assertNull(node.left);
    }

    @Test
    void testInsert5() {
        BST bst = new BST();
        bst.insert(1);
        bst.insert(0);
        bst.insert(-1);
        BST.Node node = bst.root.left.left;
        assertEquals(-1, node.info);
        assertNull(node.right);
        assertNull(node.left);
    }

    @Test
    void testMinNode() {
        BST bst = new BST();
        BST.Node node = new BST.Node(1);
        assertSame(node, bst.minNode(node));
    }

    @Test
    void testDeleteNode() {
        BST bst = new BST();
        BST.Node node = new BST.Node(1);
        BST.Node actualDeleteNodeResult = bst.deleteNode(node, 42);
        assertSame(node, actualDeleteNodeResult);
        assertNull(actualDeleteNodeResult.right);
    }

    @Test
    void testDeleteNode2() {
        BST bst = new BST();
        assertNull(bst.deleteNode(new BST.Node(42), 42));
    }

    @Test
    void testDeleteNode3() {
        BST bst = new BST();
        BST.Node node = new BST.Node(1);
        BST.Node actualDeleteNodeResult = bst.deleteNode(node, 0);
        assertSame(node, actualDeleteNodeResult);
        assertNull(actualDeleteNodeResult.left);
    }

    @Test
    void testInorderTraversal() {
        BST bst = new BST();
        BST.Node node = new BST.Node(1);
        bst.inorderTraversal(node);
        assertEquals(1, node.info);
    }

    @Test
    void testInorderTraversal2() {
        BST bst = new BST();
        bst.insert(0);
        BST.Node node = new BST.Node(1);
        bst.inorderTraversal(node);
        assertEquals(1, node.info);
        assertEquals(0, bst.root.info);
    }

    @Test
    void testNodeConstructor() {
        BST.Node actualNode = new BST.Node(1);
        assertEquals(1, actualNode.info);
        assertNull(actualNode.right);
        assertNull(actualNode.left);
    }
}


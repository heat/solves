import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreePreOrderInOrderTest {


    @Test
    public void testCase0() {
        int[] preorder = new int[]{1, 2};
        int[] inorder = new int[]{2, 1};

        BinaryTreePreOrderInOrder executor = new BinaryTreePreOrderInOrder();
        BinaryTreePreOrderInOrder.TreeNode actual = executor.buildTree(preorder, inorder);

        BinaryTreePreOrderInOrder.TreeNode expected = new BinaryTreePreOrderInOrder.TreeNode(1);
        expected.left = new BinaryTreePreOrderInOrder.TreeNode(2);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void testCase1() {
        int[] preorder = new int[]{1, 2, 3};
        int[] inorder = new int[]{2, 3, 1};

        BinaryTreePreOrderInOrder executor = new BinaryTreePreOrderInOrder();
        BinaryTreePreOrderInOrder.TreeNode actual = executor.buildTree(preorder, inorder);

        BinaryTreePreOrderInOrder.TreeNode expected = new BinaryTreePreOrderInOrder.TreeNode(1);
        expected.left = new BinaryTreePreOrderInOrder.TreeNode(2);
        expected.right = new BinaryTreePreOrderInOrder.TreeNode(3);
        assertTrue(expected.equals(actual));
    }
}

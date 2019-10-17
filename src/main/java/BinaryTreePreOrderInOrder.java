import java.util.*;
import java.util.stream.Collectors;

public class BinaryTreePreOrderInOrder {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public int hashCode() {
            int result = val;
            result = 31 * result + left.hashCode();
            result = 31 * result + right.hashCode();
            return result;
        }
    }

    public int search(int[] arr, int start, int end, int val) {
        for (int i = start; i < end; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode f(ArrayDeque<Integer> queue, int start, int end, int[] inorder) {

        if (start == end) {
            return null;
        }
        int rootv = queue.pop();

        TreeNode root = new TreeNode(rootv);

        int pivot = search(inorder, start, end, rootv);
        // System.out.printf("rootv= %d pivot=%d start=%d end=%d\n", rootv, pivot, start, end );

        root.left = f(queue, start, pivot, inorder);
        root.right = f(queue, pivot + 1, end, inorder);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {


        if (preorder.length == 0) {
            return null;
        }
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>(Arrays.stream(preorder).boxed().collect(Collectors.toList()));

        int rootv = queue.pop();

        TreeNode root = new TreeNode(rootv);

        int pivot = search(inorder, 0, inorder.length, rootv);

        root.left = f(queue, 0, pivot, inorder);
        root.right = f(queue, pivot + 1, inorder.length, inorder);
        return root;
    }
}

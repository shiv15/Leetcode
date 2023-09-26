//  Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

class BinaryTreePaths {
    private void printPermutations(TreeNode root, String subtree, List<String> output) {
        if (root != null && root.left == null && root.right == null) {
            output.add(subtree);
            return;
        }
        if (root.left != null) {
            printPermutations(root.left, subtree + "->" + root.left.val, output);
        }
        if (root.right != null) {
            printPermutations(root.right, subtree + "->" + root.right.val, output);
        }

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> output = new ArrayList<>();
        printPermutations(root, "" + root.val, output);
        return output;
    }

    public static void main(String[] args) {
        BinaryTreePaths b = new BinaryTreePaths();
        TreeNode t = new TreeNode();
        t.val = 1;
        t.left = new TreeNode();
        t.left.val = 2;
        t.left.right = new TreeNode();
        t.left.right.val = 5;
        t.right = new TreeNode();
        t.right.val = 3;

        List<String> result = b.binaryTreePaths(t);
        System.out.println(result);
    }
}
package top150;

import java.util.*;

public class BuildTreeInorderPostorder {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private int postIndex;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int left, int right) {

        if (left > right) return null;

        int val = postorder[postIndex--];

        TreeNode root = new TreeNode(val);

        int index = map.get(val);

        root.right = build(postorder, index + 1, right);
        root.left = build(postorder, left, index - 1);

        return root;
    }
}
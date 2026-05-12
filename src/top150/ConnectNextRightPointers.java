package top150;

import java.util.*;

public class ConnectNextRightPointers {

    static class Node {
        int val;
        Node left, right, next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node connect(Node root) {

        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            Node prev = null;

            for (int i = 0; i < size; i++) {

                Node curr = queue.poll();

                if (prev != null) {
                    prev.next = curr;
                }

                prev = curr;

                if (curr.left != null)
                    queue.offer(curr.left);

                if (curr.right != null)
                    queue.offer(curr.right);
            }
        }

        return root;
    }
}
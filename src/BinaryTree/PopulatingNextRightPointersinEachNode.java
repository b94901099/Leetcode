/*
 * Given a binary tree structure
 * TreeLinkNode {
 TreeLinkNode *left;
 TreeLinkNode *right;
 TreeLinkNode *next;
 }
 * Populate each next pointer to point to its next right node. If there is no next right node, 
 * the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 * Note:
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children)
 * For example,
 * Given the following perfect binary tree,
 *     1
 *    /  \
 *   2    3
 *  / \  / \
 * 4  5  6  7
 * After calling your function, the tree should look like:
 *     1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \  / \
 * 4->5->6->7 -> NULL
 */
package BinaryTree;

import java.util.*;

public class PopulatingNextRightPointersinEachNode {

    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeLinkNode cur = queue.poll();
                if (i == size - 1) {
                    cur.next = null;
                } else {
                    cur.next = queue.peek();
                }

                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
        }
    }

    private static class TreeLinkNode {

        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;
    }

    public static void main(String[] args) {
    }
}

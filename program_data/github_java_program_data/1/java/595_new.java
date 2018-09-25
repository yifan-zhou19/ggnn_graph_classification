package org.au9ustine.puzzles.leetcode.P20121009;

import org.au9ustine.puzzles.leetcode.commons.TreeNode;

/**
 * Minimum Depth of Binary Tree
 * Created by shaotch on 12/3/2014.
 */
public class SolutionImpl implements Solution {
    @Override
    public int minDepth(TreeNode root) {
        return bfs(root);
    }

    public int bfs(TreeNode root) {
        if (root == null)
            return 0;
        if (root.right == null)
            return bfs(root.left) + 1;
        if (root.left == null)
            return bfs(root.right) + 1;
        return Math.min(bfs(root.left), bfs(root.right)) + 1;

    }
}

package LeecodeEasyQ;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import static java.lang.Math.max;

/**
 * Created by yifanfan on 15/09/15.
 */
public class MaximumDepthBT {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int maxLeft=maxDepth(root.left);
        int maxRight=maxDepth(root.right);
        return max(maxLeft+1,maxRight+1);
    }
}

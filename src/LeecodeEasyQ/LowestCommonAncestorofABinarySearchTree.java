package LeecodeEasyQ;

import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by yifanfan on 11/08/15.
 */
public class LowestCommonAncestorofABinarySearchTree {
    public TreeNode lowestCommonAncestorBinarySearchTree(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val - p.val)*(root.val - q.val) <= 0) {return root;}
        else if (root.val - p.val > 0) {return lowestCommonAncestorBinarySearchTree(root.left, p, q);}
        else {return lowestCommonAncestorBinarySearchTree(root.right, p, q);}
    }

    Hashtable gol_table= new Hashtable();

    public TreeNode lowestCommonAncestorBinaryTree(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> pStack= new Stack<TreeNode>();
        Stack<TreeNode> qStack= new Stack<TreeNode>();
        TreeNode result= null;
        if(findPath(root,p,pStack) && findPath(root,q,qStack)){
            while(!pStack.isEmpty()){
                TreeNode tem=pStack.pop();
                if(qStack.contains(tem)){
                   result=tem;
                }
            }
        }
        return result;

    }

    public boolean findPath(TreeNode root, TreeNode node,  Stack<TreeNode> nodeStack){
         if(root ==null){
             return false;
         }

         if(root == node ){
            nodeStack.push(root);
             return true;
         }else if(findPath(root.left,node,nodeStack) ||findPath(root.right,node,nodeStack)){
             nodeStack.push(root);
             return true;
         }
        return false;
    }
}

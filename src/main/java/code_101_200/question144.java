package code_101_200;

import java.util.ArrayList;
import java.util.List;

public class question144 {


    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    List<Integer> res = new ArrayList<>();

    // solution 1:
    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }

    public void helper(TreeNode node){
        if( node == null){
            return;
        }

        res.add(node.val);
        helper(node.left);
        helper(node.right);
    }


    // solution 2:
}

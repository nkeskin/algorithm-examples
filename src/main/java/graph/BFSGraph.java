package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BFSGraph {

  //TODO : Fix implementation, does not work
  public List<List<Integer>> levelOrder(TreeNode root) {
    return traverse(root);
  }

  public static List<List<Integer>> traverse(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    List<Integer> vals = new ArrayList<>();
    LinkedList<TreeNode> queue = new LinkedList<>();
    int level = 0;
    int counter = 2;
    TreeNode node = root;
    queue.add(node);
    vals.add(node.val);
    result.add(vals);
    vals = new ArrayList<>();
    while (!queue.isEmpty()) {
      node = queue.remove();
      if (node.left != null) {
        queue.add(node.left);
        vals.add(node.left.val);
      }
      if (node.right != null) {
        queue.add(node.right);
        vals.add(node.right.val);
      }
      level++;
      level++;
      if(level == counter) {
        level = 0;
        counter = counter * 2;
        if(!vals.isEmpty()){
          result.add(vals);
        }
        vals = new ArrayList<>();
      }
    }
    return result;
  }

}

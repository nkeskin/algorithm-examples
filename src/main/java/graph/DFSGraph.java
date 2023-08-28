package graph;

import java.util.ArrayList;
import java.util.List;

public class DFSGraph {

  public boolean isValidBST(TreeNode root) {
    List<TreeNode> lst = new ArrayList<>();
    lst = traverse(root, lst);
    return checkListVal(lst);
  }

  public static List<TreeNode> traverse(TreeNode node, List<TreeNode> list) {
    if(node.left != null) {
      traverse(node.left, list);
    }
    list.add(node);
    if(node.right != null) {
      traverse(node.right, list);
    }
    return list;
  }

  public static boolean checkListVal(List<TreeNode> list) {
    for(int i=0; i<list.size()-1; i++) {
      if(list.get(i).val >= list.get(i+1).val){
        return false;
      }
    }
    return true;
  }

}

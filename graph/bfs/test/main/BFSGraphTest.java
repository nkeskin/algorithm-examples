package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BFSGraphTest {

  BFSGraph bfsGraph;

  @BeforeEach
  void setUp() {
    bfsGraph = new BFSGraph();
  }

//  @Test
//  void case1() {
//    List<List<Integer>> result = new ArrayList<>();
//    List<Integer> lst = new ArrayList<>();
//    lst.add(1);
//    result.add(lst);
//    lst = new ArrayList<>();
//    lst.add(2);
//    result.add(lst);
//    lst = new ArrayList<>();
//    lst.add(3);
//    result.add(lst);
//    lst = new ArrayList<>();
//    lst.add(4);
//    result.add(lst);
//    lst = new ArrayList<>();
//    lst.add(5);
//    result.add(lst);
//    TreeNode treeNode = new TreeNode(1);
//    treeNode.left = new TreeNode(2);
//    treeNode.left.left = new TreeNode(3);
//    treeNode.left.left.left = new TreeNode(4);
//    treeNode.left.left.left.left = new TreeNode(5);
//    Assertions.assertEquals(result, bfsGraph.levelOrder(treeNode));
//  }

  @Test
  void case2() {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> lst = new ArrayList<>();
    lst.add(3);
    result.add(lst);
    lst = new ArrayList<>();
    lst.add(9);
    lst.add(20);
    result.add(lst);
    lst = new ArrayList<>();
    lst.add(15);
    lst.add(7);
    result.add(lst);
    TreeNode treeNode = new TreeNode(3);
    treeNode.left = new TreeNode(9);
    treeNode.right = new TreeNode(20);
    treeNode.right.left = new TreeNode(15);
    treeNode.right.right = new TreeNode(7);
    Assertions.assertEquals(result, bfsGraph.levelOrder(treeNode));
  }

}

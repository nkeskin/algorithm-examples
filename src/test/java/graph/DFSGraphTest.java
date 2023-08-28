package graph;

import graph.DFSGraph;
import graph.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DFSGraphTest {

    DFSGraph dfsGraph;

    @BeforeEach
    void setUp() {
        dfsGraph = new DFSGraph();
    }

    @Test
    void case1() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        Assertions.assertFalse(dfsGraph.isValidBST(treeNode));
    }

    @Test
    void case2() {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        Assertions.assertTrue(dfsGraph.isValidBST(treeNode));
    }

}

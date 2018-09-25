package basic.tree;

import org.junit.Test;

import basic.tree.BFS.Node;

public class BFSTest {

    private BFS bfs = new BFS();

    @Test
    public void testPrintLevelTree() {
        bfs.printLevelTree(null);
        Node a = new Node('a');
        bfs.printLevelTree(a);
        a.left = new Node('b');
        a.right = new Node('c');
        a.left.right = new Node('d');
        a.right.left = new Node('e');
        a.right.right = new Node('f');
        bfs.printLevelTree(a);
    }

}

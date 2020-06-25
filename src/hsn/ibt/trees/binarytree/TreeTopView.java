package hsn.ibt.trees.binarytree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

public class TreeTopView {

    static void topView(BinaryTreeModel root) {
        BFS(new NodeWithOffSet(root, 0));
    }

    public static void BFS(NodeWithOffSet node) {
        Queue<NodeWithOffSet> queue = new LinkedList<>();
        HashMap<Integer, Integer> offsetMap = new HashMap<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            NodeWithOffSet n = queue.poll();
            if (!offsetMap.containsKey(n.offset)) {
                offsetMap.put(n.offset, n.node.data);
            }

            if (n.node.left != null) {
                queue.offer(new NodeWithOffSet(n.node.left, n.offset - 1));
            }
            if (n.node.right != null) {
                queue.offer(new NodeWithOffSet(n.node.right, n.offset + 1));
            }
        }


        offsetMap.entrySet().stream().sorted(
                Comparator.comparing(Map.Entry::getKey)
        ).map(Map.Entry::getValue).collect(Collectors.toList()).forEach(i -> System.out.print(i + " "));

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        String s = "50 10 90 5 15 75 100 7 6";

        for (int s1 : Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray()) {
            binaryTree.insert(s1);
        }

        BinaryTreePrinter binaryTreePrinter = new BinaryTreePrinter(binaryTree.root);
        binaryTreePrinter.print(System.out);

        topView(binaryTree.root);
    }

    static class NodeWithOffSet {

        BinaryTreeModel node;
        int offset;

        public NodeWithOffSet(BinaryTreeModel node, int offset) {
            this.node = node;
            this.offset = offset;
        }

    }
}

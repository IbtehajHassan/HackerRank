package hsn.ibt.trees.binarytree;

import java.util.Arrays;

public class TreeTopView {

    public static void topView(BinaryTreeModel root) {


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
}

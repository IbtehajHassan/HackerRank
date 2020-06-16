package hsn.ibt.trees.binarytree;

import java.util.Arrays;

public class BinaryTree {

    BinaryTreeModel root;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        String s = "50 10 90 5 15 75 100 7 6";
        for (int s1 : Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray()) {
            binaryTree.insert(s1);
        }

        binaryTree.printInOrder();
        binaryTree.printPreOrder();
        binaryTree.printPostOrder();


        BinaryTreePrinter binaryTreePrinter = new BinaryTreePrinter(binaryTree.root);
        binaryTreePrinter.print(System.out);

        int height = binaryTree.root.height();
        System.out.println("Tree Height: " + height);
    }

    public void insert(int data) {
        if (root == null) {
            root = new BinaryTreeModel(data);
        } else {
            root.insert(data);
        }
    }

    public boolean contains(int value) {
        if (root != null) {
            return root.contains(value);
        }
        return false;
    }

    public void printInOrder() {
        if (root != null) {
            System.out.println("----------------------------------Start InOrder----------------------------------");
            root.printInOrder();
            System.out.println("-----------------------------------End-----------------------------------");
        }
    }

    public void printPreOrder() {
        if (root != null) {
            System.out.println("----------------------------------Start PreOrder----------------------------------");
            root.printPreOrder();
            System.out.println("-----------------------------------End-----------------------------------");
        }
    }

    public void printPostOrder() {
        if (root != null) {
            System.out.println("----------------------------------Start PostOrder----------------------------------");
            root.printPostOrder();
            System.out.println("-----------------------------------End-----------------------------------");
        }
    }
}

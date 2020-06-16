package hsn.ibt.trees.binarytree;

import hsn.ibt.linkedlist.DoublyLinkedList;

import java.util.Arrays;

public class BinaryTree {

    BinaryTreeModel root;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        String s = "50 10 90 5 15 75 100";
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        for (int s1 : Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray()) {
            binaryTree.insert(s1);
        }


        binaryTree.printInOrder();


        BinaryTreePrinter binaryTreePrinter = new BinaryTreePrinter(binaryTree.root);
        binaryTreePrinter.print(System.out);
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
            System.out.println("----------------------------------Start----------------------------------");
            root.printInOrder();
            System.out.println("-----------------------------------End-----------------------------------");
        }
    }

    public void printPreOrder() {
        if (root != null) {
            System.out.println("----------------------------------Start----------------------------------");
            root.printInOrder();
            System.out.println("-----------------------------------End-----------------------------------");
        }
    }

    public void printPostOrder() {
        if (root != null) {
            System.out.println("----------------------------------Start----------------------------------");
            root.printInOrder();
            System.out.println("-----------------------------------End-----------------------------------");
        }
    }
}

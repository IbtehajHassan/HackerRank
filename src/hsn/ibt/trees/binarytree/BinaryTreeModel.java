package hsn.ibt.trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeModel {
    BinaryTreeModel left;
    BinaryTreeModel right;
    int data;

    public BinaryTreeModel(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new BinaryTreeModel(value);
            } else {
                left.insert(value);
            }

        } else {
            if (right == null) {
                right = new BinaryTreeModel(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        }
        if (value <= data) {
            if (left != null) {
                return left.contains(value);
            } else {
                return false;
            }
        } else {
            if (right != null) {
                return right.contains(value);
            } else {
                return false;
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(data);

        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder() {
        if (left != null) {
            left.printPostOrder();
        }
        if (right != null) {
            right.printPostOrder();
        }

        System.out.println(data);
    }

    public void printLevelOrder() {
        Queue<BinaryTreeModel> queue = new LinkedList<>();
        queue.offer(this);

        while (!queue.isEmpty()) {
            BinaryTreeModel node = queue.poll();

            System.out.println(node.data);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }


    public int height() {
        int leftT = 0;
        int rightT = 0;

        if (left != null) {
            leftT = left.height() + 1;
        }
        if (right != null) {
            rightT = right.height() + 1;
        }

        return leftT > rightT ? leftT : rightT;
    }


    public BinaryTreeModel getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeModel left) {
        this.left = left;
    }

    public BinaryTreeModel getRight() {
        return right;
    }

    public void setRight(BinaryTreeModel right) {
        this.right = right;
    }

    public int getValue() {
        return data;
    }

    public void setValue(int data) {
        this.data = data;
    }
}

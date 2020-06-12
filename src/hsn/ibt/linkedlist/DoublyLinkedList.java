package hsn.ibt.linkedlist;

import java.util.Arrays;

public class DoublyLinkedList {

    public DoublyLinkedListNode head = null;
    int size;


    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode();
        newNode.data = data;

        DoublyLinkedListNode oHead = head;
        DoublyLinkedListNode prevNode = head;

        while (head != null && head.data < data) {
            prevNode = head;
            head = head.next;
        }

        if (prevNode.prev == null) {//Head is New Node
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            oHead = newNode;

        } else if (head == null) { //Tail is new Node
            newNode.next = null;
            newNode.prev = prevNode;
            prevNode.next = newNode;

        } else { // Insert in middle
            newNode.next = head;
            newNode.prev = prevNode;
            head.prev = newNode;
            prevNode.next = newNode;
        }

        return oHead;
    }

    public static void main(String[] args) {
        String s = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5";

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        for (int s1 : Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            doublyLinkedList.addAtTheBeginning(s1);
        }

        printDoublyLinkedList(doublyLinkedList.head);
    }

    static void printDoublyLinkedList(DoublyLinkedListNode head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
        }
        System.out.println();
    }

    public void addAtTheBeginning(int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
        }
        size++;
    }

    public static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;
    }
}

package hsn.ibt.linkedlist;

import java.util.Arrays;

public class LinkedListPrimitiveOperations {

    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
        }
        System.out.println();
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode slln = new SinglyLinkedListNode();
        slln.data = data;
        slln.next = null;

        SinglyLinkedListNode current = head;
        SinglyLinkedListNode prev = current;

        while (current != null) {
            prev = current;
            current = current.next;
        }

        if (head == null) {
            head = slln;
        } else {
            prev.next = slln;
        }

        return head;

    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode listNode = new SinglyLinkedListNode(data);

        listNode.next = llist;

        return listNode;
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode slln = new SinglyLinkedListNode(data);
        if (head == null) {
            return slln;
        }

        SinglyLinkedListNode current = head;
        SinglyLinkedListNode prev = null;

        int i = 0;
        while (current.next != null) {
            if (i == position) {
                break;
            }
            i++;
            prev = current;
            current = current.next;
        }

        if (i != position) {
            return head;
        }


        slln.next = current;
        if (prev != null) {
            prev.next = slln;
        } else {
            head = slln;
        }

        return head;
    }

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        if (head == null) {
            return head;
        }

        SinglyLinkedListNode current = head;
        SinglyLinkedListNode prev = null;

        int i = 0;
        while (current.next != null) {
            if (i == position) {
                break;
            }
            i++;
            prev = current;
            current = current.next;
        }

        if (i != position) {
            return head;
        }

        if (prev != null) {
            prev.next = current.next;
        } else {
            head = head.next;
        }

        return head;
    }

    public static void main(String[] args) {
        String s = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5";

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int s1 : Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            singlyLinkedList.add(s1);
        }

        printLinkedList(singlyLinkedList.head);

        insertNodeAtTail(singlyLinkedList.head, 6);

        printLinkedList(singlyLinkedList.head);

        printLinkedList(insertNodeAtTail(null, 6));


        singlyLinkedList.head = insertNodeAtHead(singlyLinkedList.head, 1);

        printLinkedList(singlyLinkedList.head);


        singlyLinkedList.head = insertNodeAtPosition(singlyLinkedList.head, 1, 0);

        printLinkedList(singlyLinkedList.head);

        singlyLinkedList.head = insertNodeAtPosition(singlyLinkedList.head, 2, 1);

        printLinkedList(singlyLinkedList.head);

        singlyLinkedList.head = insertNodeAtPosition(singlyLinkedList.head, 7, 9);

        printLinkedList(singlyLinkedList.head);

        singlyLinkedList.head = deleteNode(singlyLinkedList.head, 11);

        printLinkedList(singlyLinkedList.head);

    }

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode() {
        }

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    static class SinglyLinkedList {
        SinglyLinkedListNode head = null;
        int size;

        public void add(int data) {
            SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode();
            singlyLinkedListNode.data = data;
            singlyLinkedListNode.next = head;
            head = singlyLinkedListNode;
            size++;
        }
    }
}

package hsn.ibt.linkedlist;

import java.io.IOException;
import java.util.Arrays;

public class DoublyLinkedList {

    public DoublyLinkedListNode head = null;
    int size;


    static DoublyLinkedListNode sortedInsertRecursive(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode();
        newNode.data = data;
        if (head == null) { //1 2 2 / 3
            return newNode;
        } else if (data <= head.data) { // inset at the beginning
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        } else {
            newNode = sortedInsertRecursive(head.next, data);
            newNode.prev = head;
            head.next = newNode;
        }
        return head;
    }

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode();
        newNode.data = data;

        if (head == null) {
            return newNode;
        } else if (data <= head.data) { // inset at the beginning
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        } else {
            DoublyLinkedListNode oHead = head;
            DoublyLinkedListNode prevNode = null;

            while (head != null && head.data < data) {
                prevNode = head;
                head = head.next;
            }

            if (head == null) { //Tail is new Node
                prevNode.next = newNode;
                newNode.prev = prevNode;

            } else { // Insert in middle
                prevNode.next = newNode;
                head.prev = newNode;
                newNode.prev = prevNode;
                newNode.next = head;
            }
            return oHead;
        }
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head == null)
            return null;

        //The Trick in reversing is that you cannot follow the head pattern as the whole logic is based
        //on disjointing head from previous and
        //previous is now becoming the new list
        DoublyLinkedListNode prev = null;
        DoublyLinkedListNode nextHead = null;
        while (head != null) {
            nextHead = head.next;
            head.next = prev;
            prev = head;
            prev.prev = nextHead;
            head = nextHead;
        }

        return prev;

    }

    public static void main(String[] args) throws IOException {

//        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
//
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                doublyLinkedList.head = sortedInsertRecursive(doublyLinkedList.head, Integer.parseInt(line));
//                printDoublyLinkedList(doublyLinkedList.head);
//            }
//        } catch (IOException e) {
//            throw e;
//        }

        String s = "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1";
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        for (int s1 : Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            doublyLinkedList.addAtTheBeginning(s1);
        }

        printDoublyLinkedList(doublyLinkedList.head);

//        doublyLinkedList.head = sortedInsert(doublyLinkedList.head, 5);
//        printDoublyLinkedList(doublyLinkedList.head);
//
//        doublyLinkedList.head = sortedInsert(doublyLinkedList.head, 0);
//        printDoublyLinkedList(doublyLinkedList.head);
//
//        doublyLinkedList.head = sortedInsert(doublyLinkedList.head, 7);
//        printDoublyLinkedList(doublyLinkedList.head);
//
//        doublyLinkedList.head = sortedInsert(doublyLinkedList.head, 8);
//        printDoublyLinkedList(doublyLinkedList.head);
//
//        doublyLinkedList.head = sortedInsert(doublyLinkedList.head, 1);
//        printDoublyLinkedList(doublyLinkedList.head);

        doublyLinkedList.head = reverse(doublyLinkedList.head);
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

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;

        size++;
    }

    public static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;
    }
}

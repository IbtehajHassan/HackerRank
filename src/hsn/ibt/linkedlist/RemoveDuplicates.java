package hsn.ibt.linkedlist;

import java.util.Arrays;

public class RemoveDuplicates extends LinkedListPrimitiveOperations {


    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        SinglyLinkedListNode oHead = head;
        SinglyLinkedListNode previous = head;
        while (head != null) {
            while (head != null && previous.data == head.data) {
                head = head.next;
            }
            previous.next = head;
            previous = head;
            if (head != null) {
                head = head.next;
            }
        }

        return oHead;
    }

    static SinglyLinkedListNode removeDuplicatesRecursive(SinglyLinkedListNode head) {

        if (head.next == null) {
            return head;
        }
        SinglyLinkedListNode returnedHead = removeDuplicatesRecursive(head.next);
        if (head.data != returnedHead.data) {
            head.next = returnedHead;
            return head;
        } else {
            return returnedHead;
        }
    }

    public static void main(String[] args) {

        String ss =
                "2\n" +
                        "1\n" +
                        "1";

        String s = "5\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "2\n" +
                "2\n" +
                "1\n" +
                "1";

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int s1 : Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            singlyLinkedList.add(s1);
        }
        printLinkedList(singlyLinkedList.head);

        singlyLinkedList.head = removeDuplicatesRecursive(singlyLinkedList.head);

        printLinkedList(singlyLinkedList.head);

    }
}

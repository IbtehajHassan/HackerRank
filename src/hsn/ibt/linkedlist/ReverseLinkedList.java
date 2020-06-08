package hsn.ibt.linkedlist;

import java.util.Arrays;

public class ReverseLinkedList extends LinkedListPrimitiveOperations {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        if (head == null) {
            return head;
        }

        SinglyLinkedListNode current = head;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;

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

        singlyLinkedList.head = reverse(singlyLinkedList.head);

        printLinkedList(singlyLinkedList.head);

    }


}

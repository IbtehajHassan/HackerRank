package hsn.ibt.linkedlist;

import java.util.Arrays;

public class CompareLists extends LinkedListPrimitiveOperations {

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null || head2 == null) {
            return false;
        }
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        if (head1 == null && head2 == null) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5";

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        SinglyLinkedList singlyLinkedList2 = new SinglyLinkedList();

        for (int s1 : Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            singlyLinkedList.add(s1);
            singlyLinkedList2.add(s1);

        }

        printLinkedList(singlyLinkedList.head);

        singlyLinkedList2.head = deleteNode(singlyLinkedList2.head, 4);

        printLinkedList(singlyLinkedList2.head);


        boolean val = compareLists(singlyLinkedList.head, singlyLinkedList2.head);

    }

}

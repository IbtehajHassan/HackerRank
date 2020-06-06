package hsn.ibt.linkedlist;

import java.util.Arrays;

public class ReversePrintLinkedList extends LinkedListPrimitiveOperations {
    static void reversePrint(SinglyLinkedListNode head) {

        if (head == null) {
            return;
        }

        if (head.next != null)
            reversePrint(head.next);

        System.out.println(head.data);

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

        reversePrint(singlyLinkedList.head);
    }


}

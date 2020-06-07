package hsn.ibt.linkedlist;

import java.util.Arrays;

public class MergeSortedList extends LinkedListPrimitiveOperations {

    //ITERATIVE -> Solution when you only have to use pointer manipulation
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        if (head1.data > head2.data) {
            SinglyLinkedListNode tmp = head1;
            head1 = head2;
            head2 = tmp;
        }

        SinglyLinkedListNode originalHead1 = head1;

        while (head2 != null) {
            while (head1.next != null &&
                    head1.next.data < head2.data) { // 1 2 3 4 7 |  5
                head1 = head1.next;
            }

            //Break the chain and and insert head2 node between head1 node

            SinglyLinkedListNode nextHead2 = head2.next;
            head2.next = head1.next;
            head1.next = head2;
            head2 = nextHead2;
        }

        return originalHead1;

    }

    //RECURSIVE -> Solution when you only have to use pointer manipulation
    static SinglyLinkedListNode mergeListsRecursive(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (head1.data < head2.data) {
            head1.next = mergeListsRecursive(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeListsRecursive(head1, head2.next);
            return head2;
        }

    }

    public static void main(String[] args) {
        String s2 =
                "6";

        String s =
                "7\n" +
                        "2\n" +
                        "1";

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        SinglyLinkedList singlyLinkedList2 = new SinglyLinkedList();

        for (int i1 : Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            singlyLinkedList.add(i1);

        }
        for (int i2 : Arrays.stream(s2.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            singlyLinkedList2.add(i2);

        }

        printLinkedList(singlyLinkedList.head);

        printLinkedList(singlyLinkedList2.head);

        singlyLinkedList.head = mergeListsRecursive(singlyLinkedList.head, singlyLinkedList2.head);

        printLinkedList(singlyLinkedList.head);


    }

    //Solution when creation of new list is allowed
    static SinglyLinkedListNode mergeListsWithSecondList(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        SinglyLinkedListNode mergedList = new SinglyLinkedListNode();
        SinglyLinkedListNode mergedListHead = mergedList;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                mergedList.next = head1;
                mergedList = mergedList.next;
                head1 = head1.next;
            } else if (head1.data > head2.data) {
                mergedList.next = head2;
                mergedList = mergedList.next;
                head2 = head2.next;
            } else {
                mergedList.next = head1;
                mergedList = mergedList.next;
                head1 = head1.next;
                mergedList.next = head2;
                mergedList = mergedList.next;
                head2 = head2.next;

            }
        }

        return mergedListHead.next;

    }
}

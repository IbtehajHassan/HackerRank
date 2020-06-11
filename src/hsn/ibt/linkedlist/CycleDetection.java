package hsn.ibt.linkedlist;

import java.util.Arrays;

public class CycleDetection extends LinkedListPrimitiveOperations {


    static boolean hasCycle(SinglyLinkedListNode head) {

        SinglyLinkedListNode prev = head;
        head = head.next;

        int count = 0;
        while (head != null && prev != head) {
            if (++count % 2 == 0) {
                prev = prev.next;
            }
            head = head.next;
        }
        if (prev == head) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        String ss =
                "2\n" +
                        "1\n" +
                        "1";

        String s = "9\n" +
                "8\n" +
                "7\n" +
                "6\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1";

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int s1 : Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            singlyLinkedList.add(s1);
        }

        SinglyLinkedListNode cycleList = singlyLinkedList.head;
        SinglyLinkedListNode cycleNode = singlyLinkedList.head;

        int count = 0;
        while (cycleList.next != null) {
            if (count++ == 7) {
                cycleNode = cycleList;
            }
            cycleList = cycleList.next;
        }
        cycleList.next = cycleNode;


        //printLinkedList(singlyLinkedList.head);

        boolean hasCycle = hasCycle(singlyLinkedList.head);

        System.out.println("Has Cycle : " + hasCycle);
    }
}

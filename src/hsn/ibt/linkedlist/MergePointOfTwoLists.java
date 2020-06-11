package hsn.ibt.linkedlist;

import java.util.Arrays;

public class MergePointOfTwoLists extends LinkedListPrimitiveOperations {


    /*
     * My solution where i want both list to end at the same time while iterating to end
     * so i start the iteration on shortest list later that is the difference between the count of both list count1 - count2
     * by that i can tell as soon as both hit the same node that would be the merge point
     * */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode ohead1 = head1;
        SinglyLinkedListNode ohead2 = head2;
        int count1, count2;
        count1 = count2 = 0;

        //First count the lengths of both lists
        while (head1.next != null) {
            count1++;
            head1 = head1.next;
        }
        while (head2.next != null) {
            count2++;
            head2 = head2.next;
        }

        //Then subtract one from another to get the diff and to identify which one is the shortest and longest
        //You offset the smallest using the difference
        int diff = count1 - count2;
        int limit;
        if (diff < 0) {
            diff *= -1;
            limit = count2;
            head1 = ohead1;
            head2 = ohead2;
        } else {
            limit = count1;
            head1 = ohead2;
            head2 = ohead1;
        }

        //Offsetting the smallest will make both list to reach the end at the same time
        //and at the middle point as well because the both list have the same ending list.
        //So the first equal node will be the merging point
        int retVal = -1;
        for (int i = 0; i < limit; i++) {
            if (head1 == head2) {
                retVal = head1.data;
                break;
            }
            if (i >= diff) {
                head1 = head1.next;
            }
            head2 = head2.next;
        }
        if (head1 == head2) {
            retVal = head1.data;
            ;
        }
        return retVal;
    }


    /*
     * Credit for the solution to puffski: https://gist.github.com/puffski/a48714de8b4a90cf3169
     * */
    static int findMergeNodeFloydCycleDetection(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        /*
         * Creating a circular linked list out of head1
         * */
        SinglyLinkedListNode ohead1 = head1;

        //get tail of listA
        while (head1.next != null) {
            head1 = head1.next;
        }
        //and connect it to its own head ->create a circle
        head1.next = ohead1;


        //since we know that listB merges with listA we know that listB has a circle
        //therefore run cycle detection on listB

        /*Floyd Cycle Detection*/
        SinglyLinkedListNode slow = head2.next;
        SinglyLinkedListNode fast = head2.next.next;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //slow and fast now point at the same node in the cycle and this node is exactly k steps away
        //from the beginning of the cycle (the merging node)
        //slow will now be set to headB which as well is k steps aways from the beginning of the cycle
        //moving both at the same pace both will meet at the mergin node
        slow = head2;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        String s =
                "3\n" +
                        "2\n" +
                        "1";

        String s2 = "9\n" +
                "8\n" +
                "7\n" +
                "6\n" +
                "5\n" +
                "4\n" +
                "3\n" +
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

        singlyLinkedList.head.next.next.next = singlyLinkedList2.head.next.next.next.next.next.next;
        //singlyLinkedList.head.next = null;
        //singlyLinkedList2.head = singlyLinkedList.head;
        int val = findMergeNode(singlyLinkedList.head, singlyLinkedList2.head);
        System.out.println("merge point index : " + val);
    }
}

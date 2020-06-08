package hsn.ibt.linkedlist;

import hsn.ibt.dataParsers.Callable;
import hsn.ibt.dataParsers.DataParsers;

import java.util.Arrays;

public class GetNodeValueInReverse extends LinkedListPrimitiveOperations implements Callable<Integer, LinkedListPrimitiveOperations.SinglyLinkedListNode> {

    public static void main(String[] args) {
        String s = "1\n" +
                "99\n" +
                "3\n" +
                "4\n" +
                "5";

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int s1 : Arrays.stream(s.split("\n")).mapToInt(Integer::parseInt).toArray()) {
            singlyLinkedList.add(s1);
        }

        printLinkedList(singlyLinkedList.head);

        //int val = getNode(singlyLinkedList.head, 1);

        //System.out.println(val);

        DataParsers.hackerRankDataParserTotalListsWithListsAndLastPosition(new GetNodeValueInReverse());
    }

    //Failed Attempt -> fails when countOrAnswer value is less the counter position which leads it back to less than condition
    static int getNode1(SinglyLinkedListNode head, int positionFromTail) {

        int countOrAnswer = 0;

        if (head == null) {
            return 0;
        }

        countOrAnswer = getNode1(head.next, positionFromTail);
        if (countOrAnswer < positionFromTail) {
            return countOrAnswer + 1;
        } else if (countOrAnswer == positionFromTail) {
            return head.data;
        } else {
            return countOrAnswer;
        }
    }

    static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        int length = 0;
        SinglyLinkedListNode pointer = head;
        SinglyLinkedListNode ansPointer = head;

        while (head != null) {

            if (length >= positionFromTail) {
                ansPointer = pointer;
                pointer = pointer.next;
            }
            head = head.next;
            length++;

        }
        return ansPointer.data;
    }

    @Override
    public Integer call(SinglyLinkedListNode p2, Integer p1) {
        return getNode(p2, p1);
    }


}

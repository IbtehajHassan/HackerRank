package hsn.ibt.linkedlist;

import java.util.Arrays;

import static hsn.ibt.linkedlist.ReverseLinkedList.reverse;

public class GetNodeValueInReverse extends LinkedListPrimitiveOperations {

    static String testStr = "2\n" +
            "1\n" +
            "1\n" +
            "0\n" +
            "3\n" +
            "3\n" +
            "2\n" +
            "1\n" +
            "2";
    static String hackerRankDataStr = "6\n" +
            "56\n" +
            "20\n" +
            "100\n" +
            "1\n" +
            "63\n" +
            "91\n" +
            "91\n" +
            "32\n" +
            "2\n" +
            "69\n" +
            "6\n" +
            "92\n" +
            "53\n" +
            "83\n" +
            "82\n" +
            "90\n" +
            "62\n" +
            "27\n" +
            "53\n" +
            "12\n" +
            "19\n" +
            "11\n" +
            "81\n" +
            "7\n" +
            "47\n" +
            "59\n" +
            "80\n" +
            "95\n" +
            "37\n" +
            "35\n" +
            "3\n" +
            "44\n" +
            "55\n" +
            "54\n" +
            "44\n" +
            "17\n" +
            "45\n" +
            "86\n" +
            "100\n" +
            "98\n" +
            "54\n" +
            "57\n" +
            "90\n" +
            "58\n" +
            "39\n" +
            "23\n" +
            "48\n" +
            "1\n" +
            "1\n" +
            "52\n" +
            "12\n" +
            "19\n" +
            "63\n" +
            "44\n" +
            "26\n" +
            "61\n" +
            "3\n" +
            "28\n" +
            "8\n" +
            "39\n" +
            "92\n" +
            "10\n" +
            "83\n" +
            "46\n" +
            "63\n" +
            "78\n" +
            "14\n" +
            "2\n" +
            "16\n" +
            "13\n" +
            "9\n" +
            "69\n" +
            "70\n" +
            "50\n" +
            "79\n" +
            "60\n" +
            "72\n" +
            "78\n" +
            "60\n" +
            "72\n" +
            "29\n" +
            "23\n" +
            "42\n" +
            "43\n" +
            "67\n" +
            "6\n" +
            "56\n" +
            "69\n" +
            "24\n" +
            "63\n" +
            "59\n" +
            "67\n" +
            "72\n" +
            "93\n" +
            "12\n" +
            "86\n" +
            "71\n" +
            "77\n" +
            "97\n" +
            "86\n" +
            "89\n" +
            "5\n" +
            "6\n" +
            "10\n" +
            "6\n" +
            "36\n" +
            "70\n" +
            "77\n" +
            "13\n" +
            "81\n" +
            "100\n" +
            "94\n" +
            "4\n" +
            "41\n" +
            "36\n" +
            "70\n" +
            "60\n" +
            "43\n" +
            "90\n" +
            "35\n" +
            "5\n" +
            "48\n" +
            "1\n" +
            "28\n" +
            "41\n" +
            "64\n" +
            "14\n" +
            "63\n" +
            "40\n" +
            "10\n" +
            "100\n" +
            "80\n" +
            "66\n" +
            "5\n" +
            "42\n" +
            "71\n" +
            "41\n" +
            "11\n" +
            "99\n" +
            "5\n" +
            "91\n" +
            "98\n" +
            "98\n" +
            "17\n" +
            "90\n" +
            "86\n" +
            "15\n" +
            "49\n" +
            "28\n" +
            "4\n" +
            "35\n" +
            "33\n" +
            "4\n" +
            "35\n" +
            "60\n" +
            "44\n" +
            "98\n" +
            "25\n" +
            "58\n" +
            "89\n" +
            "86\n" +
            "57\n" +
            "69\n" +
            "51\n" +
            "13\n" +
            "10\n" +
            "21\n" +
            "53\n" +
            "72\n" +
            "71\n" +
            "10\n" +
            "14\n" +
            "68\n" +
            "7\n" +
            "60\n" +
            "58\n" +
            "44\n" +
            "26\n" +
            "58\n" +
            "72\n" +
            "30\n" +
            "93\n" +
            "4\n" +
            "33\n" +
            "79\n" +
            "15\n" +
            "28\n" +
            "77\n" +
            "40\n" +
            "85\n" +
            "17\n" +
            "77\n" +
            "93\n" +
            "85\n" +
            "28\n" +
            "5\n" +
            "46\n" +
            "100\n" +
            "10\n" +
            "69\n" +
            "71\n" +
            "19\n" +
            "83\n" +
            "90\n" +
            "77\n" +
            "94\n" +
            "99\n" +
            "21\n" +
            "19\n" +
            "9\n" +
            "92\n" +
            "48\n" +
            "1\n" +
            "47\n" +
            "32\n" +
            "31\n" +
            "13\n" +
            "11\n" +
            "59\n" +
            "52\n" +
            "47\n" +
            "76\n" +
            "81\n" +
            "39\n" +
            "12\n" +
            "8\n" +
            "44\n" +
            "58\n" +
            "59\n" +
            "53\n" +
            "78\n" +
            "81\n" +
            "71\n" +
            "60\n" +
            "71\n" +
            "86\n" +
            "53\n" +
            "69\n" +
            "19\n" +
            "72\n" +
            "77\n" +
            "10\n" +
            "71\n" +
            "29\n" +
            "56\n" +
            "55\n" +
            "60\n" +
            "69\n" +
            "65\n" +
            "18\n" +
            "72\n" +
            "12\n" +
            "45\n" +
            "52\n" +
            "50\n" +
            "57\n" +
            "11\n" +
            "45\n" +
            "66\n" +
            "22\n" +
            "97\n" +
            "43\n" +
            "2\n" +
            "19\n" +
            "3\n" +
            "72\n" +
            "18\n" +
            "7\n" +
            "93\n" +
            "36\n" +
            "30\n" +
            "69\n" +
            "98\n" +
            "53\n" +
            "50\n" +
            "53\n" +
            "7\n" +
            "61\n" +
            "73\n" +
            "23\n" +
            "30\n" +
            "97\n" +
            "86\n" +
            "75\n" +
            "100\n" +
            "88\n" +
            "31\n" +
            "63\n" +
            "32\n" +
            "96\n" +
            "48";

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

        hackerRankDataParser();
    }

    public static void hackerRankDataParser() {

        int[] hackerRankDataArray = Arrays.stream(hackerRankDataStr.split("\n")).mapToInt(Integer::parseInt).toArray();

        int counter = 0;
        int positionFromTail;
        for (int i = 0; i < hackerRankDataArray[0]; i++) {
            counter++;
            int lengthOfInput = hackerRankDataArray[counter] + counter++;

            SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
            for (int j = counter; j <= lengthOfInput; j++, counter++) {
                System.out.print(hackerRankDataArray[j] + " ");
                singlyLinkedList.add(hackerRankDataArray[j]);
            }
            positionFromTail = hackerRankDataArray[counter];
            singlyLinkedList.head = reverse(singlyLinkedList.head);

            int val = getNode(singlyLinkedList.head, positionFromTail);
            System.out.println(" PositionFromTail :" + positionFromTail);
            System.out.println("Answer: " + val);
            System.out.println();
            System.out.println();
        }


    }


}

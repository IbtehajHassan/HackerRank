package hsn.ibt.arrays;

import java.io.IOException;
import java.util.stream.Stream;

public class HourglassSum {

    //    String pattern = "1 1 1\n" +
//            "0 1 0\n" +
//            "1 1 1";
//
//    String [] temp = pattern.split("\n");
//    int [][] patArr = new int[6][6];
//        for (int i = 0; i < temp.length; i++) {
//        patArr[i] = Stream.of(temp[i].split(" ")).mapToInt(Integer::parseInt).toArray();
//    }
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = 0;

        int allSums[] = new int[16];

        int j = 0;
        int k = 0;
        for (int i = 0; i < 16; i++) {
            int maxJ = j + 3;
            int maxK = k + 3;
            for (; j < maxJ; j++) {
                for (; k < maxK; k++) {
//                    System.out.println(arr[j][k] + "-> " +j + "," + k);
                    if (j + 1 == maxJ - 1) {
                        if (k + 1 == maxK - 1) {
                            System.out.println(arr[j][k] + "-> " + j + "," + k);

                            allSums[i] += arr[j][k];
                        }
                    } else {
                        System.out.println(arr[j][k] + "-> " + j + "," + k);

                        allSums[i] += arr[j][k];
                    }
                }
                k -= 3;
            }
            System.out.println("============================== " + (i + 1));
            j -= 3;
            if (k < arr.length - 3) {
                k++;
            } else if (k == arr.length - 3 && j < arr.length - 3) {
                k = 0;
                j++;
            } else if (j < arr.length - 3) {
                j++;
            } else if (j == arr.length - 3 && k < arr.length - 3) {
                j = 0;
                k++;
            }
        }
        maxSum = allSums[0];

        for (int i = 0; i < allSums.length; i++) {
            if (maxSum < allSums[i]) {
                maxSum = allSums[i];
            }
        }

        return maxSum;
    }


    public static void main(String[] args) throws IOException {


//        String s = "1 1 1 0 0 0\n" +
//                "0 1 0 0 0 0\n" +
//                "1 1 1 0 0 0\n" +
//                "0 0 2 4 4 0\n" +
//                "0 0 0 2 0 0\n" +
//                "0 0 1 2 4 0";

        //Better Solution in python below
//        sum = []
//
//
//        for i in range(len(arr)-2):
//        for j in range(len(arr)-2):
//        sum.append(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2])
//
//        print(max(sum))

        String s = "-1 -1 0 -9 -2 -2\n" +
                "-2 -1 -6 -8 -2 -5\n" +
                "-1 -1 -1 -2 -3 -4\n" +
                "-1 -9 -2 -4 -4 -5\n" +
                "-7 -3 -3 -2 -9 -9\n" +
                "-1 -3 -1 -2 -4 -5";

        String[] sa = s.split("\n");
        int[][] arr = new int[6][6];
        for (int i = 0; i < sa.length; i++) {
            arr[i] = Stream.of(sa[i].split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int result = hourglassSum(arr);

    }
}


package hsn.ibt.arrays;

import java.io.IOException;
import java.util.stream.Stream;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation2(int n, int[][] queries) {
        long array[] = new long[n];

        long max = 0;
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0] - 1; j < queries[i][1]; j++) {
                array[j] += queries[i][2];

                if (max < array[j]) {
                    max = array[j];
                }
            }
        }

        return max;
    }

    static long arrayManipulation(int n, int[][] queries) {
        long array[] = new long[n];

        for (int i = 0; i < queries.length; i++) {
            array[queries[i][0] - 1] += queries[i][2];
            if (queries[i][1] < n)
                array[queries[i][1]] -= queries[i][2];
        }

        long max = 0;
        long x = 0;
        for (int i = 0; i < array.length; i++) {
            x += array[i];
            if (x > max) {
                max = x;
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {

//        int n = 10;
//        String s = "1 5 3\n" +
//                "4 8 7\n" +
//                "6 9 1";

        int n = 10;
        String s = "2 6 8\n" +
                "3 5 7\n" +
                "1 8 1\n" +
                "5 9 15";

//        int n = 5;
//        String s = "1 2 100\n" +
//                "2 5 100\n" +
//                "3 4 100";


        int[][] queries = new int[4][4];

        String[] sa = s.split("\n");


        for (int i = 0; i < sa.length; i++) {
            queries[i] = Stream.of(sa[i].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        long result = arrayManipulation(n, queries);

    }
}

package hsn.ibt.arrays;

import java.io.IOException;

public class DLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        if (d % a.length == 0) {
            return a;
        }

        int actualRotation = d % a.length;
        int[] outArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            outArray[i] = a[actualRotation];
            actualRotation++;
            if (actualRotation == a.length) {
                actualRotation = 0;
            }
        }
        return outArray;
    }

    public static void main(String[] args) throws IOException {

        int[] a = {1, 2, 3, 4, 5};
        int d = 100;

        int[] result = rotLeft(a, d);
    }
}

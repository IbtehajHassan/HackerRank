package hsn.ibt.arrays;

import java.io.IOException;

public class ReverseArray {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int reverseCount = a.length - 1;
        int swapOpposite;

        for (int i = 0; i < a.length / 2; i++) {
            swapOpposite = a[i];
            a[i] = a[reverseCount];
            a[reverseCount] = swapOpposite;
            reverseCount--;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {

        int[] a = {1, 2, 3, 4, 5, 6};

        int[] result = reverseArray(a);
    }
}

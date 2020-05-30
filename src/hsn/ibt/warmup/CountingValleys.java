package hsn.ibt.warmup;

import java.io.*;
import java.util.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleyCount = 0;

        int value = 0;

        boolean wasInValley = false;

        if (s.isEmpty()) {
            return 0;
        }

        char [] step = s.toCharArray();


        for (int i = 0; i < step.length; i++) {
            if (step[i] == 'U') {
                value++;
            }else {
                value--;
            }

            if(value < 0){
                wasInValley = true;
            }
            if(value == 0 && wasInValley){
                valleyCount++;
                wasInValley = false;
            }
        }

        return valleyCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = "UDDDUDUU";
        int n = 8;

        int result = countingValleys(n, s);

    }
}

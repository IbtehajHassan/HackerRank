package hsn.ibt.warmup;

import java.io.*;
import java.util.stream.Stream;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        while (i < c.length) {
            if (i+2 < c.length && c[i + 2] != 1) {
                i += 2;
                jumps++;
            }else if(i+1 < c.length && c[i + 1] != 1) {
                i += 1;
                jumps++;
            }else {
                i++;
            }
        }
        return jumps;

    }

    public static void main(String[] args) throws IOException {

        String clds = "0 0 1 0 0 1 0 0 0 1 0 0 1 0";

        int [] c = Stream.of(clds.split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = jumpingOnClouds(c);

    }
}

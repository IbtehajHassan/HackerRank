package hsn.ibt.arrays;

import javax.xml.bind.annotation.XmlType;
import java.util.stream.Stream;

public class MinimumBribe {

    private static final String TOO_CHAOTIC = "Too chaotic";
    // Complete the minimumBribes function below.
    static void minimumBribes2(int[] q) {

        int totalBribes = 0;
        int maxBribe = 2;
        boolean chaotic = false;
        for (int i = 0; i < q.length; i++) {
            if (!(q[i] - (i+1) <= 0) && q[i] - (i+1) <= maxBribe) {
                totalBribes+=q[i] - (i+1);
            }else if(q[i] - (i+1) < 0 && i+1 < q.length && q[i]> q[i+1]){
                totalBribes++;
            }
            else if(q[i] - (i+1) > maxBribe){
                chaotic = true;
                break;
            }
        }
        if(chaotic)
            System.out.println("Too chaotic");
        else
        System.out.println(totalBribes);

    }

    static void minimumBribes(int[] q) {

        int totalBribes = 0;
        int maxBribe = 2;
        boolean chaotic = false;
        for (int i = q.length - 1; i >= 0; i--) {
            int displacement = 0;
            int j = i;
            while (j-1 >= 0 && j < q.length && q[j - 1] > q[j]){
                int temp = q[j - 1];
                 q[j - 1] = q[j];
                 q[j] = temp;
                displacement ++;
                j++;
            }
            if(displacement > maxBribe){
                chaotic = true;
                break;
            }
            totalBribes += displacement;
        }

        if(chaotic)
            System.out.println("Too chaotic");
        else
            System.out.println(totalBribes);

    }

    public static void main(String[] args) {

        String s = "1 2 5 3 7 8 6 4";
        //String s = "1 2 3 4 5 6 7 8 9";
        //String s = "2 5 1 3 4"; //TOO_CHAOTIC
            minimumBribes(Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray());
        }
}


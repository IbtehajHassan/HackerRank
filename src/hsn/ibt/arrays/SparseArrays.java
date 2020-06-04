package hsn.ibt.arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        List<String> stringList = new LinkedList<>();
        int[] outArray = new int[queries.length];

        Arrays.stream(strings).forEach(s -> stringList.add(s));

        for (int i = 0; i < queries.length; i++) {
            int finalI = i;
            outArray[i] = (int) stringList.stream().filter(s -> s.equals(queries[finalI])).count();
        }

        return outArray;

//        Scanner in = new Scanner(System.in);
//        List<String> strings = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
//        IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).mapToLong(q -> strings.stream().filter(q::equals).count()).forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {

        String s = "abcde\n" +
                "sdaklfj\n" +
                "asdjf\n" +
                "na\n" +
                "basdn\n" +
                "sdaklfj\n" +
                "asdjf\n" +
                "na\n" +
                "asdjf\n" +
                "na\n" +
                "basdn\n" +
                "sdaklfj\n" +
                "asdjf";

        String q = "abcde\n" +
                "sdaklfj\n" +
                "asdjf\n" +
                "na\n" +
                "basdn";

        String[] strings = s.split("\n");
        String[] queries = q.split("\n");

        int[] res = matchingStrings(strings, queries);

    }
}


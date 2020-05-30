package hsn.ibt.warmup;

import java.io.IOException;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long occurenceOfS = n / s.length();
        long remainder = n % s.length();
        String remainderS = s.substring(0, (int) remainder);

        long occurenceOfA = s.chars().filter(a -> a == 'a').count();
        long occurenceOfAInRemainder = remainderS.chars().filter(a -> a == 'a').count();

        return (occurenceOfA * occurenceOfS) + occurenceOfAInRemainder;
    }

    public static void main(String[] args) throws IOException {
        String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
        long n = 736778906400L;
//        String s = "aacacac";
//        long n = 10;
        long result = repeatedString(s, n);

    }
}


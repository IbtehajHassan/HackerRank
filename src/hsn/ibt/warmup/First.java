package hsn.ibt.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class First {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> socks = new HashSet<>();
        int totalPairs = 0;
        for(int i = 0; i < ar.length; i++){
            if(!socks.contains(ar[i])){
                socks.add(ar[i]);
            }else{
                socks.remove(ar[i]);
                totalPairs++;
            }
        }
        return totalPairs;
    }

    public static void main(String[] args) throws IOException {

        int n = 7;
        int ar[] = {1,2,1,1,2,1,3,2};

        int result = sockMerchant(n, ar);


    }
}

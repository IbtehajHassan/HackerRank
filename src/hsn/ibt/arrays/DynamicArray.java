package hsn.ibt.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DynamicArray {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<List<Integer>> sequences = new ArrayList<>();
        List<Integer> outList = new ArrayList<>();

        int lastAnswer = 0;
        for (int i = 0; i < n; i++) {
            sequences.add(new ArrayList<>());
        }

        for (int i = 0; i < queries.size(); i++) {
            if (queries.get(i).get(0) == 1) {
                int seqNum = (queries.get(i).get(1) ^ lastAnswer) % n;
                sequences.get(seqNum).add(queries.get(i).get(2));
            } else {
                int seqNum = (queries.get(i).get(1) ^ lastAnswer) % n;
                lastAnswer = sequences.get(seqNum).get(queries.get(i).get(2) % sequences.get(seqNum).size());
                outList.add(lastAnswer);
                System.out.println(lastAnswer);
            }
        }

        return outList;
    }


    public static void main(String[] args) throws IOException {

//        int n  = 2;
//        String s = "1 0 5\n" +
//                "1 1 7\n" +
//                "1 0 3\n" +
//                "2 1 0\n" +
//                "2 1 1";

        int n = 100;

        String s = "1 345255357 205970905\n" +
                "1 570256166 75865401\n" +
                "1 94777800 645102173\n" +
                "1 227496730 16649450\n" +
                "1 82987157 486734305\n" +
                "1 917920354 757848208\n" +
                "1 61379773 817694251\n" +
                "1 330547128 112869154\n" +
                "1 328743001 855677723\n" +
                "1 407951306 669798718\n" +
                "1 21506172 676980108\n" +
                "1 49911390 342109400\n" +
                "1 980306253 305632965\n" +
                "2 736380701 402184046\n" +
                "2 798108301 416334323\n" +
                "1 254839279 1370035\n" +
                "1 109701362 2800586\n" +
                "1 374257441 165208824\n" +
                "1 624259835 477431250\n" +
                "1 629066664 454406245\n" +
                "1 135821145 763845832\n" +
                "1 480298791 138234911\n" +
                "1 553575409 835718837\n" +
                "1 13022848 624652920\n" +
                "1 974893519 882630870\n" +
                "1 137832930 216177975\n" +
                "1 453349691 969255659\n" +
                "1 138396076 91038209\n" +
                "1 699822497 941751038\n" +
                "1 116800806 64071662\n" +
                "1 815273934 8835809\n" +
                "1 658534867 657771609\n" +
                "1 183760807 179377441\n" +
                "1 93984556 636425656\n" +
                "1 231506463 836238924\n" +
                "1 214074594 709571211\n" +
                "1 649641434 509698468\n" +
                "2 523656673 709717705\n" +
                "2 261443586 330808140\n" +
                "1 75924023 449768243\n" +
                "1 849537714 354568873\n" +
                "2 641743742 124196560\n" +
                "1 19829224 995759639\n" +
                "1 244389335 108315212\n" +
                "1 877758467 421383626\n" +
                "1 573278148 474192994\n" +
                "2 561031511 448889978\n" +
                "1 773294404 980994962\n" +
                "2 33088709 716646168\n" +
                "1 760927835 441983538\n" +
                "1 273540687 783321829\n" +
                "1 5933845 384358662\n" +
                "1 543628702 372160176\n" +
                "2 136400466 910559291\n" +
                "2 546568738 393221347\n" +
                "1 812227065 694221123\n" +
                "1 311065574 103905420\n" +
                "2 571344361 185289590\n" +
                "1 99638520 173318136\n" +
                "1 854060080 407068012\n" +
                "2 980658213 778573744\n" +
                "2 412539660 476853104\n" +
                "1 530145366 36493537\n" +
                "1 604875364 100141497\n" +
                "2 650812104 64817757\n" +
                "1 141060009 766603553\n" +
                "1 598398952 418245941\n" +
                "1 262344011 431865586\n" +
                "2 56413893 546484833\n" +
                "1 400736735 673588153\n" +
                "1 642955232 803851098\n" +
                "1 917782037 935143105\n" +
                "1 658284524 745224102\n" +
                "1 103202288 501551287\n" +
                "1 162144918 12888783\n" +
                "1 16486753 67467208\n" +
                "1 671120703 941541277\n" +
                "1 47399694 77707668\n" +
                "1 122011395 946116527\n" +
                "1 924363862 886726236\n" +
                "2 657761235 540240467\n" +
                "1 203175991 279882007\n" +
                "2 304620923 162838413\n" +
                "1 440453449 117964712\n" +
                "2 941868853 887850334\n" +
                "1 293198923 466812643\n" +
                "1 461688477 532794906\n" +
                "1 315016797 733095902\n" +
                "1 265008751 913972757\n" +
                "1 887405255 139170948\n" +
                "2 754223230 426836947\n" +
                "1 945967814 852589735\n" +
                "1 168866283 309720694\n" +
                "1 373861145 94596540\n" +
                "2 984122495 20702849\n" +
                "2 233835636 180460242\n" +
                "1 172787631 643823473\n" +
                "1 273611372 616819555\n" +
                "1 196104599 690080895\n" +
                "1 527554061 434103342";

        List<String> sl = Arrays.asList(s.split("\n"));

        List<List<Integer>> queries = new ArrayList<>();

        sl.stream().forEach(a -> queries.add(
                Stream.of(a.split(" "))
                        .mapToInt(Integer::parseInt)
                        .boxed().collect(Collectors.toList())));
        List<Integer> result = DynamicArray.dynamicArray(n, queries);

    }
}

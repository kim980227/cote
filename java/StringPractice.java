import java.io.*;
import java.util.*;

public class StringPractice {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        int q,nk = 0;
        for (int test_case = 1; test_case < t + 1; test_case++) {
            int n = sc.nextInt();
            set.clear();
            int k = 1;

            while (set.size() < 10) {
                nk = n * k;
                k++;
                for(int tmp = nk; tmp>0; tmp/=10){
                    q=tmp%10;
                    set.add(q);
                }
            }
            System.out.printf("#%d %d\n", test_case,nk);
        }
        sc.close();
    }
}

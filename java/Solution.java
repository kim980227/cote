import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();

            int sum;
            int max = 0;

            if (m > n) {
                for (int i = 0; i <= m - n; i++) {
                    sum = 0;
                    for (int j = 0; j < n; j++) {
                        sum += a[j] * b[i + j];
                    }
                    if (sum > max)
                        max = sum;
                }
            } else {

                for (int i = 0; i <= n-m; i++) {
                    sum = 0;
                    for (int j = 0; j < m; j++) {
                        sum += b[j] * a[i + j];
                    }
                    if (sum > max)
                        max = sum;
                }
            }
            System.out.format("#%d %d\n", t, max);
        }
    }
}

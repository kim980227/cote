import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test_case = 1; test_case < t + 1; test_case++) {
            int[] src = new int[2];
            int[] dest = new int[2];
            int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int answer = 0;

            src[0] = sc.nextInt();
            src[1] = sc.nextInt();
            dest[0] = sc.nextInt();
            dest[1] = sc.nextInt();
            if (src[0] == dest[0])
                answer = dest[1] - src[1] + 1;
            else {
                answer += dest[1]+1;
                answer += (dom[src[0]-1]-src[1]);
                while(src[0] < (dest[0]-1)){
                    answer += dom[src[0]];
                    src[0] +=1 ;
                }
            }

            System.out.printf("#%d %d\n", test_case, answer);


        }//test_case loop
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test_case = 1; test_case < t + 1; test_case++) {
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            int n = sc.nextInt();
            int[][] nums = new int[n][n];

            int dir = 0; // 현재 방향 인데스
            int x = 0, y = 0;
            for (int i = 1; i <= n * n; i++) {
                nums[x][y]=i; //nums 채우기
                if (x + dx[dir] >= n || x + dx[dir] < 0 || y + dy[dir] >= n || y + dy[dir] < 0 || nums[x + dx[dir]][y + dy[dir]] != 0) {
                    //좌표가 n*n 를 벗어나지 않는 지 체크 + nums에 값이 입력되었는지 체크
                    dir = (dir + 1) % 4; // 방향전환 (배열 크기로 나누면 dir를 0으로 초기화 하지 않아도 됨)
                }
                x += dx[dir];
                y += dy[dir];
            }
            System.out.printf("#%d\n", test_case);
            for(int i = 0; i<n; i++){
                for (int j : nums[i]){
                    System.out.printf("%d ",j);
                }
                System.out.println();
            }
        }//test_case loop
    }
}
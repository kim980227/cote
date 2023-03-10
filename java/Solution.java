import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            int n = sc.nextInt();
            String s = ""; // 리스트보다 스트링(char의 리스트형이라고 생각)

            for(int i=0; i<n; i++) {
                String ch = sc.next();
                int r = sc.nextInt();

                for (int j=0; j<r; j++){
                    s += ch; // 스트링 컨캣(문자하니씩 반복수만큼 이어붙이기)
                }
            }

            System.out.printf("#%d\n", t);

            for(int i=0; i<s.length(); i++) { // 스트링 길이만큼 반복
                System.out.print(s.charAt(i)); // 스트링 인덱스에 대응되는 문자 하니씩 출력
                if( i%10 ==9 ) // 너비가 10 고정, 증가하는 i를 다시 0으로 초기화 필요 없이 10으로 나눈 나머지값으로 분기식 작성
                    System.out.println();
            }
            System.out.println(); // 이거까지 있어야 모든 테케 통과 왜지?=>하나의 테스트케이스가 끝나면 줄바꿈을 해야줘야됨 안그러면 이전 출력 에 #test_case가 붙여줘서 나옴.
//swea1946
        }
    }
}
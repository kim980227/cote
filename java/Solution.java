import java.util.*;

public class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt(); // 찾고자하는 값
        Random rand = new Random(10);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int n = rand.nextInt(10);
            arr[i] = n;
        }//배열 채워넣기

        int len = arr.length - 1;
        int stt = 0;
        int cnt =0;
        for (int x : arr) {
            System.out.printf("%d ", x);
            int mid = (len + stt) / 2;
            cnt++;
            if(target == x){
                System.out.printf("\n%d is here\n",x);
                break;
            }
            else if(target > x){
                stt = mid +1;
            }
            else if(x > target){
                len = mid-1;
            }
            if(cnt == arr.length)
                System.out.println("Can't Found");
        }
        Arrays.sort(arr);
        int bs = Arrays.binarySearch(arr,target);
        if(bs <= -1)
            System.out.println("Can't found");
        else
            System.out.printf("%d is in arr[%d]\n",target,bs);
    }
}
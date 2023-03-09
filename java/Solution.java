import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
//        int[] x = new int[len];
//        Random rand = new Random();
//        for (int i = 0; i < x.length; i++) {
//            x[i] = rand.nextInt(100);
//        }
//        for (int i = 0; i < x.length; i++) {
//            System.out.printf("x[%d] : %d\n", i, x[i]);
//        }
//        System.out.println();
//
//        reverse(x);
//        int idx = 0;
//
//        for (int n : x) {
//            System.out.printf("x[%d] : %d\n", idx, n);
//            ++idx;
//        }
//        System.out.println();
//
//        System.out.printf("sum : %d\n", sumOf(x));

//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = new int[a.length];
//        copy(a, b);
//        for (int n : b) {
//            System.out.printf("copy : %d\n", n);
//        }
//        rcopy(a, b);
//        for (int n : b) {
//            System.out.printf("rcopy : %d\n", n);
//        }

        int x =32;
        int r = sc.nextInt();
        char[] d= new char[10]; // 배열의 크기가 얼마나 될 지 알 수 없다 => 동적배열(ArrayList)
        char[] test= cardConvR(x,r,d);
        reverse(test);
        System.out.println(test);
    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    static void swap(char[] a, int idx1, int idx2) {
        char t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }
    static void reverse(char[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        return sum;
    }

    static void copy(int[] a, int[] b) {
        int i = 0;
        for (int n : a) {
            b[i++] = n;
        }
    }

    static void rcopy(int[] a, int[] b) {
        int i = a.length - 1;
        for (int n : a) {
            b[i--] = n;
        }
    }

    //기수변환(간단한 소인수분해 문제와 매우 유사)
    static char[] cardConvR(int x, int r, char[] d) { // x는 dividend r은 divisor
        String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // n진수 변환을 위한 족보
        int digits = 0;
        while (x != 0){
            d[digits++] = dchar.charAt(x%r); // 나머지를 char배열에 저장, 역순으로 출력해야됨.
            x /= r; // x = x/r
        }
        return d;
    }
}

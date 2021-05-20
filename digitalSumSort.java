package javacorer;

import java.util.Scanner;

public class digitalSumSort {

    public static int sum(int n) {
        int d = 0;
        while (n > 0) {
            d += n % 10;
            n /= 10;
        }
        return d;
    }

    //
    public static void mang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <n; j++) {
                if (sum(a[i]) > sum(a[j]) || (sum(a[i]) == sum(a[j]) && a[i] > a[j])) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }//100, 22, 4, 11, 31, 103]
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //
        System.out.println();
        mang(a,n);
    }
}

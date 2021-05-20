package javacorer;

import java.util.Scanner;

public class xauNhiPhan {

    int n = 1;
    int[] a = new int[100];

    public void in(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            // System.out.println();
        }
        System.out.println();

    }

    public void quayLui(int k) {
        for (int i = 0; i <= 1; i++) {
            a[k] = i;
            if (k == n) {
                in(a, n);
            } else {
                quayLui(k + 1);
            }
        }
    }

    public static void main(String[] args) {
        xauNhiPhan a = new xauNhiPhan();
        a.quayLui(1);
//
    }
}
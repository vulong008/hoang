package javacorer;

import java.util.Scanner;

public class tongchuso {

    public static int sumT(int n) {
        int sum = 0;
        while (n != 0) {
            int k = n % 10;
            sum += k;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("tong la: " + sumT(n));
        
    }
}

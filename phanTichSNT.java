package javacorer;
//Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
//	Ví dụ: Số 28 được phân tích thành 2 x 2 x 7

import java.util.Scanner;

public class phanTichSNT {

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void phanTich(int n) {
        int i = 2;
        while (n > 1) {
            {
                if (checkSNT(i)) {
                    if (n % i == 0) {
                        System.out.println(" " + i + " ");
                        n /= i;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        phanTich(n);
    }
}

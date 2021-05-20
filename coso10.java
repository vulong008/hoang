package javacorer;

import java.util.Scanner;

public class coso10 {

    public static void doiCoso(int n, int base) {
     if( n >= base)
         doiCoso(n/base,base);
     if(n % base > 9)
     {
         System.out.printf("%c " + n % base + 55);
     }
     else
            System.out.println((n % base));
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("so: " + n + " chuyen sang co so: " + b + " thanh: ");
//          System.out.println();
//        doiCoso(n, b);
     
        //System.out.println(35%16);
        String s1 = "welcome to split world";
  System.out.println("returning words:");
  for (String w : s1.split("\\s", 3)) {
   System.out.println(w);
  }
    }
}

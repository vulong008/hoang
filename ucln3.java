/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ucln3 {
    public static int ucln(int a,int b)
    {
        if(a==0||b==0)
            return a+b;
        while(a!=b)
        {
            if(a>b)
                a-=b;
            else
                b-=a;
        }
    return a;    
    }
    
    static void listDigit(int n, ArrayList<Integer> list) {
        int digit;
        while (n > 0) {
            digit = n % 10;//123%10 du 3---12%10 du 2
            list.add(digit);//dua 3 vao, dua 2 vao
            n /= 10;//11
        }
        Collections.reverse(list);
    }
    
    
    static   boolean checkNumberIncrease(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        listDigit(n, list);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    return false;
                }
            }
        }
        return true;
     }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int z = ucln(a,b);
//        System.out.println("ucln 3 so: " + ucln(z,c));
//        ArrayList<Integer> list = new ArrayList<>();
//        int n =sc.nextInt();
//        System.out.println(checkNumberIncrease(n)); 
//System.out.println(1234%10);
 int n = sc.nextInt();

        while(n!=0)
        {
            int a = n%10;
            System.out.print(a);
            n/=10;
        }

    
    }  
 
}

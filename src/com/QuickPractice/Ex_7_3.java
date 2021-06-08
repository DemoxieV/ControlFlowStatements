package com.QuickPractice;
//import java.util.Scanner;
public class Ex_7_3 {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
        int a,b;
        a=6;
        b=0;
        System.out.println((a%3)+" "+(b%4));
        if(a%3==b%4) System.out.println(a-b);
        else System.out.println(b-a);
    }
}

package com.QuickPractice;
import java.util.Scanner;
public class Ex_6_9 {
    public static void main(String[] args) {
        int i, x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        i=input.nextInt();
        x=i/100; // Сколько сотен?
        y=(i/10)%10; // Сколько десятков?
        z=i%10; // Сколько единиц?
        // Проверка четности каждого разряда
        if ((x%2==0)&(y%2==0)&(z%2==0))
            System.out.println("Число "+i+" четно-красивое");
        else System.out.println("Число "+i+" НЕ четно-красивое");
    }
}

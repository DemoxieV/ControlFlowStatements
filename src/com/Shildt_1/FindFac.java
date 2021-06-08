package com.Shildt_1;
// Использование вложенных циклов для нахождения делителей чисел от 2 до 100
public class FindFac {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) { //переменная диапазона
            System.out.print("Делители "+i+": ");
            for (int j = 2; j < i; j++) { // вычисление делителей
                if((i%j)!=0) continue;
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

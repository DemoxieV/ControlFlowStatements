package com.company;
//Цикл for с отрицательным приращением переменной
//Вывод чисел от 100 до -95, на каждом шаге переменная цикла уменьшается на 5
public class DecrFor {
    public static void main(String[] args) {
        int x;
        for (x = 100; x > -100; x-=5) {
            System.out.println(x);
        }

    }
}

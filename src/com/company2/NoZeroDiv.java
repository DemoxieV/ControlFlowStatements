package com.company2;
// Предотвращение деления на нуль с помощью тернарного оператора
public class NoZeroDiv {
    public static void main(String[] args) {
        int result;
        // способ 1
        for (int i = -5; i < 6; i++) {
            // Result присваивается результат деления 100 на i в том случае,
            // если значение i не равно 0, иначе result получит нулевое значение
            result = i != 0 ? 100/ i:0; // Деление на нуль предотвращается
            if (i != 0)
                System.out.println("100 / "+i+" равно "+result);
        }
        System.out.println();
        // способ 2
        for (int i = -5; i < 6; i++) {
            if(i != 0 ? true:false)
                System.out.println("100 / "+i+" равно "+100/i);
        }
    }
}

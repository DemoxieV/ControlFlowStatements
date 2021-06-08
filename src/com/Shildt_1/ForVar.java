package com.Shildt_1;

//Объявление переменной цикла в цикле for
//Вычислим сумму и факториал чисел от 1 до 5
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1; //0!=1

//  Вычисление суммы и факториала чисел от 1 до 5
        for (int i = 1; i <= 5; i++) { //i выступает в качестве счётчика (переменная диапазона)
            sum += i; //сумма (переменная результата)
            fact *= i; //факториал (переменная результата)
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}

package com.company;
//Вычислить целые степени числа 2: от 2^0 до 2^9
public class PowerTest {
    public static void main(String[] args) {
        int result=(int) Math.pow(2,0);
        System.out.println("2 в степени 0 равно " + result);
        for (int i = 1; i < 10; i++) { //переменная диапазона степени
            result *= 2;
            System.out.println("2 в степени " + i + " равно " + result);
        }
        }
    }


package com.company;
//Вычислить целые степени числа 2: от 2^0 до 2^9
public class Power {
    public static void main(String[] args) {
        int e, result;
        for (int i = 0; i < 10; i++) { //переменная диапазона степени
            result=1;
            e=i;
            while (e>0){ // на первом шаге цикла for цикл while пропускается (e=0)
                result *= 2;
                e--;
            }
            System.out.println("2 в степени "+i+" равно "+result);
        }
    }
}

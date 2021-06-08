package com.Shildt_1;
//Игра в угадывание букв tag 1.0
public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь её угадать: ");
        ch=(char) System.in.read(); //чтение символа с клавиатуры
        if (ch==answer) System.out.println("*** Правильно! ***");
        else System.out.println("...Не угадали :Р");
    }
}

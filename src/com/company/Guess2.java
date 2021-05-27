package com.company;
//Игра в угадывание букв - tag 1.1
public class Guess2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь её угадать: ");
        ch=(char) System.in.read(); //чтение символа с клавиатуры
        if (ch==answer) System.out.println("*** Правильно! ***");
        else {
            System.out.print("...Не угадали. Нужная буква находится ");
            //вложенная инструкция if
            if(ch < answer) System.out.println("ближе к концу алфавита.");
            else System.out.println("ближе к началу алфавита");
        }
    }
}

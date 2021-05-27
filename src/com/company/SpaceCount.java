package com.company;

public class SpaceCount {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int count = 0;
        System.out.println("Введите столько пробелов, сколько хочется.");
        System.out.println("Нажмите '.'(точку) для выхода из программы.");
        do {
            ch = (char) System.in.read();
            if(ch == ' ') count++;
        } while (ch != '.');
        System.out.println("Количество считанных пробелов = " + count);
    }
}

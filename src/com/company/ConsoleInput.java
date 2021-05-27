package com.company;
//Чтение символов с клавиатуры
public class ConsoleInput {

    public static void main(String[] args) throws java.io.IOException {
	char ch;
        System.out.print("Нажмите нужную клавишу, а затем Enter: ");
        ch=(char) System.in.read(); //Получить символ (ввод символа с клавиатуры)
        System.out.println("Вы нажали клавишу "+ch);
    }
}

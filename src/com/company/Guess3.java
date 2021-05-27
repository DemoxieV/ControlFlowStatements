package com.company;
//Игра будет продолжаться, пока пользователь не угадает букву
public class Guess3 {
    public static void main(String[] args) throws java.io.IOException{
        char ch, ignore, answer='K';
        do{
            System.out.println("Задумана буква из диапазона A-Z");
            System.out.print("Попытайтесь её угадать: ");
            ch=(char) System.in.read();
//  Отбрасвание всех остальных символов во входном буфере до тех пор, пока не достигли конца строки
//Enter-клавиша перехода на новую строку, если её не нажать, то символы остануться во входном буфере
            do{
                ignore=(char) System.in.read();
            } while(ignore != '\n');
            if(ch == answer) System.out.println("*** Правильно! ***");
            else {
                System.out.print("... Не угадали. Нужная буква находится ");
                if (ch<answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        } while (answer != ch);
    }
}

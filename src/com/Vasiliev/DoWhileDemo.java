package com.Vasiliev;
// Для целого числа вычисляется и отображается бинарный код

import javax.swing.JOptionPane;

public class DoWhileDemo {
    // Статический метод для бинарного кода числа:
    static String coder(int number) {
        String s = ""; // Результирующая переменная
        int n = number; // Числовая переменная для вычисления бинарного кода
        do {
            //Добавление к текстовой строке слева параметра в бинарном представлении
            //Деление по модулю вернет 0 или 1 и дописываем значение в строковую переменную s
            s = (n % 2) + s;
            //Значение n уменьшаем в 2 раза
            n /= 2;
        } while (n != 0); //цикл выполняется пока числовая переменная не станет равна 0, помним про целочисленное деление без округления
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title = "Вычисление бинарного кода";
        input = JOptionPane.showInputDialog(null, "Введите целое число", title, JOptionPane.QUESTION_MESSAGE);

        //Проверка ввода
        if (input == null) {
            System.exit(0);
        }

        //Определение числа на основе текста
        int num=Integer.parseInt(input);
        String code=coder(num);

        //Отображение диалогового окна
        String text="Вы ввели число: "+num;
        text+="\nБинарный код числа: "+code;
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}

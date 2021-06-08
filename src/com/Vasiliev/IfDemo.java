package com.Vasiliev;
import javax.swing.*;

public class IfDemo {
    public static void main(String[] args) {
        String input, txt, title;
        int number;
        ImageIcon img;
        // Отображение диалогового окна с полем для ввода:
        input=JOptionPane.showInputDialog(null, "Введите целое число", "Проверка числа", JOptionPane.QUESTION_MESSAGE);
        // Проверка ввода:
        if(input==null){
            JOptionPane.showMessageDialog(null, "Вы не ввели число!", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        // Преобразование введенного пользователем текста в число:
        number=Integer.parseInt(input);

        // Проверка числа на (не)четность:
        if(number%2==0){
            // Если число четное, создаем объект пиктограммы (иконка) и соответствующий текст и заголовок сообщения
            img=new ImageIcon("H:/ProjectPics/even.png");
            txt="Число "+number+" - четное!";
            title="Четное число";
        }
        else{ // Если число нечетное, создаем другой объект пиктограммы (иконка) и соответствующий текст и заголовок сообщения
            img=new ImageIcon("H:/ProjectPics/odd.png");
            txt="Число "+number+" - нечетное!";
            title="Нечетное число";
        }

        // Отображение диалогового окна с результатом проверки на (не)четность
        JOptionPane.showMessageDialog(null, txt, title, JOptionPane.PLAIN_MESSAGE, img);
    }
}

package com.Vasiliev;
import javax.swing.*;
public class MultiIfDemo {
    public static void main(String[] args) {
        // Объектная переменная для будущей иконки
        ImageIcon img;
        // Текстовая переменная для записи названия животного
        String animal;
        // Текстовая переменная с начальным значением, определяющим путь к файлу
        String file="H:/ProjectPics/";
        // Текстовые переменные для названий животных
        String wolf="Волк";
        String fox="Лиса";
        String bear="Медведь";
        String raccoon="Енот";
        // Считывание названия животного
        animal=JOptionPane.showInputDialog(null,wolf+", "+fox+" или "+bear+"?", "Укажите название животного", JOptionPane.QUESTION_MESSAGE);

        // Проверка пользовательского ввода
        // Eсли пользователь отменил ввод
        if(animal==null){
            System.exit(0);
        }
        // Если введено "Волк"
        else if(animal.equalsIgnoreCase(wolf)){
            file+="wolf.png";
            animal=wolf;
        }
        // Если введено "Лиса"
        else if(animal.equalsIgnoreCase(fox)){
            file+="fox.png";
            animal=fox;
        }
        // Если введено "Медведь"
        else if(animal.equalsIgnoreCase(bear)){
            file+="bear.png";
            animal=bear;
        }
        //Неизвестное животное
        else{
            file+="racoon.png";
            animal=raccoon;
        }

        // Создание объекта пиктограммы
        img=new ImageIcon(file);
        // Отображение диалогового окна
        JOptionPane.showMessageDialog(null, img, animal, JOptionPane.PLAIN_MESSAGE);

    }
}

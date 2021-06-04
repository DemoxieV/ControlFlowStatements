package com.company3;

public class Help{
    public static void main(String[] args) throws java.io.IOException {
//  Начало работы программы - отображение меню справки
        System.out.println("Справка:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.print("Выберите номер раздела: ");
//  Считывание пользовательского ввода:
        char choice= (char) System.in.read();
        System.out.println();
//  Отображение сведений по выбранному пользователем разделу
        switch (choice){
            //Важно: константа при case символьное значение - берем в символьные литералы
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println(" else инструкция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность инструкций;");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Информация не найдена. Повторите попытку.");
        }

    }
}

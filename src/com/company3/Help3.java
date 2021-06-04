package com.company3;

public class Help3 {
    public static void main(String[] args) throws java.io.IOException {
//  Начало работы программы - отображение меню справки
        char choice, ignore;
        for (; ; ) {
            do {
                System.out.println("Справка:");
                System.out.println("\t1. if");
                System.out.println("\t2. switch");
                System.out.println("\t3. for");
                System.out.println("\t4. while");
                System.out.println("\t5. do-while");
                System.out.println("\t6. break");
                System.out.println("\t7. continue\n");
                System.out.print("Выберите номер раздела (q-выход из программы): ");
//  Считывание пользовательского ввода:
                choice = (char) System.in.read();
//  Избавляемся от ненужных символов во входном буфере:
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if(choice == 'q') break;

            System.out.println();
//  Отображение сведений по выбранному пользователем разделу
            switch (choice) {
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
                case '3':
                    System.out.println("Цикл for:\n");
                    System.out.print("for (инциализация; условие; итерация)");
                    System.out.println(" инструкция;");
                    break;
                case '4':
                    System.out.println("Цикл while:\n");
                    System.out.println(" while(условие) инструкция;");
                    break;
                case '5':
                    System.out.println("Цикл do-while:\n");
                    System.out.println("do {");
                    System.out.println(" инструкции;");
                    System.out.println("} while (условие);");
                    break;
                case '6':
                    System.out.println("Инструкция break:\n");
                    System.out.println("break; или break метка;");
                    break;
                case '7':
                    System.out.println("Инструкция continue:");
                    System.out.println("continue; или continue метка;");
                    break;
//            default:
//                System.out.println("Информация не найдена. Повторите попытку.");
            }
            System.out.println();
        }
    }
}

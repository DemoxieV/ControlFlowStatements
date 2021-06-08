package com.Shildt_2;
//Выполнение цикла до тех пор, пока квадрат значения переменной i меньше значения переменной num
public class BreakDemo {
    public static void main(String[] args) {
        int num=100;
        for (int i=0; i<num; i++){ //Диапазон от 0 до 100
            if(i*i >= num) break; //прекращение выполнения цикла при заданном условии
            System.out.print(i+" ");
        }
        System.out.println("Цикл завершен");
    }
}

package com.Shildt_1;
//Демонстрация многоступенчатой конструкции if-else-if
public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 6; x++) { //6 - количество шагов, которые должны быть выполнены
            if(x==1)
                System.out.println("x=1");
            else if(x==2)
                System.out.println("x=2");
            else if(x==3)
                System.out.println("x=3");
            else if(x==4)
                System.out.println("x=4");
            else //условие по умолчанию
                System.out.println("Значение х находится вне диапазона 1-4"); //оператор по умолчанию
        }
    }
}

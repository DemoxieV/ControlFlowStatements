package com.Shildt_1;
//пропуск отдельных составляющих в определении цикла for
public class Empty {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10 ;) {
            System.out.println("Проход №"+i);
            i++; //инкрементирование переменной цикла
        }
        System.out.println();
        int j=0; //выносим инициализацию за пределы цикла
        for(;j<10;){
            System.out.println("Проход №"+j);
            j++;
        }
        System.out.println();
        int sum=0; //Суммируются числа от 1 до 5
        for (int a = 1; a <= 5; sum += a++); //В цикле отсутствует тело
        System.out.println("Сумма: "+sum);
    }
}

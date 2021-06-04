package com.company2;
//Вывод четных чисел в пределах от 0 до 100
public class ContinueDemo {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <=100 ; i++) {
//  При обнаружении нечетного числа шаг итерации завершается досрочно в обход println()
//  Continue вызывает передачу управления условному выражению, после чего продолжение цикла
            if((i%2)!=0) continue;
            System.out.println(i);
        }
    }
}

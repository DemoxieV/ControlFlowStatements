package com.company;

public class Break6 {
    public static void main(String[] args) {
        int x=0, y=0;
//  Здесь метка располагается перед циклом for - останаливаем весь цикл
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if(y==2) break stop1;
                System.out.println("x и y: "+x+" "+y);
            }
        }
        System.out.println();
//  Здесь метка расположена перед открывающей фигурной скобкой внешнего цикла - останавливаем вложенный цикл
        for (x = 0; x < 5; x++)
            stop2: {
                for (y = 0; y < 5; y++) {
                    if(y==2) break stop2;
                    System.out.println("x и y: "+x+" "+y);
                }
            }
        }
    }


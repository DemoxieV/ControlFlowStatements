package com.company;

public class NoBreak {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <=5; i++) {
            switch (i) { //"Проваливание" потока выполнения сквозь все ветви case - break отсутствует
                case 0:
                    System.out.println("i<1");
                case 1:
                    System.out.println("i<2");
                case 2:
                    System.out.println("i<3");
                case 3:
                    System.out.println("i<4");
                case 4:
                    System.out.println("i<5");
            }
            System.out.println();
        }
            for (int j = 0; j <=5; j++) {
                switch (j){
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("j равно 1, 2 или 3"); //общий код для 3х ветвей
                        break;
                    case 4:
                        System.out.println("j=4");
                        break;
                }
            System.out.println();
            }
        }
    }


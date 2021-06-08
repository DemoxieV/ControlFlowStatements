package com.Shildt_2;

//Расширенный break с меткой для выхода из ряда вложенных блоков
//программа возобновляется с конца именованного блока (адресат: инструкция break)
public class Break4 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni равно "+i);
                        if(i==1) break one; //Переход по метке в конец блока one
                        if(i==2) break two;
                        if(i==3) break three;

                        //Эта строка кода никогда не будет достигнута
                        System.out.println("не будет выведено");
                    }
                    System.out.println("После блока three");
                }
                System.out.println("После блока two");
            }
            System.out.println("После блока one");
        }
        System.out.println("После цикла for");
    }
}

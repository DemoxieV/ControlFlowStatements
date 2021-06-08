package com.Vasiliev;

public class SwitchDemo {
    // по номеру дня недели возвращается текст с названием дня
    static String getDay(int num){
        String day; //для записи результата
        // Оператор выбора дня недели
        switch(num){
            case 1:
                day="Понедельник";
                break;
            case 2:
                day="Вторник";
                break;
            case 3:
                day="Среда";
                break;
            case 4:
                day="Четверг";
                break;
            case 5:
                day="Пятница";
                break;
            case 6:
                day="Суббота";
                break;
            case 7:
                day="Воскресенье";
                break;
            default:
                day="неизвестно";
        }
        return day;
    }
    //по номеру дня недели возвращается текст - будний или выходной день
    static String testDay(int num){
        String day;
        switch(num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                day="будний день";
                break;
            case 6:
            case 7:
                day="выходной день";
                break;
            default:
                day="неизвестно";
        }
        return day;
    }

    public static void main(String[] args) {
        //проход по дням неделям в диапазоне от 0 до 8 включительно
        for (int i = 0; i <= 8; i++) {
            //Вызов статических методов
            System.out.println(i+": "+getDay(i)+"\t- "+testDay(i));
        }
    }
}

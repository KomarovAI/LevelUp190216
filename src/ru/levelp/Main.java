package ru.levelp;

/**
 * Created by vladimir on 19.02.16.
 */
public class Main {

    /**
     * Метод main выполняется при старте программы
     */
    public static void main(String[] args) {
        //первая строка программы
        //однострочный комментарий
        /*
        Многострочный
        комментарий
         */
        System.out.println("Hell\\o, \"World!\"");
        System.out.println("Line 2");
        //Экранирование символов
        // \t - табуляция
        // \n - перенос строки
        // \" \\

        /*
        Задание:
        (\\___/)
        (='.'=)
        (\")_(\")
         */

        //Переменные
        //Арифметические операции

        int numberOfStudents; //так называют переменные и методы
        int x; //объявление переменной
        int y, z, p = 4, t;
        x = 10; //инициализация переменной
        x = -37 + 9;
        System.out.println("x = " + x + " m"); //конкатенация
        System.out.println(""+x+p);
        x = 5; //присваивание значения
        System.out.println(x);

        String str = "Hello, "+"World!";
        str = "First string var";
        System.out.println(str);

        double doubleVar = 3.14;
        System.out.println(doubleVar/2);

        System.out.println(x/2); //=2
        System.out.println(x%2); //=1
        System.out.println(10%3);//=1

        //+ - * /
        //%

        boolean boolVar = true;
        boolVar = false;

        char ch = 'A';
        System.out.println((char)66);
    }
}

/*
Домашнее задание

ax + b = 0
1) Линейные уравнения
2) Найти как пользователю вводить в командную строку данные
3) Пользователь вводит a и b с клавиатуры, после чего выводится ответ:
    x = ответ
4) Читать: Типы данных и диапазоны значений

 */

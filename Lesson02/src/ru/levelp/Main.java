package ru.levelp;

/**
 * Created by vladimir on 21.02.16.
 */
public class Main {
    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//
//        a = b;
//
//        System.out.println(a);
//
//        a = !a; // ! - отрицание или инвертирование
//
//        System.out.println(a);
//
//        System.out.println(a == b); // == - сравнение true - если равны
//        System.out.println(a != b); // true - если не равны
//
//        int x = 7;
//        int y = 2;
//
//        boolean result = !(x > y) == b;
//        System.out.println("result = " + result);
//        /*
//        !
//        >, <
//        >=, <=
//        ==, !=
//         */
//
//        /*
//        if (логическое выражение) { //условие
//            действия, если логическое выражение == true
//        }
//
//         */
//
//        b = true;
//        if (b) {
//            System.out.println("b = true");
//        }
//        //остальной код
//
//        /*
//        Задание:
//        даны 3 целых числа
//        int a = 6;
//        int b = 2;
//        int c = -30;
//
//        используя блоки if и логические операции,
//            найти минимальное значение
//         */

        int a = 6;
        int b = 2;
        int c = -30;

        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("min = " + min);

        /*
        Сортировка:
        a <= b <= c
         */


        int temp;
        //3 2 1
        if (b < a) {
            //нет переменной temp
            temp = a;
            a = b;
            b = temp;
//            if () {
//                //temp тут уже есть
//            }
        }
        //2 3 1
        if (c < a) {
            temp = a;
            a = c;
            c = temp;
        }
        //1 3 2
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        //1 2 3

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

//        if (a > b) {
//            //тут нет кода
//            if (a > c) {
//                //код только тут
//                System.out.println("a - max");
//            }
//            //тут нет кода
//        }

        a = 10;
        b = 3;
        c = 1;
        if (a > b && a > c) { // && - логическое И; коньюнкция; логическое произведение
            System.out.println("a - max");
        }
        // выражение1 && выражение2 - дает true, если оба выражения true

        if (a > b || a > c) {
            //выполнится, если хотя бы одно выражение true
        }
        // || - логическое ИЛИ; дизъюнкция; логическая сумма

        if (true && false || false && true);
        // приоритет && > ||

        int x;
        short sx = 5;

        x = sx; //неявное преобразование типов

        double d = 3.14;

        d = x;

        sx = (short) d;//явное преобразование типов
        char ch = 'a';
        System.out.println((int)ch);

//        if (a < b) {
//            System.out.println("a < b");
//        } else if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a == b");
//        }



//        if (a < b)
//            System.out.println("min = "+a);
//        else {
//            System.out.println("min = " + b);
//            System.out.println("hello!");
//        }


    }

    /*
    Домашка:
    Решение квадратных уравнений
    ax^2+bx+c=0
    1) Найти как решать
    2) Пользователь вводит a,b,c
    3) Выводится ответ:
        x1 = 5
        x2 = 3;

        x1 = -3+4i
        x2 = -3-4i

    4) Приведение типов
    5) Math:
        возведение в степень
        взятие квадратного корня
     */
}

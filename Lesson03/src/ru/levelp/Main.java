package ru.levelp;

public class Main {
    public static void main(String[] args) {

//        while (условие) {
//            //код, который будет выполняться, пока условие true
//        }

//        int i = 0;
//        while (i < 10) {
//            //один проход цикла - итерация
//            System.out.println("Я люблю Java " + i);
//            i = i + 1;
//        }

        //1 2 3
        //a b c
        /*
        a 1
        a 2
        a 3
        b 1
        b 2
        b 3
        c 1
        c 2
        c 3
         */

//        i = 1;
//        char ch = 'a';
//        while (i < 4) {
//            while (ch < 'd') {
//                System.out.println(i + " " + ch);
//                ch++;
//            }
//            i++;
//            ch = 'a';
//        }

//        int x = 4;
//        x += 3-1; // x = x + 3 - 1
//        x -= 7; //x = x - 7
//        x++; // инкремент -> x +=1; x = x+1
//        x--; // декремент -> x -= 1; x = x-1

        /*
        Вывести таблицу умножения
        1 2 3 4 5 6 7     8  9
        2 4 6 8 10 12 14 16 18
        ...
        9 18 27 36 45 54 63 72 81

        Пользователь вводит x1,x2,y1,y2
        x1,x2 - номера столбцов
        y1,y2 - Номера строк
            x1 ... x2
        y1
        ...
        y2
         */
//        i = 1;
//        int j = 1;
//        while (i < 10) {
//            while (j < 10) {
//                System.out.print(i * j + "\t");
//                j++;
//            }
//            System.out.println();
//            j = 1;
//            i++;
//        }

//        for (инициализация счетчика; условие;
//             операция в конце каждой итерации) {
//            //тело цикла
//        }
//        for (int k = 0; k < 234; k++) {
//            System.out.println(k);
//        }

//        int k = 0;
//        while (k < 5) {
//            System.out.println(k);
//            k++;
//        }
//        k = 90;


//        array[0] = 99;
//        array[1] = 98;
        //...
        //array[99] = 0;

//        System.out.println(array[1]);

//        for (int i = 0; i < array.length; i++) {
//            array[i] = array.length - i + 5;
////            break; - аварийное прерывание цикла
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30 - 77); //0..1 -> 0..100
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        -347 935

        //Math.random()*1282-347;
        //Math.random()*L-d   L - длина диапазона
//                            d - сдвиг диапазона

        //Заполнить в нужном диапазоне
        //Вывести массив в одну строку
        //Вывести min = ...
    }

    /*
    Домашнее задание:
    1) Разобраться, чем отличаются постфиксный инкремент(дек.)
        и префиксный инкремент(дек.)

        i++; //постфиксный
        ++i; //префиксный
        int x = 0;
        int i = 0;
        x = i++; // x -> 0; i -> 1
        x = ++i; // i -> 2; x -> 2

        i = x++; // i = 2

    2) Доделать задание с таблицей умножения (с заданием диапазонов)
        Доделать поиск минимума, если не успели
    3) Сортировка "пузырьком" массива со случайными числами
    4) Сортировка еще двумя простыми методами, которые найдете в интернете
        В помощь сайт sorting.at

        Книги по алгоритмам:

        1) Седжвик "Алгоритмы на Java"
        2) Роберт Лафоре "Алгоритмы и структуры данных на Java"
        3) Кнут "Алгоритмы..." 1 том

    n - размер массива
    (n - 1) пар
    (n - 1) пробегов по массиву максимум
     */
}

package ru.levelp;

/**
 * Created by vladimir on 28.02.16.
 */
public class Main {
    public static void main(String[] args) {
        //Примитивные типы данных: int, char, boolean, double

        /*
        Имя
        Возраст
        Очник?
        Средний балл
         */

        //int x; тип переменная
        //Student dima класс объект
        Student vasya = new Student();
        vasya.name = "Василий";
        vasya.age = 20;
        vasya.isFullTime = true;
        vasya.avr = 4.8;

        //vasya.print();
        //System.out.println(vasya.name + " "...);

        Student vova = new Student();
        vova.name = "Вова";
        vova.age = 21;
        vova.isFullTime = false;
        vova.avr = 2.4;

//        final double NUMBER_OF_STUDENTS = 10;

        //vova.print();

        MyMath math = new MyMath();
        int x = 2;
        x = math.min(3, 10); //здесь в скобках - аргументы
        System.out.println(x);

        Student[] students = new Student[100];
        students[0] = new Student();
        students[0].name = "Петр";
    }

    /*
    1 - Добавить студента
    2 - Вывести список студентов
    3 - Выйти из программы

    1:
        Введите имя: ...
        Введите возраст: ...

    2:
        print()
     */

    /*
    Домашнее задание:
    1) Доделать программу со списком студентов
    2) Создать класс Algorithms с двумя методами:
        НЕ ПРИМЕНЯТЬ СТАНДАРТНЫЕ МЕТОДЫ СРАВНЕНИЯ СТРОК И СОРТИРОВКИ
        1. public int compare(String a, String b)
             возвращает -1, если строка a раньше по алфавиту, чем b
                         0, если строки a и b одинаковы
                         1, если строка b раньше, чем a

             Уровни сложности (рекомендуется выполнять в этом порядке):
                * Сортировка только по первой букве
                ** Сортировка по всем буквам с учетом длины

                Алексей             Алекс
                Алекс       ->      Александр
                Александр           Алексей

        2. public Student[] abcBubbleSort(Student[] students)
            получает массив студентов,
            сортирует его по алфавиту,
            возвращает отсортированные массив
     3) Вывод студентов на экран всегода в отсортированном по алфавиту
        (по имени) виде

     */
}

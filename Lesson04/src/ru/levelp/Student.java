package ru.levelp;

/**
 * Created by vladimir on 28.02.16.
 */
public class Student {
    //Поля определяют СОСТОЯНИЕ объекта
    //Поля
    String name;
    int age;
    boolean isFullTime; //CamelCase
    double avr;

    //ПОВЕДЕНИЕ объектов определяют методы
    //Метод класса Student
    public void print() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Очное: " + isFullTime);
        System.out.println("Средний балл: " + avr);
    }
}

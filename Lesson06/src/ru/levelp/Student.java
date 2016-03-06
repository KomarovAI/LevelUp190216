package ru.levelp;

/**
 * Created by vladimir on 28.02.16.
 */
public class Student {
    //Поля определяют СОСТОЯНИЕ объекта
    //Поля
    public static final int FROM_RUS = 0;
    public static final int FROM_KAZ = 1;
    public static final int FROM_BEL = 2;
    private String name;
    private int age;
    private boolean isFullTime; //CamelCase
    private double avr;
    private int from;//0 Россия 1 Казахстан 2 Беларусь

    //ПОВЕДЕНИЕ объектов определяют методы
    //Метод класса Student
    public void print() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Очное: " + isFullTime);
        System.out.println("Средний балл: " + avr);
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public void setFrom(int newFrom) {
        from = newFrom;
    }

    public int getFrom() {
        return from;
    }
}

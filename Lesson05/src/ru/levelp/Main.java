package ru.levelp;

/**
 * Created by vladimir on 04.03.16.
 */
public class Main {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random()*100-50);
//        }
//
//        int[] temp = new int[array.length+1];
//        for (int i = 0; i < array.length; i++) {
//            temp[i] = array[i];
//        }
//        array = temp;
//
//        array[10] = 1000;
//        for (int i = 0; i < 11; i++) {
//            System.out.println(array[i]);
//        }

        MyArrayList list = new MyArrayList();
        list.add(55);
        list.add(93);
        list.add(34);
        //55 93 34
        list.insert(1, 48);
        //55 48 93 34
        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //55 48 93

    }
    /*
Домашка
1) Доделать MyArrayList
2) Добавить метод clear() - очищает коллекцию
3) Создать класс-коллекцию MyStack - коллекция по принципу LIFO
        (Last Input First Output) - РАЗОБРАТЬСЯ, ЧТО ТАКОЕ СТЕК И КАК ОН РАБОТАЕТ
	- можно использовать так же массив, как и для MyArrayList
	- можно использовать сам MyArrayList
	- должны быть методы:
		pop()
		peek()
		push()
		size()
		clear()
4) Использовать MyArrayList в программе студентов:
	добавить возможность удаления студента по имени
*/
}

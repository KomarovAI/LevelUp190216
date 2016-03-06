package ru.levelp;

/**
 * Created by vladimir on 04.03.16.
 */
public class MyArrayList {
    //private - доступ к полю/методу возможен только внутри класса,
    //          в котором это поле/метод объявлено
    private int[] values;

    public void add(int value) {
        if (values == null) {
            values = new int[1];
            values[0] = value;
        } else {
            int[] temp = new int[values.length + 1];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            temp[temp.length - 1] = value;
            values = temp;
        }
    }

    public int get(int index) {
        if (values == null) {
            System.err.println("Error: ArrayList is empty");
            return 0;
        }
        return values[index];
    }

    public int size() {
        if (values == null) {
            return 0;
        }
        return values.length;
    }

    //4 65 98 43
    //int x = remove(2)
    //x <- 98
    public int remove(int index) {
        return 0;
    }

    //4 65 98 43
    //insert(1, 87)
    //4 87 65 98 43
    public void insert(int index, int value) {

    }
}

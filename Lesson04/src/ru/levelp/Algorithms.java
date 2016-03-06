package ru.levelp;

/**
 * Created by vladimir on 04.03.16.
 */
public class Algorithms {

    public static int compare(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                return -1;
            }
            if (a.charAt(i) > b.charAt(i)) {
                return 1;
            }
        }
        if (a.length() < b.length()) {
            return -1;
        }
        if (a.length() > b.length()) {
            return 1;
        }
        return 0;
    }

    public static void sort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (compare(students[j].name, students[j + 1].name) == 1) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        //return students;
    }
}

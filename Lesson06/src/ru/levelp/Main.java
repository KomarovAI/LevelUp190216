package ru.levelp;

/**
 * Created by vladimir on 06.03.16.
 */
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
////        list.add("Line 1");
////        list.add(new Scanner(System.in));
////        String str = (String) list.get(0);
////        String str2 = (String) list.get(1);
//
//        list.add("Line 1");
//        String str = list.get(0);
//
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Linked line 1");
//
//        HashSet<String> set = new HashSet<>();
//        set.add("line");
//        set.add("line");
//
//        System.out.println(set.size());
//
//        TreeSet<String> tree = new TreeSet<>();
//        tree.add("line");
//
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("line 1");
//        linkedHashSet.add("line 2");
//
//        //foreach
//        for (String s : linkedHashSet) {
//            System.out.println(s);
//        }
//
////        for (int i = 0; i < 10; i++) {
////            linkedList.add("line " + i);
////        }
////        System.out.println("Строки добавлены");
////        for (Student s : linkedList) {
////            s.name = "new Name";
////        }
////        System.out.println("foreach закончил работу");
////        for (int i = 0; i < linkedList.size(); i++) {
////            System.out.println(linkedList.get(i)); //<- ТУТ ВАЖНО get(i)
////        }
//
//        Hashtable<String, String> table = new Hashtable<>();
//        table.put("key1", "value1");
//        System.out.println(table.get("key1"));
//        table.put("key1", "value2");
//        System.out.println(table.get("key1"));
//        System.out.println(table.get("key2"));
//
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(345);
//
//        Integer x = 4;
//        Double d;
//        Character ch;

        MyArrayList list = new MyArrayList();
        list.add(5);


        Student st = new Student();
        st.setName("Vova");
        st.setAge(22);

        System.out.println(st.getName());

        st.setFrom(Student.FROM_RUS);

        if (a < b)
            min = a;
        else
            min = b;

        true ? min = a : min = b;


    }

    public static int min(int a, int b) {
//        if (a < b)
//            return a;
//        else
//            return b;
        return a < b ? a : b;
    }

    /*
    Все это делается безопасным
    1) LinkedList - что это такое? как работает? сделать свой
    2) Как пробегаться по всем элементам Hashtable или HashMap
        - вывести все пары ключ-значение
    3) Конструкторы, ключевое слово this. Создать конструкторы для класса Student
    4) Наследование, полиморфизм
     */
}

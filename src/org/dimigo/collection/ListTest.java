package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // 1. list 계열 : Arraylist
//        List list = new ArrayList();
////        list.add("홍길동")
////        list.add(100)
////        list.add(new Dog("멍멍이"));
////        String s = (String)list.get(0);

        //제네릭(Generic)
        List<String> list = new ArrayList();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");

        list.set(2,"바나나");
        list.remove("딸기");
        printlist(list);

        System.out.println("");
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        list.clear();
        printlist(list);

    }

    private static void printlist(List<String> list) {
        for (String value : list) {
            System.out.print(value + "|");
        }
    }
}

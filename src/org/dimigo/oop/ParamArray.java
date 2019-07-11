package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printIntArray(intArr);

        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(names, "김");
        printStrArr(names);
    }

private static void printIntArray(int[] intArr){
    for (int value : intArr){
        System.out.println(value + "|");
    }
}

private static void printStrArr(String[] strArr){
        for (String value : strArr){
            System.out.println(value + "|");
        }
    }


private static void add(int[] intArr, int num){
    for(int i= 0; i<5 ; i++){
        intArr[i]+=10;
    }
}

private static void changeName(String[] names, String a){
        for(int i=0; i<names.length; i++){
            names[i] = "김"+names[i].substring(1);
        }

}
}
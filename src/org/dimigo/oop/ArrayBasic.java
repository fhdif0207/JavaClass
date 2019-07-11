package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 : int, long, double, char, float, boolean, short
        // 참조형 : String, Book, Car, Scanner, Random, StringBuilder
        Book book = null;

        int[] intArr = null;
        intArr = new int[5];

        // double타입 5개짜리 배열 생성 후 출력
        double[] doubleArr = null;
        doubleArr = new double[5];

        for(double value : doubleArr){
            System.out.print(value+" ");
        }
        System.out.println();

        //배열 선언 시 초기화
        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int[]{1, 2, 3, 4, 5};

        printArray(intArr2);

        //참조형 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "박정희";
        strArr[1] = "김대중";
        strArr[2] = "김영삼";
        printArray(strArr);

        String[] strArr2 = {"박정희", "김대중", "김영삼"};
        String[] strArr3 = new String[] {"박정희", "김대중", "김영삼"};
        printArray(strArr2);
        printArray(strArr3);
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr){
            System.out.print(value+" ");
        }
        System.out.println();
    }
    private static void printArray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value+" ");
        }
        System.out.println();
    }
}

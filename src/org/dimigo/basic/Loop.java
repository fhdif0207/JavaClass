//
//package org.dimigo.basic;
//
//import java.util.Scanner;
//
//public class Loop {
//    public static void main(String[] args) {
//        // 1. for문
//        // 구구단 출력하기
//
//        for(int i = 2; i<10 ; i++){
//            for(int j = 1; j<10 ; j++){
//                System.out.println(i + "x" + j + "=" + i*j);
//            }
//        }
//        // 2. for each문
//        int [] arr = {1, 2, 3, 4, 5};
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        for(int value : arr){
//            System.out.print(value + "");
//        }
//
//        //ITZY 멤버 출력
//        String[] idol = {"류진", "예지", "지수", "채령", "유나"};
//
//        for(String member : idol){
//            System.out.println(member);
//        }
//
//        //while, dowhile
//        //dowhile은 메뉴처리할 때 많이 사용한다.
//        Scanner scanner = new Scanner(System.in);
//        int menu = 0;
//
//        do{
//            System.out.println("<< 간식 선택 >>");
//            System.out.println("<< 1. 치킨 >>");
//            System.out.println("2. 냉면");
//            System.out.println("3. 피자");
//            System.out.print("메뉴 선택 => ");
//
//            menu = scanner.nextInt();
//
//            switch (menu) {
//                case 1 :
//                    System.out.println("치킨");
//                    break;
//                case 2 :
//                    System.out.println("냉면");
//                    break;
//                case 3 :
//                    System.out.println("피자");
//                    break;
//                case 9 :
//                    System.out.println("Bye");
//                    scanner.close();
//                    break;
//                default :
//                    System.out.println("없는 메뉴입니다");
//            }
//        }while(menu != 9){
//
//        }
//
//
//
//    }
//}

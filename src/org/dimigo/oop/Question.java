package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        int exit = 0;
        int num=0;
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        String asw;

        String[] question = {
                "가장 좋아하는 가수는? ",
                "가장 좋아하는 배우는? ",
                "가장 좋아하는 과목은? "
        };
        String[] answer = {
                "아이유",
                "원빈",
                "자료구조"
        };

        while(true){
            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.printf("메뉴 선택 => ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    num = new Random().nextInt(3);
                    System.out.println(question[num]);
                    asw = scanner.next();
                    if(answer[num].equals(asw)){
                        System.out.println("정답입니다!");
                    }else{
                        System.out.println("틀렸습니다!");
                    }
                    break;

                case 2:
                    StringBuilder sb = new StringBuilder();
                    sb.append(question[0]).append(answer[0]).append("입니다\n");
                    sb.append(question[1]).append(answer[1]).append("입니다\n");
                    sb.append(question[2]).append(answer[2]).append("입니다\n");
                    System.out.println(sb);
                    break;
                case 9:
                    System.out.println("Bye~");
                    exit++;
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
            }

            if(exit>0) break;
        }
    }
}

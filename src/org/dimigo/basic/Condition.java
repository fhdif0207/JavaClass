package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        String[] character = {"마법사", "농부", "영주", "기사"};
        int exit = 0;
        int num = new Random().nextInt(4);
        int i = 0;
        int menu = 0;
        int gong = 100;
        Scanner scanner = new Scanner(System.in);


        System.out.println("<< 게임 메뉴 >>");
        System.out.println("1. 캐릭터 설정");
        System.out.println("2. 공격력 증가");
        System.out.println("3. 공격력 감소");
        System.out.println("9. 종료");
        System.out.println("--------------------");
        System.out.print("메뉴 입력 => ");

        while(true){

            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    num = new Random().nextInt(4);
                    System.out.println(character[num] + "(으)로 설정되었습니다.");
                    i++;
                    break;
                case 2:
                    if(i>0) {
                        gong+=10;
                        System.out.println("현재 공격력: " + gong);
                    }
                    else{
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                    }
                    break;
                case 3:
                    if(i>0) {
                        gong-=10;
                        System.out.println("마법사 공격력이 감소되었습니다. 현재 공격력 : " + gong);
                    }
                    else{
                        System.out.println("캐릭터를 먼저 선택해주세요");
                    }
                    break;
                case 9:
                    System.out.println("이제 공부하세요!!");
                    exit++;
                    break;
                default:
                    System.out.println("없는 메뉴입니다!!");
            }
            if(exit>0) break;
        }
    }
}

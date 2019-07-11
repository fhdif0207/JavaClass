package org.dimigo.oop;

public class Calculator2 {
    //정적(static)필드
    public static double PI = 3.141592;

    //인스턴스 필드
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator2(){

    }

    public Calculator2(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void powerOn(){
        if(powerFlag == false){
            System.out.println("전원을 켭니다");
            powerFlag = true;
        }
    }

    public void powerOff(){
        if(powerFlag) {
            System.out.println("전원을 끕니다");
            powerFlag = false;
        }
    }
//정적 메소드
    public static int add(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 + num2;
    }
    public static int sub(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 - num2;
    }
    public static int mul(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 * num2;
    }public static double div(int num1, int num2, Calculator2 c){
        c.powerOn();
        return (double)num1 / num2;
    }

}
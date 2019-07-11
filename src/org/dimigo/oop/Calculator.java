package org.dimigo.oop;

public class Calculator {
    //인스턴스 필드
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator(){

    }

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void powerOn(){
        if(this.powerFlag == false){
            System.out.println("전원을 켭니다");
            this.powerFlag = true;
        }
    }
        //인스턴스 메소드
    public void powerOff(){
        if(this.powerFlag) {
            System.out.println("전원을 끕니다");
            this.powerFlag = false;
        }
    }

    public int add(){
        powerOn();
        return this.num1+this.num2;
    }

    public int sub(){
        powerOn();
        return this.num1-this.num2;
    }

    public int mul(){
        powerOn();
        return this.num1*this.num2;
    }

    public double divide(){
        powerOn();
        return (double)this.num1/this.num2;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(10, 20);
        System.out.println(c.num1);
        System.out.println(c.num2);
        c.powerOn();
    }

}
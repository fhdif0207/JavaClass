package org.dimigo.oop2;

public class Singleton {
    private static Singleton instance; //private --> 외부에서 아무나 못바꾸게 하기위해서
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        else {
            return instance;
        }
        return null;
    }
}

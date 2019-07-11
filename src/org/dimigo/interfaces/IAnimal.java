package org.dimigo.interfaces;

public interface IAnimal {
    //인터페이스안의 필드 = 상수 (자동으로 public static final이 붙는다.)
    String FARM_NAME = "디미 동물농장";

    //인터페이스안의 메소드 = 추상메소드(자동으로 public abstract이 붙는다.)
    //JDK8부터 디폴트 메소드(자동으로 public)
    void eat();
    abstract void sleep();
    public abstract void bark();
}

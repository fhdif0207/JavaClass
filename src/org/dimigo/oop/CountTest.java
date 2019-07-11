package org.dimigo.oop;

import static org.dimigo.oop.Count.*;

public class CountTest {
    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            new Count();
        }
        System.out.println(Count.getCnt());
    }
}

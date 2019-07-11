package org.dimigo.interfaces;

import org.dimigo.abstractclass.Engine;

public class BenzEngine implements IEngine {

    @Override
    public void startEngine() {
        System.out.println("Benz 엔진 가동");
    }

    @Override
    public void stopEngine() {
        System.out.println("Benz 엔진 멈춤");
    }
}

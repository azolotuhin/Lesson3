package com.company;

/**
 * Created by azolotukhin on 21.09.2016.
 */
public class A {
    public U MethodA(){
        U parU = new U() {
            @Override
            public void Method1() {
                System.out.println("Method1");
            }

            @Override
            public void Method2() {
                System.out.println("Method2");
            }

            @Override
            public void Method3() {
                System.out.println("Method3");
            }
        };
        return parU;
    }
}

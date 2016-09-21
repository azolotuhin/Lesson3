package com.company;

import java.util.ArrayList;

/**
 * Created by azolotukhin on 21.09.2016.
 */
public class B {
    private ArrayList us;

    B(){
        us = new ArrayList();
    }

    public void SaveU(U linkU){
        us.add(linkU);
    }
    public void ResetU(int resnum){
        us.remove(resnum);
    }
    public void InvokeAll(){
        U[] arus = (U[]) us.toArray(new U[us.size()]);
        for (int i = 0; i < arus.length; i++){
            System.out.println("ArrayCell #"+i);
            arus[i].Method1();
            arus[i].Method2();
            arus[i].Method3();
        }
    }
}

package com.company;

import java.util.Objects;

/**
 * Created by azolotukhin on 15.09.2016.
 */
public class Processor {
    String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }
}

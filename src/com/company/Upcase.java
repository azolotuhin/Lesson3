package com.company;

/**
 * Created by azolotukhin on 15.09.2016.
 */
public class Upcase extends Processor{
    @Override
    Object process(Object input) {
        return ((String)input).toUpperCase();
    }
}

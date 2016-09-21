package com.company;

/**
 * Created by azolotukhin on 15.09.2016.
 */
public class LowerCase extends Processor {
    @Override
    Object process(Object input) {
        return ((String)input).toLowerCase();
    }

}

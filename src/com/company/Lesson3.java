package com.company;

/**
 * Created by azolotukhin on 15.09.2016.
 */
public class Lesson3 {
    public Lesson3(){}
    public void Lesson(){
        //interfaces
        Processor pr = new Processor();
        System.out.println(pr.name());

        LowerCase lpr = new LowerCase();
        System.out.println(lpr.process(new String("lPr")));

        Upcase upr = new Upcase();
        System.out.println(upr.process(new String("lPr")));

        process(new Upcase(), new String("lPr"));
        process(new LowerCase(), new String("lPr"));
    }

    public static void process(Processor p, Object s){
        p.process(s);
    }
}

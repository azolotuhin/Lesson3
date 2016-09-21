package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lesson3 a = new Lesson3();
        //a.Lesson();
    /*
        Task 1.
        1.1 Take a look on java.util.Scanner class. Make sure you read examples of it's use and what method next() does.
        1.2 Scanner's constructor uses objects that implements Readable interface.
        Please read very short documentation for this Interface and it's only method 'read'.
        1.3 Make your own class (or just take Dog) so that we can pass it as argument.
        1.4 When calling method 'next' for Scanner object created using constructor with Dog argument it should return Dog's legs like these:
        "front-left", "front-right", "hind-right", "hind-left" (order doesn't matter).
    */
        System.out.println("Task 1");
        Scanner sc = new Scanner(new ReadableClass()).useDelimiter(" ");
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();

    /*
    Task 2.
        2.1 Create interface U with three methods.
        2.2 Create class A with method which returns U by creating anonymous inner class.
        2.3 Create class B which has array of U. It also has SaveU method which takes and save link U in the array.
        ResetU method reset link in the array on position specified by argument.
        InvokeAll method goes through the array and invokes all U's methods.
        2.4 In main create several A objects and one B object. Populate B object with U links what were created by A objects.
        Delete few U links from B. Call InvokeAll.
    */
        System.out.println("Task 2");
        A ob1A = new A();
        A ob2A = new A();
        A ob3A = new A();
        B obB = new B();
        obB.SaveU(ob1A.MethodA());
        obB.SaveU(ob2A.MethodA());
        obB.SaveU(ob3A.MethodA());
        obB.ResetU(1);
        obB.InvokeAll();
    }
}

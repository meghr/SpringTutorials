package com.springcore.constructoreinjection;

public class Addition {

    private int a;
    private int b;


    public Addition(double a, double b){
        this.a = (int)a;
        this.b = (int)b;

        System.out.println("Constructor double and double ");
    }

    public Addition(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println("Constructor int and int ");
    }

    public Addition(String  a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);

        System.out.println("Constructor String and String ");
    }

    public void doSum(){
        System.out.println("a value is :" + this.a);
        System.out.println("b value is :" + this.b);
        System.out.println("Sum is :" + (this.a+this.b));
    }
}

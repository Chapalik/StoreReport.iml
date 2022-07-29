package com.company.superTest;

public class A {

    public static final String CONSTANT = "TEST";

    private int a;
    protected int b = 777;

    static {
        System.out.println("A: STATIC BLOCK 1");
    }

    {
        System.out.println("A: NON STATIC BLOCK 1");
    }

    public A(int a, int b) {
        System.out.println("A: CONSTRUCTOR");
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    {
        System.out.println("A: NON STATIC BLOCK 2");
    }

    static {
        System.out.println("A: STATIC BLOCK 2");
    }
}

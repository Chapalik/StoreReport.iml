package com.company.superTest;

public class B extends A {

    public static final String CONSTANT_2 = "TEST";

    static {
        System.out.println("B: STATIC BLOCK 1");
    }

    {
        System.out.println("B: NON STATIC BLOCK 1");
    }
    private int a;
    private int b;

    public B(int a, int b, int aa, int ab) {
        super(aa, ab);
        System.out.println("B: CONSTRUCTOR");
        this.a = a;
        this.b = b;
    }

    public void printAll() {
        System.out.println("B(a=" + this.a + ",b=" + this.b + ") A(a=" + super.getA() + ",b=" + super.b + ")");
    }

    static {
        System.out.println("B: STATIC BLOCK 2");
    }

    {
        System.out.println("B: NON STATIC BLOCK 2");
    }

    @Override
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

package org.example.classloader;

public class Demo1 {
    public static void main(String[] args) {
        MyChild1 myChild1 = new MyChild1();
    }

}

class MyParent1 {
    public static String str = "hello,world";

    static {
        System.out.println("MyParent1 static");
    }
}

class MyChild1 extends MyParent1 {
    public static String str2 = "hello,str2";

    static {
        System.out.println("MyChild1 static");
    }
}
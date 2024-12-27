package org.example.classloader;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(MyParent02.str);
    }
}

class MyParent02 {
    public static final String str = "hello world";

    static {
        System.out.println("MyParent02 static"); // 这句话会输出吗？ 不会
    }
/**
 * final 常量在编译阶段的时候 常量池；
 * 这个代码中将常量放到了 Demo03 的常量池中。之后 Demo02与MyParent02 就没有关系了
 */
}
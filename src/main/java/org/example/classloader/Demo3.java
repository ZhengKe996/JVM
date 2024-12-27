package org.example.classloader;

import java.util.UUID;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(MyParent03.str);

    }
}

class MyParent03 {
    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent02 static"); // 这句话会输出吗？ 会
    }
    /**
     * 当一个常量的值并非编译期间可以确定的，那这个值就不会被方法调用类的常量池中！
     * 程序运行期间的时候，回主动使用常用所在的类
     */
}
package org.example.classloader;

public class Demo4 {
    public static void main(String[] args) {
        Object o = new Object(); // jdk 自带的
        Demo4 demo = new Demo4();  // 实例化一个自己定义的对象
        System.out.println(o.getClass().getClassLoader()); // null
        System.out.println(demo.getClass().getClassLoader()); // AppClassLoader
        System.out.println(demo.getClass().getClassLoader().getParent()); // ExtClassLoader
        System.out.println(demo.getClass().getClassLoader().getParent().getParent()); // null
    }
}

package com.baozengkai;

public class ObjectTest {
    public static void main(String[] args)
    {
        Object o = new Object();
        // 声明为private的变量，不能通过对象变量直接访问
//        System.out.println(o.a);

        // 调用公有成员方法
        System.out.println(o.getA());

        // 静态成员变量
        Object.b = 3;
        System.out.println(Object.b);

        //静态成员常量
//        Object.C = 4; //错误 由final修饰的不可在被赋值
        System.out.println(Object.C);

        //静态成员方法
        Object.print();
        System.out.println(Object.b);
    }
}

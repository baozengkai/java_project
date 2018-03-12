package com.baozengkai;

public class ReflectionDemo {

    public int a = 1;
    protected  String b ="b";
    char sex;
    private String c ="c";

    //无参构造函数
    public ReflectionDemo()
    {
        System.out.println("无参构造函数");
    }

    //有一个参数的构造函数
    public ReflectionDemo(String name)
    {
        System.out.println("姓名" + name);
    }

    protected ReflectionDemo(boolean n)
    {
        System.out.println("受保护的构造函数");
    }

    private  ReflectionDemo(int age)
    {
        System.out.println("私有构造函数");
    }
}

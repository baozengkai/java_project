package com.baozengkai;

/*
1. 成员变量
2. 成员方法
3. 构造函数
4. final修饰成员变量
5. static修饰
    静态成员变量
    静态成员常量(用的比较多，在声明的时候就需要初始化)
6. 无参构造函数
7. 直接初始化
8. 调用同类中的另外一个构造函数
 */
public class Object {
    private final int a;
    public static int b;
    public static final int C = 3;

    public Object()
    {
        a = 2;
    }
    public int getA()
    {
        return a;
    }

    public static void print()
    {
        //a;// 不可使用非static成员变量
        b = 3;
    }

//    public int setA(int a_)
//    {
//        a = a_;
//    }
}


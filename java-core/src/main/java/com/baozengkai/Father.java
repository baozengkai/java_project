package com.baozengkai;

/*
面向对象
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

继承
1.extends
2.类中的重写和重载(覆盖)
3.super关键字和super()函数
4.动态绑定问题
    重写和重载
5.final类和final方法
6.向上转换和向下转换
7.抽象类
 */
public class Father {
    //1.成员变量
    private final int a;
    public static int b;
    public static final int C = 3;

    //3.构造函数
    public Father()
    {
        a =1;
    }

    public Father(int a_)
    {
        a = a_;
    }

    //2.成员方法
    public int getA()
    {
        System.out.println("I am Object.getA()");
        return 0;
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

class Son extends Father{
    private int d =4;

    public Son(int a)
    {
        super(a);
        d = 5;
    }

//    super练习
//    public int getA(){
//        //return d*a;  //错误，因为a是父类中的私有成员，子类不可以访问，只有变成protected或者使用父类中的公有方法获取a值
//        //return d*getA(); //错误，这样又是无限调用自己
//        return d*super.getA(); //成功，使用super明确调用的是父类中的getA()方法
//    }

//    重写(覆盖)父类中的getA方法
//    public int getA()
//    {
//        System.out.println("I am Employee.getA()");
//        return 1;
//    }

    //重载父类中的getA方法
    public String getA(int a)
    {
        return "overlord";
    }
}

class Daughter extends Father{
    public Daughter()
    {
    }
}

//class Parent{
//    public void show(){
//        System.out.println("I am father");
//    }
//}
//
//class Son extends Parent {
//    @Override
//    public void show() {
//        System.out.println("I am Son");
//    }
//}
//
//public class Father {
//    public static void main(String[] args) {
//        Parent p = new Son();
//        p.show();
//    }
//}
//


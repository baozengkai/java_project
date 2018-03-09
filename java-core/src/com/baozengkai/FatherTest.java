package com.baozengkai;

public class FatherTest {
    public static void main(String[] args)
    {
//        Object o = new Object();
//        // 声明为private的变量，不能通过对象变量直接访问
////        System.out.println(o.a);
//
//        // 调用公有成员方法
//        System.out.println(o.getA());
//
//        // 静态成员变量
//        Object.b = 3;
//        System.out.println(Object.b);
//
//        //静态成员常量
////        Object.C = 4; //错误 由final修饰的不可在被赋值
//        System.out.println(Object.C);
//
//        //静态成员方法
//        Object.print();
//        System.out.println(Object.b);

        //动态绑定
        //重写测试:由于子类getA()方法重写了父类的该方法，所以会发生动态绑定，根据对象的实际类型来调用
//        Father o = new Son(1);
//        o.getA();
        //重载测试
        //o.getA(2);//发生错误，因为重载是发生静态时期的，o是Father类型的，没有子类重载函数。

        //向上转换
//        Father f = new Son(2);//子类引用赋给父类变量，发生向上转换
//        f.getA();  //调用的子类中的重写方法

        //向下转换
        //1) 这种方式的向下转换(不符合规则，需要保证父类变量是子类的实例)
//        Father f1 = new Father(3);
//        Son s1 = (Son)f1;

        //2) 这种方式的向下转换是成功的
//        Father f1 = new Daughter();
//        if(f1 instanceof Son) {
//            Son s1 = (Son) f1;
//            s1.getA();
//            s1.getA(2);
//        }
        int b =3;
        Object o = b;
        System.out.println(o);
        Object oo = new Son(3);
        Son s = (Son)oo;
        System.out.println(oo.toString());
    }
}

package com.baozengkai;
/*
内部类:
    1. 成员内部类
    2. 方法内部类
    3. 静态内部类
    4. 匿名内部类
    5. 为什么要使用内部类
 */

// 1.成员内部类
//      1.1 内部类可以使用外部类的私有变量和方法
//      1.2 外部类访问内部类,需要创建一个内部类对象
// 2.方法内部类
//      2.1 内部类可以访问到外部类的私有变量和方法
//      2.2 内部类相当于局部变量，不能有修饰符修饰
//      2.3 内部类只能访问final定义的形参
// 3.静态内部类
//      3.1 静态内部类只能调用外部类的static变量或方法
//      3.2 静态内部类可以直接通过类名创建对象
// 4.匿名内部类

//class Outter{
//    private int age = 24;
//    private Inner i = new Inner();
//
//    public void test(){
//        i.age = 13;
//    }
//
//    private class Inner{
//        private int age = 25;
//        public void print(){
//            int age = 12;
//            System.out.println("局部变量: " + age);
//            System.out.println("内部类变量" + this.age);
//            //1.1 内部类可以使用外部类的私有变量和方法
//            System.out.println("外部类变量 "+ Outter.this.age);
//        }
//    }
//}

//class Outter{
//    private int age =24;
//
//    public void print(final int tmp){
//        class Inner{
//            public void inPrint(){
//                System.out.println(tmp);
//                System.out.println(age);
//            }
//        }
//        new Inner().inPrint();
//    }
//
//}

//class Outter{
//    private String name = "xiaobao";
//    private static int age = 12;
//
//    static class Inner{
//        public void print(){
//            // 3.1 不能访问非static成员
//            System.out.println(name);
//            System.out.println(age);
//        }
//    }
//}
//
//public class InnerClass {
//    public static void main(String[] args) {
//        // 1.成员内部类
////        Outter out = new Outter();
////        Outter.Inner in = out.new Inner();
////        in.print();
//
//        // 2.方法内部类
////        Outter out = new Outter();
////        out.print(10);
//
//        // 3. 静态内部类
//        Outter.Inner in = new Outter.Inner();
//        in.print();
//    }
//}

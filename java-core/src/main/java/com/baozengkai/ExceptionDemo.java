package com.baozengkai;

/**
 * 异常:
 *    1.抛出异常的三种形式
 *        1) 系统自动抛出异常
 *        2) 程序员主动抛出异常throw
 *        3) throws抛出异常声明
 *    2.异常处理
 *        try catch
 *    3.自定义异常类
 *    4.异常与记录日志
 *    5.练习
 * @author baokai
 */
public class ExceptionDemo {

    /**
     * 2.异常处理
     */
    void testTry() {
        int a = 3;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (RuntimeException e)
        {
            System.out.println();
        } catch (Exception e)
        {
            System.out.println();
        }
        System.out.println("I am the after of Exception");
    }

    /**
     * 1.抛出异常
     * @throws ArithmeticException
     */
    public void devide() throws  ArithmeticException
    {
        // 1.1 系统自动抛出异常
//        int a = 5;
//        int b = 0;
//        System.out.println(a/b);

        /* 1.2 程序员主动抛出异常对象 */
        int a = 5;
        int b = 0;
        if (b == 0)
        {
            throw new ArithmeticException();
        } else{
            System.out.println(a / b);
        }

        //1.3 throws抛出异常的声明
//        int a =5;
//        int b =0;
//        System.out.println(a/b);
    }

//    public static void main(String[] args)
//    {
////        ExceptionDemo exDemo = new ExceptionDemo();
////        exDemo.testTry();
//        ExceptionDemo ex = new ExceptionDemo();
//        try {
//            ex.devide();
//        }catch(ArithmeticException e)
//        {
////            e.printStackTrace();
//            System.out.println("我是被0整除的错误");
//        }
//        // 3. 自定义异常类
////        String s = "a";
////        if (s.equals("a"))
////        {
////            throw new MyException("发生自定义异常啦");
////        }
//    }
    public void arrayExceptionDemo() throws ArrayIndexOutOfBoundsException {
        int a[] = {1, 2, 3};
        for (int i =0; i < 4; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 5.练习题
     */
    public static void main(String[] args) {
        /*
         5.1 编写一个类，在其main方法的try块中抛出一个Exception类型的异常，
         传递一个字符串参数给Exception的构造器，在catch子句中捕获此异常对象，并打印字符串参数
         添加一个finally子句，打印一条信息证明确实得到了执行
         */
//        try {
//            throw new Exception("originated in main()");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("I am the watcher");
//        }

        /*
         5.2 编写能够产生并能捕获ArrayIndexOfBoundsException异常的代码
         */
//        ExceptionDemo exDemo = new ExceptionDemo();
//        try {
//            exDemo.arrayExceptionDemo();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
    }
}



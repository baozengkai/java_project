package com.baozengkai;

import java.awt.*;

/*
 异常:
    抛出异常的三种形式
        1) 系统自动抛出异常
        2) 程序员主动抛出异常throw
        3) throws抛出异常声明
    异常处理
        try...catch...finally
    自定义异常类

 */
public class Exception {

    public void devide() throws ArithmeticException
    {
        // 1.1 系统自动抛出异常
//        int a = 5;
//        int b = 0;
//        System.out.println(a/b);

        // 1.2 程序员主动抛出异常对象
        int a =5;
        int b =0;
        if (b==0)
        {
            throw new ArithmeticException();
        }else{
            System.out.println(a/b);
        }

        //1.3 throws抛出异常的声明
//        int a =5;
//        int b =0;
//        System.out.println(a/b);
    }
    public static void main(String[] args)
    {
//        Exception ex = new Exception();
//        try {
//            ex.devide();
//        }catch(ArithmeticException e)
//        {
////            e.printStackTrace();
//            System.out.println("我是被0整除的错误");
//        }
        //3. 自定义异常类
        String s ="a";
        if (s.equals("a"))
        {
            throw new MyException("发生自定义异常啦");
        }
    }
}



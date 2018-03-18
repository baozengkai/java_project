package com.baozengkai;

/*
多线程
    进程和线程的概念
    实现多线程的两种方法
        继承Thread类
        实现Runnable接口

 */
public class ThreadTest  extends Thread{

    //重写Thread中的run方法
    public void run()
    {
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i + "");
        }
    }

    public static void main(String[] args)
    {
        ThreadTest thr1 = new ThreadTest();
        thr1.setName("继承Thread类的线程");

        RunnableTest runnable = new RunnableTest();
        Thread thr2 = new Thread(runnable);
        thr2.setName("实现Runnable接口的线程");

        //调用start方法，线程进入到Runnable状态，等待被调用
        thr1.start();
        thr2.start();

        System.out.println(Thread.currentThread().getName());
    }
}

class RunnableTest implements Runnable{

    public void run() {
        for(int i = 0 ; i<100 ; i++) {
            System.out.println(Thread.currentThread().getName()+""+i+"");
        }
    }
}

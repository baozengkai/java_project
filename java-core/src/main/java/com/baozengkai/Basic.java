package com.baozengkai;

import org.json.JSONObject;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
1.java的类命名是驼峰命名法，一般是大写字母开头，如果有多个单词，那么就是多个字母的单词开头大写。
2.在java中，boolean类型有true和false，注意一点，数值型和boolean型不能相互转换。
3.常量，使用final定义，赋值好之后不能再更改。
4.类常量,使用static final定义，场景:在类中定义一个常量，在类的多个方法中都可以使用。
5.显示类型转换
6.强制类型转换
7.字符串类型:
    子串方法
    关于字符串不可变性:创建的字符串的内容不可以改变，表面上改变的是引用对象的改变，引用对象这个变量存放的是对象的地址，
        这个引用对象是可以改变的，但是引用对象指向的对象是不可以改变的。一是安全，确保在多线程访问的时候，不会被有的线程
        改变，二是效率。
    检测字符串是否相等: equals()方法，一定不能用==来判断(python可以)
    判断一个字符串不是null也不是空串
    构建高效率字符串
8.读取输入、格式化输出
    读取输入
    格式化输出
    文件输入输出(待定学习)
9.流程控制
    switch控制
10.数组：java中的数组跟C++的不同，java中的数组本身都存放在堆中，数组名这个引用存放在栈上。而C++是可以存放在堆，也可以存放在栈。
    声明创建数组第一种形式
    声明初始化数组第二种形式
    初始值验证：数字数组，初始化为0 boolean数组初始化为false 对象数组初始化为null
    for each遍历循环
    数组拷贝
    数组排序
    多维数组(待定学习)
11.可变参数
12.静态代码块
    static{
    }
    在类加载的时候就会被执行，仅会执行一次

 */
public class Basic {

    //4.类常量，用于在类中的多个方法中都使用
//    public static final int b = 2;

    //11.可变参数
//    public void args_function(int... args)
//    {
//        for(int i:args)
//        {
//            System.out.println(i);
//        }
//    }

    //12. 静态代码块
    static{
        System.out.println("我是静态代码块代码");
    }

    public static void main(String[] args){

//        ArrayList as = new ArrayList();
//        as.add("{操作=10025}");
//        System.out.println(JSONObject.valueToString(as.get(0)));
        // 2. boolean和数值型不能相互转换
//        boolean bool = true;
//        bool = 1;

        // 3. 指示一个常量，常量在被赋值一次之后，之后不能改变
//        final int a = 1;
//        a = 2;

        //5.数值类型转换 byte-->short
//        byte b = 12;
//        short st = 15;
//        st = b;
//
//        int i = 65;
//        char c;
//        c = (char)i;
//
//        int ii =  123456789;
//        float f = ii;

        //6.强制类型转换
//        float f=1.2f;
//        int i = (int)f;

        //7.字符串类型
        //7.1 子串
//        String greeting = "hello world";
//        String s =greeting.substring(0,3);

        //7.2 不可变性
//        greeting = "123";

        //7.3 判断相等性
//        String s1 = "xiaobao";
//        String s2 = "xiaobao";
//
//        String s3 = new String("xiaoya");
//        String s4 = new String("xiaoya");

        //7.4 判断字符串既不是null也不是空串
//        String str="ok";
//        if(str !=null && str.length() != 0)
//            System.out.println("ok");

        //7.5 构建字符串
//        StringBuilder builder = new StringBuilder();
//        builder.append("xiao");
//        builder.append("bao");
//        String completeString = builder.toString();

        //8.读取输入、格式化输出
        //8.1循环接收输入
//        Scanner in = new Scanner(System.in);
//        while (true)
//        {
//            String line = in.nextLine();
//            if (line.equals(".")){
//                break;
//            }
//            System.out.println(line);
//        }
        //8.2 格式化输出
//        String name = "xiaobao";
//        System.out.println(String.format("My name is: %s",name));

        //8.3 文件的输入和输出(暂时不学)

        //9.流程控制
        //9.1 Switch
//        Scanner in =new Scanner(System.in);
//        int choice = in.nextInt();
//        switch (choice)
//        {
//            case 1:
//                //
//            case 2:
//                //
//            default:
//                break;
//        }
        //10.数组
        //10.1 声明及创建数组第一种形式
//        int[] a =new int[5];
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(a[i]);
//        }
        //10.2 声明及初始化数组第二种形式
//        int [] a = {1,2,3};
//        System.out.println(a[0]);

        //10.3 初始化数组验证
//        String[] names = new String[5];
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(names[i]);
//        }

        //10.4 for each遍历循环
//        int[] a = new int[5];
//        for(int i:a)
//        {
//            System.out.println(i);
//        }
        //10.5 数组拷贝
//        int[] a = {1,2,3};
//        int[] b = a;
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//
//        int[] c = Arrays.copyOf(a,a.length);
//        System.out.println(c.hashCode());

        //10.6 数组排序
//        int[] a = {4,1,2,3};
//        Arrays.sort(a);
//        for(int i=0;i<4;i++)
//        {
//            System.out.println(a[i]);
//        }

        //11.可变参数
//        Basic b = new Basic();
//        b.args_function(1,2,3);
        //0.测试
//        System.out.println("hello xiaobao"+a);
//        System.out.println("hello xiaobao"+b);
//        System.out.println(c);
//        System.out.println(f);
//        System.out.println(i);
//        System.out.println(s);
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s1==s2);
//
//        System.out.println(s3==s4);
//        System.out.println(s3.equals(s4));
//        System.out.println(completeString);
    }
}

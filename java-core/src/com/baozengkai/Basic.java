package com.baozengkai;

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
 */
public class Basic {

    //4.类常量，用于在类中的多个方法中都使用
    public static final int b = 2;
    public static void main(String[] args){

        // 2. boolean和数值型不能相互转换
//        boolean bool = true;
//        bool = 1;

        // 3. 指示一个常量，常量在被赋值一次之后，之后不能改变
        final int a = 1;
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
        StringBuilder builder = new StringBuilder();
        builder.append("xiao");
        builder.append("bao");
        String completeString = builder.toString();

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
        System.out.println(completeString);
    }
}

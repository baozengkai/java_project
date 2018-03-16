package com.baozengkai;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/*
泛型
    1. 不使用泛型的list
    2. 使用泛型的list
    3. 泛型的使用
        3.1 泛型类
        3.2 泛型接口
        3.3 泛型方法
            3.3.1 定义在普通类中的泛型方法
            3.3.2 定义在泛型类中的泛型方法
    4. 类型变量的约束
    5. 需要注意的点
           5.1 静态实例、静态方法与泛型
    6. 泛型通配符

 */
//3.1泛型类
//public class Generic <T>{
//    //3.1 泛型类
//    public T value;
//    public Generic(T value)
//    {
//        this.value = value;
//    }
//
//    public void setValue(T value)
//    {
//        this.value = value;
//    }
//    public T getValue()
//    {
//        return this.value;
//    }
//    public static void main(String[] args) {
//        // 1.不使用泛型的list
////        List a = new ArrayList();
////        a.add(1);
////        a.add(1.2);
////
////        int i1 = (Integer) a.get(0);
////        int i2 = (Integer) a.get(1);
//
//        //2.使用泛型的list
////        List<Integer> a = new ArrayList<Integer>();
////        a.add(1);
////        a.add(1.1); //发生错误，类型检查
////
////        int i1 = a.get(0);
//
//        //3.1 泛型类的调用
////        Generic<String> g1 = new Generic<String>("xiaobao");
////        System.out.println(g1.getValue());
////
////        Generic<Double> g2 = new Generic<Double>(25.0);
////        System.out.println(g2.getValue());
////
////        Generic g3 = new Generic(25);
////        g3.setValue("123");
////        System.out.println(g3.getValue());
//    }
//}

//3.2.1 未传入泛型实参的实现泛型接口类
//public class Generic<T> implements Generator<T>
//{
//    public T next()
//    {
//        return null;
//    }
//}

//3.2.1 传入泛型实参的实现泛型接口类
//public class Generic implements Generator<String>{
//
//    public String value ="xiaobao";
//    public String next()
//    {
//            return this.value;
//    }
//}

//3.3.1 定义在普通类中的泛型方法
//public class Generic
//{
//    public static <T> void getValue(T... args)
//    {
//        for(T i:args)
//        {
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        getValue(1,"1",3);
//    }
//}

//3.3.2 定义在泛型类中的泛型方法
//public class Generic<T>
//{
//    public T value;
//    public void setValue(T value)
//    {
//        this.value = value;
//    }
//    public T show_Generic_value(T value)
//    {
//       return this.value;
//    }
//
//    //定义泛型类中的泛型方法 这个类型可以与泛型类中的不同
//    public <E> E show_method(E value)
//    {
//        return value;
//    }
//
//    public static void main(String[] args)
//    {
//        Generic<String> g = new Generic<String>();
//        //调用了泛型类中的方法
//        g.setValue("xiaobao");
//
//        //调用了泛型类中的泛型方法
//        System.out.println(g.show_method(123));
//    }
//}

//4.类型变量的约束
//public class Generic
//{
//    public static<T extends Comparable> T min(T[] a)
//    {
//        T min = a[0];
//        for(int i = 1;i<a.length;i++)
//        {
//            if(min.compareTo(a[i]) > 0)
//            {
//                min = a[i];
//            }
//        }
//        return min;
//    }
//}

//5.1 静态方法与泛型
public class Generic<T>
{
    //5.1.1 静态实例和静态方法尝试使用类上的泛型变量
//    public static T value;
//    public static T static_method(T value)
//    {
//        return value;
//    }

    //5.1.2 如果静态方法要使用泛型变量，需要将自身变成静态泛型方法 而静态实例禁止使用
    public static T value;
    public static<T> T static_method(T value)
    {
        return value;
    }
}

//6. 泛型通配符

package com.baozengkai;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/** 泛型
 *      1. 泛型出现之前的容器和泛型出现之后的容器
 *      2. 不使用泛型的list和使用泛型的list
 *      3. 泛型的使用
 *          3.1 泛型类
 *          3.2 泛型接口
 *          3.3 泛型方法
 *              3.3.1 定义在普通类中的泛型方法
 *              3.3.2 定义在泛型类中的泛型方法
 *      4. 类型变量的约束
 *      5. 需要注意的点
 *          5.1 静态实例、静态方法与泛型
 *      6. 向上转型用于泛型中
 *      7. 细节
 *          7.1 元组类库
 *          7.2 泛型接口之生成器(Generator)
 *          7.3 泛型方法与可变参数
 *      8.问题
 *          8.1 任何基本类型不能作为类型参数
 * @author baokai
 */

// 1.1泛型出现之前的容器
//class Automobile {}
//
//public class Generic {
//    private Object a;
//    public Generic(Object a) {
//        this.a = a;
//    }
//    public void set(Object a) {
//        this.a = a;
//    }
//    public Object get() {
//        return a;
//    }
//
//    public static void main(String[] args) {
//
//        // 存放Automobile类对象
//        Generic g = new Generic(new Automobile());
//        Automobile auto = (Automobile)g.get();
//
//        // 存放String类对象
//        g.set("I am String");
//        String s = (String)g.get();
//
//        // 存放Integer类对象
//        g.set(1);
//        Integer x = (Integer)g.get();
//    }
//}

// 1.2泛型出现之后的容器
//class Automobile {}
//
//public class Generic<T> {
//    private T a;
//    public Generic(T a) {
//        this.a = a;
//    }
//    public void set(T a) {
//        this.a = a;
//    }
//    public T get() {
//        return a;
//    }
//
//    public static void main(String[] args) {
//
//        // 存放Automobile类对象
//        Generic<Automobile> g = new Generic<Automobile>(new Automobile());
//        Automobile auto = g.get();
//    }
//}

// 3.1泛型类
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

// 4.类型变量的约束
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

// 5.1静态方法与泛型
//public class Generic<T>
//{
//    //5.1.1 静态实例和静态方法尝试使用类上的泛型变量
////    public static T value;
////    public static T static_method(T value)
////    {
////        return value;
////    }
//
//    //5.1.2 如果静态方法要使用泛型变量，需要将自身变成静态泛型方法 而静态实例禁止使用
////    public static T value;
//    public static<T> T static_method(T value)
//    {
//        return value;
//    }
//}

// 6.向上转型用于泛型中
//class Food{ }
//class Chicken extends Food{}
//class Dark extends Food{}
//
//public class Generic{
//    public static void main(String[] args){
//        ArrayList<Food> f = new ArrayList<Food>();
//        f.add(new Chicken());
//        f.add(new Dark());
//    }
//}

// 7.细节
// 7.1元组类库(数据传送对象、信使)
//class twoTuple<A,B> {
//
//    // public保证可以被外界访问到该对象 final保证不会被改变
//    public final A a;
//    public final B b;
//    public twoTuple(A a, B b) {
//        this.a = a;
//        this.b = b;
//    }
//    @Override
//    public String toString() {
//        return "" + a + ", " + b + "";
//    }
//}
//
//class threeTuple<A, B, C> extends twoTuple<A,B> {
//    public final C c;
//    public threeTuple(A a, B b, C c) {
//        super(a,b);
//        this.c = c;
//    }
//    @Override
//    public String toString() {
//        return "" + a + ", " + b + ", "  + c + "";
//    }
//}
//
//class Generic {
//    static twoTuple<String, Integer> f() {
//        return new twoTuple<String, Integer>("xiaobao", 25);
//    }
//
//    static threeTuple<String, Integer, String> g() {
//        return new threeTuple<String, Integer, String>("xiaoya", 25, "Programmer");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(f());
//        System.out.println(g());
//    }
//}

// 7.2泛型接口之生成器(generator)
//class Coffee{
//    private static long counter = 0;
//    private final long id =counter++;
//    @Override
//    public String toString() {
//        return getClass().getSimpleName()+ "" + id;
//    }
//}
//
//class Water extends Coffee {}
//
//public class Generic implements Generator<Coffee> {
//
//    private Class[] types = {Water.class};
//
//    // 空的构造函数
//    public Generic(){
//    }
//    Class c = Water.class;
//
//    private int size = 0;
//    @Override
//    public Coffee next () {
//        try {
//            return (Coffee)types[0].newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        Generic gen = new Generic();
//        gen.next();
//    }
//}

// 7.3泛型方法与可变参数
//public class Generic {
//
//    // 泛型方法和可变参数args
//    static <T>  List<T> printMsg(T... args){
//        List<T> tmp = new ArrayList<>();
//        for(T item : args) {
//            tmp.add(item);
//        }
//        return tmp;
//    }
//
//    public static void main(String[] args) {
//        List<String> result = printMsg("a","b","c");
//        System.out.println(result);
//    }
//}

// 8.注意
// 8.1 任何基本类型都不能作为类型参数

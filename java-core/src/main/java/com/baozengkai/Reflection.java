package com.baozengkai;
import java.lang.Exception;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
反射
    1.获取Class对象的三种方式
        1) 通过Object-->getClass()
        2) 任何数据类型(包括基本类型)都有一个静态的class属性
    2. 获取类的构造函数
    3. 获取类的成员变量
 */
public class Reflection {
    public static void main(String[] args)
    {
//-----------------------获取Class对象的三种方式--------------------------------------
        //1.1 通过Object-->getClass()
//        Reflection re = new Reflection(); //一new， 产生了Reflection对象和Class对象
//        Class reClass = re.getClass(); //获取Class对象
//        System.out.println(reClass.getName()); //打印该Class对象的名称
//
//        //1.2 任何数据类型(包括基本类型)都有一个静态的class属性
//        Class reClass2 = Reflection.class;
//        System.out.println(reClass.equals(reClass2));

        //1.3 利用Class类的forName方法
//        try {
//            Class reClass3 = Class.forName("com.baozengkai.Reflection");
//            System.out.println(reClass3.getName());
//        }catch (ClassNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//---------------------------获取类的构造函数------------------------------------------
//        try {
//            Class stuClass = Class.forName("com.baozengkai.ReflectionDemo");
//
//            //2.1 获取所有公有的构造函数
//            Constructor[] conStu = stuClass.getConstructors();
//            for(Constructor c : conStu)
//            {
//                System.out.println(c);
//            }
//
//            //2.2 获取所有私有、受保护、公有构造函数
//            Constructor[] conStu2 = stuClass.getDeclaredConstructors();
//            for(Constructor c : conStu2)
//            {
//                System.out.println(c);
//            }
//
//            //2.3 调用公有无参构造函数
//            Constructor conStu3 = stuClass.getConstructor(null);
//            conStu3.newInstance();
//
//            //2.4 调用私有构造函数
//            Constructor conStu4 = stuClass.getDeclaredConstructor(int.class);
//            System.out.println(conStu4);
//
//            conStu4.setAccessible(true);
//            conStu4.newInstance(2);
//        }
//        catch(ClassNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        catch (NoSuchMethodException e)
//        {
//            e.printStackTrace();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//----------------------------获取成员变量并调用---------------------------------------------
        try{
            Class stuField = Class.forName("com.baozengkai.ReflectionDemo");

            //3.1 获取类的公有成员变量
            Field[] f1 = stuField.getFields();
            for(Field f : f1)
            {
                System.out.println(f);
            }

            //3.2 获取类的全部成员变量
            Field[] f2 = stuField.getDeclaredFields();
            for(Field f : f2)
            {
                System.out.println(f);
            }

            //3.3 获取并调用类的公有成员变量
            Field f3 = stuField.getField("a");
            System.out.println(f3);

            Object obj = stuField.getConstructor().newInstance();//相当于Object o = new ReflectionDemo()
            f3.set(obj,2);
            ReflectionDemo re = (ReflectionDemo)obj;
            System.out.println(re.a);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

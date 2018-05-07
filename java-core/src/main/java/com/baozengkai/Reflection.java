package com.baozengkai;

import org.apache.log4j.ConsoleAppender;

import java.lang.Exception;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/**
 * 一:为什么需要RTTI
 *  RTTI是实现多态的基础。当你new一个子类的对象给父类引用时，JVM内存会维护子类的对象和子类Class的对象，从而通过Class对象了解到p指向的是子类的对象
 * 二:反射
 *  1.获取Class对象的三种方式
 *      1) 通过Object-->getClass()
 *      2) 任何数据类型(包括基本类型)都有一个静态的class属性
 *  2. 获取类的构造函数
 *  3. 获取类的成员变量
 * 三:获取Class对象
 *  1.Class.forname("XXX")
 *  2.obj.getClass()
 *
 * Practice:
 *  1.关于利用Class对象
 *      1.1 getName() 获取到该Class对象的名称
 *      1.2 isInterFace() 判断其Class对象的原始对象是不是一个接口
 *      1.3 getSimpleName() getCanonicalName() 获取不包含包名的名称和获取包含包名的名称
 *      1.4 getInterfaces() 获取该Class对象的原始对象的接口的Class对象组
 *      1.5 getSuperClass() 获取该Class对象的基类的Class对象引用
 *      1.6 newInstance() 利用该Class对象初始化原始对象实例
 *  2.关于类名.class获取Class对象
 *      2.1 static final 是编译器常量，这个值不需要对Intable1类进行初始化就可以被读取
 *      2.2 如果一个static域不是final的，那么在对它进行访问时，总会要求在读取之前，执行链接和初始化
 *  3.反射
 * @author baokai
 */

//------------------------------------------学习区----------------------------------------------------------------------

//public class Reflection {
//    public static void main(String[] args)
//    {
////-----------------------获取Class对象的三种方式--------------------------------------
//        //1.1 通过Object-->getClass()
////        Reflection re = new Reflection(); //一new， 产生了Reflection对象和Class对象
////        Class reClass = re.getClass(); //获取Class对象
////        System.out.println(reClass.getName()); //打印该Class对象的名称
////
////        //1.2 任何数据类型(包括基本类型)都有一个静态的class属性
////        Class reClass2 = Reflection.class;
////        System.out.println(reClass.equals(reClass2));
//
//        //1.3 利用Class类的forName方法
////        try {
////            Class reClass3 = Class.forName("com.baozengkai.Reflection");
////            System.out.println(reClass3.getName());
////        }catch (ClassNotFoundException e)
////        {
////            e.printStackTrace();
////        }
////---------------------------获取类的构造函数------------------------------------------
////        try {
////            Class stuClass = Class.forName("com.baozengkai.ReflectionDemo");
////
////            //2.1 获取所有公有的构造函数
////            Constructor[] conStu = stuClass.getConstructors();
////            for(Constructor c : conStu)
////            {
////                System.out.println(c);
////            }
////
////            //2.2 获取所有私有、受保护、公有构造函数
////            Constructor[] conStu2 = stuClass.getDeclaredConstructors();
////            for(Constructor c : conStu2)
////            {
////                System.out.println(c);
////            }
////
////            //2.3 调用公有无参构造函数
////            Constructor conStu3 = stuClass.getConstructor(null);
////            conStu3.newInstance();
////
////            //2.4 调用私有构造函数
////            Constructor conStu4 = stuClass.getDeclaredConstructor(int.class);
////            System.out.println(conStu4);
////
////            conStu4.setAccessible(true);
////            conStu4.newInstance(2);
////        }
////        catch(ClassNotFoundException e)
////        {
////            e.printStackTrace();
////        }
////        catch (NoSuchMethodException e)
////        {
////            e.printStackTrace();
////        }
////        catch (Exception e)
////        {
////            e.printStackTrace();
////        }
////----------------------------获取成员变量并调用---------------------------------------------
////        try{
////            Class stuField = Class.forName("com.baozengkai.ReflectionDemo");
////
////            //3.1 获取类的公有成员变量
////            Field[] f1 = stuField.getFields();
////            for(Field f : f1)
////            {
////                System.out.println(f);
////            }
////
////            //3.2 获取类的全部成员变量
////            Field[] f2 = stuField.getDeclaredFields();
////            for(Field f : f2)
////            {
////                System.out.println(f);
////            }
////
////            //3.3 获取并调用类的公有成员变量
////            Field f3 = stuField.getField("a");
////            System.out.println(f3);
////
////            Object obj = stuField.getConstructor().newInstance();//相当于Object o = new ReflectionDemo()
////            f3.set(obj,2);
////            ReflectionDemo re = (ReflectionDemo)obj;
////            System.out.println(re.a);
////        }
////        catch (Exception e){
////            e.printStackTrace();
////        }
//
//
//        // 3.1 Class.forName("XXX")的验证
////        try {
////            Class cc = Class.forName("com.baozengkai.ReflectionTest");
////            System.out.println(cc);
////        } catch(ClassNotFoundException e) {
////            System.out.println("Could not find ReflectionTest Class");
////        }
//
//        // 3.2 obj.getClass()的验证
//        ReflectionTest rt = new ReflectionTest();
//        Class gcc = rt.getClass();
//        System.out.println(gcc);
//
//    }
//}
//class ReflectionTest{
//    public ReflectionTest(){
//        System.out.println("---构造函数---");
//    }
//
//    static{
//        System.out.println("---静态参数初始化---");
//    }
//
//    {
//        System.out.println("---非静态参数初始化---");
//    }
//}

//------------------------------------------练习区----------------------------------------------------------------------

    // 1 关于Class对象的练习
//interface red {}
//interface blue {}
//
//class Toy {
//    Toy() {}
//    Toy(int i) {}
//}
//
//class FancyToy extends Toy implements red,blue {
//    FancyToy() {
//        super(1);
//    }
//}
//
//public class Reflection {
//    static void printInfo(Class cc) {
//        System.out.println("Class Name:" + cc.getName() + ", is interface? [" + cc.isInterface() + "]");
//        System.out.println("Simple Name:" + cc.getSimpleName());
//        System.out.println("Canonical Name:" + cc.getCanonicalName());
//    }
//
//    public static void main(String[] args) {
//        Class c = null;
//        try {
//            c = Class.forName("com.baozengkai.FancyToy");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Could not find FancyToy");
//            System.exit(1);
//        }
//        printInfo(c);
//
//        // 获取该Class对象所有接口的Class对象
//        for (Class face : c.getInterfaces()) {
//            printInfo(face);
//        }
//
//        // 获取该Class对象的基类的Class对象
//        Class base = c.getSuperclass();
//        printInfo(base);
//
//        // 利用Class对象 初始化一个(new)类对象
//        Object obj = null;
//        try {
//            obj = base.newInstance();
//        } catch (InstantiationException e) {
//            System.out.println("Can not Instantiate");
//        } catch (IllegalAccessException e) {
//            System.out.println("Can not access");
//        }
//        printInfo(obj.getClass());
//    }
//}

    // 2. 关于.class获取Class对象
//class Initable1 {
//    static final int staticFinal = 47;
//    static {
//        System.out.println("Initializing Initable1");
//    }
//}
//
//class Initable2 {
//    static int staticNoFinal = 47;
//    static {
//        System.out.println("Initializing Initable2");
//    }
//}
//
//class Reflection {
//    public static void main(String[] args) {
//        Class initable1 = Initable1.class;
//        System.out.println("After creating Initable1");
//        System.out.println(Initable1.staticFinal);
//
//        System.out.println(Initable2.staticNoFinal);
//    }
//}

    // 3. 反射
public class Reflection {
    private static String usage =
            "usage: \n";

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println(usage);
        }
        int lines = 0;
        try{
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor [] con = c.getConstructors();
            if (args.length == 1) {
                for(Method method : methods) {
                    System.out.println(method.toString());
                }
            }
        } catch(ClassNotFoundException e){
            System.out.println("No such Class:"+e);
        }
    }
}


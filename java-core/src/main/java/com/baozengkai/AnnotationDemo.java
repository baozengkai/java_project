package com.baozengkai;

/*
注解
    初识注解
        @Deprecated: 表示该方法或者类已经过期
        @SuppressWarning:表示忽略指定的警告

 */
public class AnnotationDemo {
    @Deprecated
    @SuppressWarnings("uncheck")
    public void testA(){
    }

    public static void main(String[] args)
    {
        AnnotationDemo a = new AnnotationDemo();
        a.testA();

        AnnoationChild ac = new AnnoationChild();
        ac.testA();
    }
}

class AnnoationChild extends AnnotationDemo{

    @Override
    public void testA(){
        System.out.println("I am the child");
    }
}

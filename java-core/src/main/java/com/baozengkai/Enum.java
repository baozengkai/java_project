package com.baozengkai;

/*
枚举
    1.不使用枚举的列子(不使用常量)
    2.使用常量
    3.使用枚举的用法
    4.自定义枚举的用法
 */


import java.lang.reflect.Type;

public class Enum {
//    public static final int VIDEO = 1;//表示视频
//    public static final int AUDIO = 2;//表示音频
//    public static final int TEXT = 3;//表示文字

    private int id;
//    private int type;
    private TypeEnum type;

    public int getId()
    {
        return id;
    }

    public TypeEnum getType()
    {
        return type;
    }

    public void setId(int id)
    {
        this.id = id;
    }

//    public void setType(int type)
//    {
//        this.type = type;
//    }
    public void setType(TypeEnum type)
    {
        this.type = type;
    }

    public static void main(String[] args)
    {
        //不使用常量的用法
//        Enum e = new Enum();
//        e.setId(10);
//        e.setType(2);

        //使用常量的用法
//        Enum e = new Enum();
//        e.setType(Enum.VIDEO);

        //使用枚举的用法
        Enum e = new Enum();
        e.setType(TypeEnum.VIDEO);
        System.out.println(e.getType().getValue());
    }
}


